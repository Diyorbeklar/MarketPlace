package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.requestDTO.DocumentReqDTO;
import com.example.onlinemarket.entity.Document;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentReqMapper extends CommonMapper<DocumentReqDTO, Document> {

}
