package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.responseDTO.DocumentResDTO;
import com.example.onlinemarket.entity.Document;
import com.example.onlinemarket.mapper.CompanyResMapper;
import com.example.onlinemarket.mapper.DocumentResMapper;
import com.example.onlinemarket.repostory.DocumentRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class DocumentResMapperImpl implements DocumentResMapper {
    private final CompanyResMapper companyResMapper;
    @Override
    public DocumentResDTO toDTO(Document document) {
        return DocumentResDTO.builder()
                .companyResDTO(companyResMapper.toDTO(document.getCompany()))
                .document_number(document.getDocument_number())
                .date(document.getDate())
                .build();
    }

    @Override
    public Document toENTITY(DocumentResDTO documentResDTO) {
        return null;
    }

    @Override
    public List<DocumentResDTO> toDTOs(List<Document> documents) {
        return documents.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Document> toENTOTies(List<DocumentResDTO> documentResDTOS) {
        return null;
    }
}
