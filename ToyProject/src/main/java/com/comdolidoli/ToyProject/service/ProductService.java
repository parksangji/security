package com.comdolidoli.ToyProject.service;

import com.comdolidoli.ToyProject.data.dto.ProductDto;

public interface ProductService {
    ProductDto getProduct(String productId);
    ProductDto saveProduct(String productId,String productName,int productPrice,int productStock);
}
