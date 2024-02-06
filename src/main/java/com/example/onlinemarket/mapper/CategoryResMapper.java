package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.responseDTO.CategoryResDTO;
import com.example.onlinemarket.entity.Category;
import com.example.onlinemarket.mapper.CommonMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryResMapper extends CommonMapper<CategoryResDTO, Category> {
    @Mapping(source = "id",target = "id")
    CategoryResDTO toDTO(Category category);
}
