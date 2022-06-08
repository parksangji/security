package com.comdolidoli.ToyProject.data.handler;

import com.comdolidoli.ToyProject.data.entity.ProductEntity;

public interface ProductHandler {
    ProductEntity saveProductEntity(String productId,String productName,int productPrice,int productStock);
    ProductEntity getProductEntity(String productId);
}
