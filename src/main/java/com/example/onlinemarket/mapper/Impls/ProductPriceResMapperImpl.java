package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.responseDTO.ProductPriceResDTO;
import com.example.onlinemarket.dto.responseDTO.ProductResDTO;
import com.example.onlinemarket.entity.Product;
import com.example.onlinemarket.entity.ProductPrice;
import com.example.onlinemarket.mapper.CategoryResMapper;
import com.example.onlinemarket.mapper.MeasurementResMapper;
import com.example.onlinemarket.mapper.ProductPriceResMapper;
import com.example.onlinemarket.mapper.ProductResMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ProductPriceResMapperImpl implements ProductPriceResMapper {
    private final ProductResMapper productResMapper;
    @Override
    public ProductPriceResDTO toDTO(ProductPrice productPrice) {
        return ProductPriceResDTO.builder()
                .productResDTO(productResMapper.toDTO(productPrice.getProduct()))
                .price(productPrice.getPrice())
                .date(productPrice.getDate())
                .status(productPrice.getStatus())
                .build();
    }

    @Override
    public ProductPrice toENTITY(ProductPriceResDTO productPriceResDTO) {
        return null;
    }

    @Override
    public List<ProductPriceResDTO> toDTOs(List<ProductPrice> productPrices) {
        return productPrices.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<ProductPrice> toENTOTies(List<ProductPriceResDTO> productPriceResDTOS) {
        return null;
    }

}
