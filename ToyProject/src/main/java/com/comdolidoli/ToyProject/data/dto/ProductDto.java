package com.comdolidoli.ToyProject.data.dto;

import com.comdolidoli.ToyProject.data.entity.ProductEntity;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProductDto {
    private String productId;
    private String productName;
    private int productPrice;
    private int productStock;

    public ProductEntity productEntity(){
        return ProductEntity.builder()
                .productId(productId)
                .productPrice(productPrice)
                .productName(productName)
                .productStock(productStock)
                .build();
    }
}
