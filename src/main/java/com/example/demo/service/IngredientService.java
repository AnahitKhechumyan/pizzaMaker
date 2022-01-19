package com.example.demo.service;

import com.example.demo.model.Ingredient;
import com.example.demo.model.Product;

import java.util.List;

public interface IngredientService {
    Ingredient read(int id);



    List<Ingredient> readAll();

    void create();

    Ingredient update(int id, Ingredient ingredient);

    void delete(int id);
}
