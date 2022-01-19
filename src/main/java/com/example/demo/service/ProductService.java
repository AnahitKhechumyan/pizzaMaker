package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.Table;

import java.util.List;

public interface ProductService {
    Product read(int id);

    Product readByProductType(int pruductTypeId);

    List<Product> readAll();

    void create();

    Product update(int id, Product product);

    void delete(int id);
}
