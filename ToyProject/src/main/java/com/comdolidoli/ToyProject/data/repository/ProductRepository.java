package com.comdolidoli.ToyProject.data.repository;

import com.comdolidoli.ToyProject.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,String> {
}
