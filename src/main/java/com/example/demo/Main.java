package com.example.demo;

import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.util.SQLConnector;
import com.google.gson.Gson;
import jdk.jfr.internal.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        OrderRepository orderRepository = new OrderRepository();
        System.out.println(new Gson().toJson(orderRepository.read(1)));
    }
}
