package com.comdolidoli.ToyProject.controller;

import com.comdolidoli.ToyProject.data.dto.ProductDto;
import com.comdolidoli.ToyProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/product-service")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/find/{productId}")
    public ProductDto getProduct(@PathVariable String productId){
        return productService.getProduct(productId);
    }
    @PostMapping("/product/create")
    public ProductDto createProduct(@RequestBody ProductDto productDto){
        return productService.saveProduct(
                productDto.getProductId(),
                productDto.getProductName(),
                productDto.getProductPrice(),
                productDto.getProductStock());
    }

}
