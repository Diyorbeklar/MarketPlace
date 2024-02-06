package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.responseDTO.DocItemsResDTO;
import com.example.onlinemarket.entity.DocItems;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DocItemsResMapper extends CommonMapper<DocItemsResDTO, DocItems>{
    @Mapping(source = "document",target = "documentResDTO")
    DocItemsResDTO toDTO(DocItems docItems);
}
