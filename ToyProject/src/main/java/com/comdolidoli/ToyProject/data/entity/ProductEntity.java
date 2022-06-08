package com.comdolidoli.ToyProject.data.entity;

import com.comdolidoli.ToyProject.data.dto.ProductDto;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
@Builder
public class ProductEntity {
    @Id
    String productId;

    String productName;

    int productPrice;
    int productStock;

//    @Column(updatable = false)
//    LocalDateTime createdAt;
//
//    @Column(updatable = false)
//    LocalDateTime updatedAt;

//    public ProductDto productDto{
//        return ProductDto.builder()
//                .productId(productId)
//                .productName(productName)
//                .productPrice(productPrice)
//                .productStock(productStock)
//                .build();
//    }
}
