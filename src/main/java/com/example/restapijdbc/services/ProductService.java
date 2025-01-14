package com.example.restapijdbc.services;


import com.example.restapijdbc.dao.ProductDAO;
import com.example.restapijdbc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductDAO productDAO;

    public List<Product> getAllProduct(){
        return productDAO.getAllProducts();
    }

    public boolean saveProduct(Product product){
        return productDAO.saveProduct(product);
    }

}
