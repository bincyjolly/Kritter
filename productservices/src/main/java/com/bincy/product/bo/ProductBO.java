package com.bincy.product.bo;

import com.bincy.product.dto.Product;

public interface ProductBO {
    public void create(Product product);
    public Product findProduct(int id);
}
