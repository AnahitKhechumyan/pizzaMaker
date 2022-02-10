package com.example.demo.service;

import com.example.demo.model.Ingredient;
import com.example.demo.model.Product;

import java.util.List;

public interface IngredientService {
    Ingredient read(int id);

    Ingredient read(String name);

    List<Ingredient> readAll();

    void create(Ingredient ingredient);

    Ingredient update(int id, Ingredient ingredient);

    void delete(int id);
}
