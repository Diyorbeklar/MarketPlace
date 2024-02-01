package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.requestDTO.DocItemsReqDTO;
import com.example.onlinemarket.entity.DocItems;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocItemsReqMapper extends CommonMapper<DocItemsReqDTO, DocItems>{
}
