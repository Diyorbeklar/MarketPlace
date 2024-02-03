package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.requestDTO.ProductPriceReqDTO;
import com.example.onlinemarket.entity.Product;
import com.example.onlinemarket.entity.ProductPrice;
import com.example.onlinemarket.mapper.ProductPriceReqMapper;
import com.example.onlinemarket.mapper.ProductPriceResMapper;
import com.example.onlinemarket.repostory.MeasurementRepostory;
import com.example.onlinemarket.repostory.ProductRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ProductPriceReqMapperImpl implements ProductPriceReqMapper {
    private final ProductRepostory productRepostory;

    @Override
    public ProductPriceReqDTO toDTO(ProductPrice productPrice) {
        return null;
    }

    @Override
    public ProductPrice toENTITY(ProductPriceReqDTO productPriceReqDTO) {
        return ProductPrice.builder()
                .product(productRepostory.getReferenceById(productPriceReqDTO.getProduct_id()))
                .price(productPriceReqDTO.getPrice())
                .date(productPriceReqDTO.getDate())
                .status(productPriceReqDTO.getStatus())
                .build();
    }

    @Override
    public List<ProductPriceReqDTO> toDTOs(List<ProductPrice> productPrices) {
        return null;
    }

    @Override
    public List<ProductPrice> toENTOTies(List<ProductPriceReqDTO> productPriceReqDTOS) {
        return productPriceReqDTOS.stream().map(this::toENTITY).collect(Collectors.toList());
    }
}
