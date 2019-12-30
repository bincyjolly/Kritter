package com.bincy.product.dao;
// this interface is used to implement products
import com.bincy.product.dto.Product;

public interface ProductDAO {
    void create(Product product);
    Product read(int id);
   // void update(Product product);
   // void  delete(int id);

}
