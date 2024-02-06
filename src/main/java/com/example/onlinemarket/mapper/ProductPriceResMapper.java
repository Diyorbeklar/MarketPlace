package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.requestDTO.ProductPriceReqDTO;
import com.example.onlinemarket.dto.responseDTO.ProductPriceResDTO;
import com.example.onlinemarket.entity.Product;
import com.example.onlinemarket.entity.ProductPrice;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductPriceResMapper extends CommonMapper<ProductPriceResDTO, ProductPrice>{
    @Mapping(source = "product",target = "productResDTO")
    ProductPriceResDTO toDTO(ProductPrice productPrice);

    @Mapping(source = "productResDTO",target = "product")
    ProductPrice toENTITY(ProductPriceResDTO productPriceResDTO);
}
