package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.dto.ProductDto;

import java.util.List;

public interface ProductService {

    Product readProduct(int id);

    ProductDto read(int id);

    List<ProductDto> readAll();

    List<ProductDto> readAllByProductType(int productTypeId);


    void create(ProductDto productDto);

    ProductDto update(int id, ProductDto productDto);

    void delete(int id);
}
