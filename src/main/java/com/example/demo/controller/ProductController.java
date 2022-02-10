package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.model.dto.ProductDto;
import com.example.demo.service.ProductService;
import com.example.demo.service.TableService;
import com.example.demo.service.impl.ProductServiceImpl;
import com.example.demo.service.impl.TableServiceImpl;
import com.example.demo.util.AccessControlOriginFilter;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ProductController extends HttpServlet {
    private final ProductService productService = new ProductServiceImpl();
    private final Gson gson = new Gson();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccessControlOriginFilter.setAccessControlHeaders(resp);
        String url = req.getParameter("url");
        Gson gson = new Gson();
        List<ProductDto> data = new LinkedList<>();

        switch (url) {
            case "get-all-by-product-type":
                int productTypeId = Integer.parseInt(req.getParameter("product_type_id"));
                data.addAll(productService.readAllByProductType(productTypeId));
                break;
            case "get-by-id":

                int id = Integer.parseInt(req.getParameter("product_id"));
                ProductDto product = productService.read(id);
                data.add(product);
                break;

            case "get-all":
                data.addAll(productService.readAll());
                break;
        }

        resp.getWriter().println(gson.toJson(data));
    }

    /*@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }*/

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccessControlOriginFilter.setAccessControlHeaders(resp);

        int id = Integer.parseInt(req.getParameter("id"));
        productService.delete(id);
    }
}
