package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.responseDTO.DocumentResDTO;
import com.example.onlinemarket.entity.Document;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DocumentResMapper extends CommonMapper<DocumentResDTO, Document>{
    @Mapping(source = "company",target = "companyResDTO")
    DocumentResDTO toDTO(Document document);
}
