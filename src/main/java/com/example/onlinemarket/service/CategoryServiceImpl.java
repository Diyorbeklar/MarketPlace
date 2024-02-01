package com.example.onlinemarket.service;

import com.example.onlinemarket.dto.requestDTO.CategoryReqDTO;
import com.example.onlinemarket.dto.responseDTO.CategoryResDTO;
import com.example.onlinemarket.entity.Category;
import com.example.onlinemarket.mapper.CategoryReqMapper;
import com.example.onlinemarket.mapper.CategoryResMapper;
import com.example.onlinemarket.repostory.CategoryRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepostory categoryRepostory;
    private final CategoryReqMapper categoryReqMapper;
    private final CategoryResMapper categoryResMapper;
    @Override
    public List<CategoryResDTO> getALLCategory() {
        return categoryResMapper.toDTOs(categoryRepostory.findAll());
    }

    @Override
    public CategoryResDTO getCategoryById(Long id) {

        return categoryResMapper.toDTO(categoryRepostory.getReferenceById(id));
    }

    @Override
    public CategoryResDTO createCategory(CategoryReqDTO categoryReqDTO) {

        return categoryResMapper.toDTO(categoryRepostory.save(categoryReqMapper.toENTITY(categoryReqDTO)));
    }

    @Override
    public CategoryResDTO updateCategory(Long id, CategoryReqDTO categoryReqDTO) {
        Category category = categoryRepostory.getReferenceById(id);
        category.setName(categoryReqDTO.getName());
        return categoryResMapper.toDTO(categoryRepostory.save(category));
    }

    @Override
    public void deleteCategoryById(Long id) {
       categoryRepostory.deleteById(id);
    }
}
