package com.comdolidoli.ToyProject.data.dao;


import com.comdolidoli.ToyProject.data.entity.ProductEntity;

// Database <-> Service (use Entity)
public interface ProductDao {
    ProductEntity saveProduct(ProductEntity productEntity);
    ProductEntity getProduct(String productId);
}
