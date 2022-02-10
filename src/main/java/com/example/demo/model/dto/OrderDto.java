package com.example.demo.model.dto;


import com.example.demo.model.Product;
import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private int tableId;

    private boolean inProcess;

    private int quantity;

    private float amount;

    private List<Product> products;

}
