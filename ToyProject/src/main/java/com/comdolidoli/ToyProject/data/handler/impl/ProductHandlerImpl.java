package com.comdolidoli.ToyProject.data.handler.impl;

import com.comdolidoli.ToyProject.data.dao.ProductDao;
import com.comdolidoli.ToyProject.data.dto.ProductDto;
import com.comdolidoli.ToyProject.data.entity.ProductEntity;
import com.comdolidoli.ToyProject.data.handler.ProductHandler;
import com.comdolidoli.ToyProject.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductHandlerImpl implements ProductHandler {


    ProductDao productDao;

    @Autowired
    public ProductHandlerImpl(ProductDao productDao) {
        this.productDao = productDao;
    }


    @Override
    public ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock) {
        ProductEntity productEntity = new ProductEntity(productId,productName,productPrice,productStock);
        return productDao.saveProduct(productEntity);
    }

    @Override
    public ProductEntity getProductEntity(String productId) {
        return productDao.getProduct(productId);
    }
}
