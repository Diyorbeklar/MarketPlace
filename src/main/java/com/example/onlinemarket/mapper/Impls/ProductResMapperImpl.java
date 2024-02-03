package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.responseDTO.MeasurementResDTO;
import com.example.onlinemarket.dto.responseDTO.ProductResDTO;
import com.example.onlinemarket.entity.Product;
import com.example.onlinemarket.mapper.CategoryResMapper;
import com.example.onlinemarket.mapper.MeasurementResMapper;
import com.example.onlinemarket.mapper.ProductResMapper;
import com.example.onlinemarket.repostory.CategoryRepostory;
import com.example.onlinemarket.repostory.MeasurementRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ProductResMapperImpl implements ProductResMapper {
    private final CategoryResMapper categoryResMapper;
    private final MeasurementResMapper measurementResMapper;


    @Override
    public ProductResDTO toDTO(Product product) {
        return ProductResDTO.builder().amount(product.getAmount())
                .measurementResDTO(measurementResMapper.toDTO(product.getMeasurement()))
                .categoryResDTO(categoryResMapper.toDTO(product.getCategory()))
                .name(product.getName())
                .build();
    }

    @Override
    public Product toENTITY(ProductResDTO productResDTO) {
        return null;
    }

    @Override
    public List<ProductResDTO> toDTOs(List<Product> products) {
        return products.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Product> toENTOTies(List<ProductResDTO> productResDTOS) {
        return null;
    }
}
