package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.requestDTO.CategoryReqDTO;
import com.example.onlinemarket.dto.responseDTO.CategoryResDTO;
import com.example.onlinemarket.entity.Category;
import com.example.onlinemarket.mapper.CommonMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


public interface CategoryReqMapper extends CommonMapper<CategoryReqDTO, Category> {



}
