package com.bincy.product.bo;

import com.bincy.product.dao.ProductDAO;
import com.bincy.product.dto.Product;

public class ProductBOImpl implements ProductBO {
    public ProductDAO getDao() {
        return dao;
    }

    public void setDao(ProductDAO dao) {
        this.dao = dao;
    }

    private ProductDAO dao;

    @Override
    public void create(Product product) {
        dao.create(product);

    }

    @Override
    public Product findProduct(int id) {
        return dao.read(id);
    }
}
