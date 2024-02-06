package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.requestDTO.ProductReqDTO;
import com.example.onlinemarket.entity.Category;
import com.example.onlinemarket.entity.Measurement;
import com.example.onlinemarket.entity.Product;
import com.example.onlinemarket.repostory.CategoryRepostory;
import com.example.onlinemarket.repostory.MeasurementRepostory;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")

public abstract class ProductReqMapper implements CommonMapper<ProductReqDTO, Product>{
    @Autowired
    private  CategoryRepostory categoryRepository;
    @Autowired
    private MeasurementRepostory measurementRepostory;
    @Mapping(target = "category",expression = "java(findCategoryById(productReqDTO.getCategory_id()))")
    @Mapping(target = "measurement",expression = "java(findMeasurementById(productReqDTO.getMeasurement_id()))")
    public abstract Product toENTITY(ProductReqDTO productReqDTO);

    protected Category findCategoryById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Category not found"));
    }

    protected Measurement findMeasurementById(Long id){
        return measurementRepostory.findById(id).orElseThrow(()-> new EntityNotFoundException("Measurement not found"));
    }


}
