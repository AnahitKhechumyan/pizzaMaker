package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.ProductType;

import java.util.List;

public interface ProductTypeService {

    ProductType read(int id);

    List<ProductType> readAll();

     ProductType read(String name);

    void create(ProductType productType);

    ProductType update(int id, ProductType productType);

    void delete(int id);
}
