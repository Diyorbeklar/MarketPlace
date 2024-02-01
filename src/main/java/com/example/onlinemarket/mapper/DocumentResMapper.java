package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.responseDTO.DocumentResDTO;
import com.example.onlinemarket.entity.Document;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentResMapper extends CommonMapper<DocumentResDTO, Document>{
}
