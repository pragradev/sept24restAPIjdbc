package com.example.restapijdbc.api;

import com.example.restapijdbc.dao.ProductDAO;
import com.example.restapijdbc.model.Product;
import com.example.restapijdbc.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;

@RestController
@RequestMapping("/product")
public class ProductAPI {
    @Autowired
    ProductDAO productDAO;
    @Autowired
    ProductService productService;

    @GetMapping("/test")
    public String test(){
        return "test";
    }
    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        List<Product> allProducts = productService.getAllProduct();
        return allProducts;
    }
}
