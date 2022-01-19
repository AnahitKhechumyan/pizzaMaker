package com.example.demo.service;

import com.example.demo.model.Table;

import java.util.List;

public interface TableService {

  Table read(int id);

  List<Table> readAll();

  void create();

  Table update(int id, Table table);

  void delete(int id);




}
