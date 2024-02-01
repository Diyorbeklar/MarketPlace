package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.requestDTO.DocumentReqDTO;
import com.example.onlinemarket.entity.Document;
import com.example.onlinemarket.mapper.CompanyResMapper;
import com.example.onlinemarket.mapper.DocumentReqMapper;
import com.example.onlinemarket.repostory.CompanyRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class DocumentReqMapperImpl  implements DocumentReqMapper {
    private final CompanyRepostory companyRepostory;

    @Override
    public DocumentReqDTO toDTO(Document document) {
        return null;
    }

    @Override
    public Document toENTITY(DocumentReqDTO documentReqDTO) {
        return Document.builder()
                .document_number(documentReqDTO.getDocument_number())
                .company(companyRepostory.getReferenceById(documentReqDTO.getCompany_id()))
                .date(documentReqDTO.getDate())
                .build();
    }

    @Override
    public List<DocumentReqDTO> toDTOs(List<Document> documents) {
        return null;
    }

    @Override
    public List<Document> toENTOTies(List<DocumentReqDTO> documentReqDTOS) {
        return documentReqDTOS.stream().map(this::toENTITY).collect(Collectors.toList());
    }
}
