package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.responseDTO.DocItemsResDTO;
import com.example.onlinemarket.entity.DocItems;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocItemsResMapper extends CommonMapper<DocItemsResDTO, DocItems>{
}