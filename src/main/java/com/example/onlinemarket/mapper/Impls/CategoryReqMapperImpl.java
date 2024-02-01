package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.requestDTO.CategoryReqDTO;
import com.example.onlinemarket.entity.Category;
import com.example.onlinemarket.mapper.CategoryReqMapper;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryReqMapperImpl implements CategoryReqMapper {
    @Override
    public CategoryReqDTO toDTO(Category category) {
        return CategoryReqDTO.builder().name(category.getName()).build();
    }

    @Override
    public Category toENTITY(CategoryReqDTO categoryReqDTO) {
        return Category.builder().name(categoryReqDTO.getName()).build();
    }

    @Override
    public List<CategoryReqDTO> toDTOs(List<Category> categories) {
        return categories.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Category> toENTOTies(List<CategoryReqDTO> categoryReqDTOS) {
        return categoryReqDTOS.stream().map(this::toENTITY).collect(Collectors.toList());
    }
}
