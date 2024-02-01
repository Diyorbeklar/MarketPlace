package com.example.onlinemarket.service;

import com.example.onlinemarket.dto.requestDTO.CategoryReqDTO;
import com.example.onlinemarket.dto.responseDTO.CategoryResDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {
    List<CategoryResDTO> getALLCategory();
    CategoryResDTO getCategoryById(Long id);
    CategoryResDTO createCategory(CategoryReqDTO categoryReqDTO);
    CategoryResDTO updateCategory(Long id ,CategoryReqDTO categoryReqDTO);
    void deleteCategoryById(Long id);
}
