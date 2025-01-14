package com.example.restapijdbc.dao;

import com.example.restapijdbc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Product> getAllProducts(){

        RowMapper rm = new RowMapper() {
            @Override
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                Product product = new Product();
                product.setProductId(rs.getInt("PRODUCT_ID"));
                product.setSku(rs.getString("SKU"));
                product.setName(rs.getString("NAME"));
                product.setDesc(rs.getString("DESC"));
                product.setPrice(rs.getString("PRICE"));
                return product;
            }
        };

        return jdbcTemplate.query("SELECT * FROM PRODUCT", rm);
    }
}
