package com.example.demo.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Product {
     private int id;
     private int productTypeId;
     private String name;
     private float price;
     private String imgPath;
     private String  currency;
}