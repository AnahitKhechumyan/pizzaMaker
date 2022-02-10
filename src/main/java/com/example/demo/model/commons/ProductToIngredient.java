package com.example.demo.model.commons;


import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ProductToIngredient {
    private int id;

    private int ingredientId;

    private int productId;


}
