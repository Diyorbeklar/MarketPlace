package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.requestDTO.ProductReqDTO;
import com.example.onlinemarket.entity.Product;
import com.example.onlinemarket.mapper.ProductReqMapper;
import com.example.onlinemarket.repostory.CategoryRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ProductReqMapperImpl implements ProductReqMapper {
    private final CategoryRepostory categoryRepostory;
    @Override
    public ProductReqDTO toDTO(Product product) {
        return null;
    }

    @Override
    public Product toENTITY(ProductReqDTO productReqDTO) {
        return Product.builder().category(
                categoryRepostory.getReferenceById(productReqDTO.getCategory_id()))
                .amount(productReqDTO.getAmount())
                .unit(productReqDTO.getUnit())
                .name(productReqDTO.getName())
                .price(productReqDTO.getPrice())
                .build();
    }

    @Override
    public List<ProductReqDTO> toDTOs(List<Product> products) {
        return null;
    }

    @Override
    public List<Product> toENTOTies(List<ProductReqDTO> productReqDTOS) {
        return productReqDTOS.stream().map(this::toENTITY).collect(Collectors.toList());
    }
}
