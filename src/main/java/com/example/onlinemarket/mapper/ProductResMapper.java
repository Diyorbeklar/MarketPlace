package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.responseDTO.ProductResDTO;
import com.example.onlinemarket.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductResMapper extends CommonMapper<ProductResDTO, Product> {

}
