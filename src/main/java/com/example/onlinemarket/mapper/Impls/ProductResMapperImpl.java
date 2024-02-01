package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.responseDTO.ProductResDTO;
import com.example.onlinemarket.entity.Product;
import com.example.onlinemarket.mapper.CategoryResMapper;
import com.example.onlinemarket.mapper.ProductResMapper;
import com.example.onlinemarket.repostory.CategoryRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ProductResMapperImpl implements ProductResMapper {
    private final CategoryRepostory categoryRepostory;
    private final CategoryResMapper categoryResMapper;


    @Override
    public ProductResDTO toDTO(Product product) {
        return ProductResDTO.builder().amount(product.getAmount())
                .categoryResDTO(categoryResMapper.toDTO(categoryRepostory.getReferenceById(product.getId())))
                .price(product.getPrice())
                .unit(product.getUnit())
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
