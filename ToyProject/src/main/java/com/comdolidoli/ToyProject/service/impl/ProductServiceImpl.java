package com.comdolidoli.ToyProject.service.impl;

import com.comdolidoli.ToyProject.data.dto.ProductDto;
import com.comdolidoli.ToyProject.data.entity.ProductEntity;
import com.comdolidoli.ToyProject.data.handler.ProductHandler;
import com.comdolidoli.ToyProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    ProductHandler productHandler;

    @Autowired
    public ProductServiceImpl(ProductHandler productHandler) {
        this.productHandler = productHandler;
    }

    @Override
    public ProductDto getProduct(String productId) {
        ProductEntity productEntity = productHandler.getProductEntity(productId);
        ProductDto productDto = new ProductDto(
                productEntity.getProductId(),
                productEntity.getProductName(),
                productEntity.getProductPrice(),
                productEntity.getProductStock());
        return productDto;
    }

    @Override
    public ProductDto saveProduct(String productId, String productName, int productPrice, int productStock) {
        ProductEntity productEntity = productHandler.saveProductEntity(productId,productName,productPrice,productStock);
        ProductDto productDto = new ProductDto(
                productEntity.getProductId(),
                productEntity.getProductName(),
                productEntity.getProductPrice(),
                productEntity.getProductStock());
        return productDto;
    }
}
