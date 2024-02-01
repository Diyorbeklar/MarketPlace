package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.responseDTO.CategoryResDTO;
import com.example.onlinemarket.entity.Category;
import com.example.onlinemarket.mapper.CategoryResMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CategoryResMapperImpl implements CategoryResMapper {
    @Override
    public CategoryResDTO toDTO(Category category) {
        return CategoryResDTO.builder().name(category.getName()).build();
    }

    @Override
    public Category toENTITY(CategoryResDTO categoryResDTO) {
        return Category.builder().name(categoryResDTO.getName()).build();
    }

    @Override
    public List<CategoryResDTO> toDTOs(List<Category> categories) {
        return categories.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Category> toENTOTies(List<CategoryResDTO> categoryResDTOS) {
        return categoryResDTOS.stream().map(this::toENTITY).collect(Collectors.toList());
    }
}
