package com.bincy.product.dao;

import com.bincy.product.dto.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductDAOImplTest {
    @Test
    public void createShouldCreateProduct() {
       ProductDAO dao = new ProductDAOImpl();
       Product product= new Product();
       product.setId(1);
       product.setName("Android");
       product.setDescription("It's Pretty cool");
       product.setPrice(100);
       dao.create(product);
       Product result = dao.read(1);
       assertNotNull(result);
       assertEquals("Android", result.getName());// test should pass
    }

}
