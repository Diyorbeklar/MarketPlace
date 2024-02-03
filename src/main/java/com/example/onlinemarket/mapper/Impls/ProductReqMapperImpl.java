package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.requestDTO.ProductReqDTO;
import com.example.onlinemarket.entity.Product;
import com.example.onlinemarket.mapper.ProductReqMapper;
import com.example.onlinemarket.repostory.CategoryRepostory;
import com.example.onlinemarket.repostory.MeasurementRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ProductReqMapperImpl implements ProductReqMapper {
    private final CategoryRepostory categoryRepostory;
    private final MeasurementRepostory measurementRepostory;
    @Override
    public ProductReqDTO toDTO(Product product) {
        return null;
    }

    @Override
    public Product toENTITY(ProductReqDTO productReqDTO) {
        return Product.builder().category(
                categoryRepostory.getReferenceById(productReqDTO.getCategory_id()))
                .amount(productReqDTO.getAmount())
                .measurement(measurementRepostory.getReferenceById(productReqDTO.getMeasurement_id()))
                .name(productReqDTO.getName())
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
