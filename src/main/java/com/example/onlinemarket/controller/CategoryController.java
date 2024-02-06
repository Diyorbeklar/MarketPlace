package com.example.onlinemarket.controller;

import com.example.onlinemarket.dto.requestDTO.CategoryReqDTO;
import com.example.onlinemarket.dto.responseDTO.CategoryResDTO;
import com.example.onlinemarket.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
@RequestMapping("/market/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @GetMapping
    ModelAndView getAllCategories(){
        ModelAndView mv = new ModelAndView("category");
        mv.addObject("categoryList",categoryService.getALLCategory());
        return mv;
    }
    @GetMapping("/{id}/88")
    CategoryResDTO getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }
    @PostMapping
    ModelAndView createCategory(@RequestParam("name") String name){
        categoryService.createCategory(new CategoryReqDTO(name));
        return new ModelAndView("redirect:/market/category");
    }

    @PostMapping("/{id}")
    ModelAndView updateCategory(@PathVariable Long id,@RequestParam("name") String name){
        System.out.println(name);
        categoryService.updateCategory(id,new CategoryReqDTO(name));
        return new ModelAndView("redirect:/market/category");
    }

    @GetMapping("delete/{id}")
    ModelAndView deleteCategory(@PathVariable Long id){
        categoryService.deleteCategoryById(id);
        return new ModelAndView("redirect:/market/category");
    }

}
