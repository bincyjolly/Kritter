package com.bincy.product.dao;

import com.bincy.product.dto.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDAOImpl implements ProductDAO {

    Map<Integer,Product> products = new HashMap<>();
    @Override
    public void create(Product product) {

     products.put(product.getPrice(),product);

    }

    @Override
    public Product read(int id) {
        return products.get(id);
    }


}
