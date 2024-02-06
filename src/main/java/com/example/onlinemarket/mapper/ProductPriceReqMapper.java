package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.requestDTO.ProductPriceReqDTO;
import com.example.onlinemarket.entity.Product;
import com.example.onlinemarket.entity.ProductPrice;
import com.example.onlinemarket.repostory.ProductRepostory;
import jakarta.persistence.EntityNotFoundException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class ProductPriceReqMapper implements CommonMapper<ProductPriceReqDTO, ProductPrice>{
    @Autowired
    ProductRepostory productRepostory;

    @Mapping(target = "product", expression = "java(findProductById(productPriceReqDTO.getProduct_id()))")
    public  abstract ProductPrice toENTITY(ProductPriceReqDTO productPriceReqDTO);


    protected Product findProductById(Long id){
        return productRepostory.findById(id).orElseThrow(()->new EntityNotFoundException("No found product"));
    }
}
