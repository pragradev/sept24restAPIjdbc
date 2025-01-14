package com.example.restapijdbc.dao;

public interface SQLQueries {
    String saveProduct = "INSERT INTO PRODUCT VALUES (?,?,?,?,?)";
    String fetchAllProduct = "SELECT * FROM PRODUCT";
}
