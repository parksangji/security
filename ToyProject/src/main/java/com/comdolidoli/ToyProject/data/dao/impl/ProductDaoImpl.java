package com.comdolidoli.ToyProject.data.dao.impl;

import com.comdolidoli.ToyProject.data.dao.ProductDao;
import com.comdolidoli.ToyProject.data.entity.ProductEntity;
import com.comdolidoli.ToyProject.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDaoImpl implements ProductDao {
    // DAO 에서는 repository로 서비스를 작동한다.
    ProductRepository productRepository;
    @Autowired
    public ProductDaoImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        return  productRepository.save(productEntity);
    }

    @Override
    public ProductEntity getProduct(String productId) {
        return productRepository.getById(productId);
    }
}
