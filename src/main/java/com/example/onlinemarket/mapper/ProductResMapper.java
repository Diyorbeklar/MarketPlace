package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.responseDTO.ProductResDTO;
import com.example.onlinemarket.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface ProductResMapper extends CommonMapper<ProductResDTO, Product> {
    @Mapping(source = "categoryResDTO",target = "category")
    @Mapping(source = "measurementResDTO",target = "measurement")
    Product toENTITY(ProductResDTO productResDTO);

    @Mapping(source = "category",target = "categoryResDTO")
    @Mapping(source = "measurement",target = "measurementResDTO")
    ProductResDTO toDTO(Product product);
}
