package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.requestDTO.DocumentReqDTO;
import com.example.onlinemarket.entity.Company;
import com.example.onlinemarket.entity.Document;
import com.example.onlinemarket.repostory.CompanyRepostory;
import jakarta.persistence.EntityNotFoundException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class DocumentReqMapper implements CommonMapper<DocumentReqDTO, Document> {
     private CompanyRepostory companyRepostory;

    @Mapping(target = "company",expression = "java(findCompanyById(documentReqDTO.getCompany_id()))")
    public abstract Document toENTITY(DocumentReqDTO documentReqDTO);


    protected Company findCompanyById(Long id){
        return companyRepostory.findById(id).orElseThrow(()-> new EntityNotFoundException("Not found company"));
    }
}
