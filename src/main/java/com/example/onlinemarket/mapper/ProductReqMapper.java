package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.requestDTO.ProductReqDTO;
import com.example.onlinemarket.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductReqMapper extends CommonMapper<ProductReqDTO, Product>{

}
