package com.example.demo.model;

import lombok.*;

import java.util.List;
import java.util.Objects;

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