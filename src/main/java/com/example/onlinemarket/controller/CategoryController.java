package com.example.onlinemarket.controller;

import com.example.onlinemarket.dto.requestDTO.CategoryReqDTO;
import com.example.onlinemarket.dto.responseDTO.CategoryResDTO;
import com.example.onlinemarket.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @GetMapping
    List<CategoryResDTO> getAllCategories(){
        return categoryService.getALLCategory();
    }
    @GetMapping("/{id}")
    CategoryResDTO getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }
    @PostMapping()
    CategoryResDTO createCategory(@RequestBody CategoryReqDTO categoryReqDTO){
        return categoryService.createCategory(categoryReqDTO);
    }

    @PutMapping("/{id}")
    CategoryResDTO updateCategory(@PathVariable Long id,@RequestBody CategoryReqDTO categoryReqDTO){
        return categoryService.updateCategory(id,categoryReqDTO);
    }

    @DeleteMapping("/{id}")
    void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategoryById(id);
    }

}
