package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.ProductType;

import java.util.List;

public interface ProductTypeService {

    ProductType read(int id);

    List<ProductType> readAll();

    void create();

    ProductType update(int id, ProductType producttype);

    void delete(int id);
}
