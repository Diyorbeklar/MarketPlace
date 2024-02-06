package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.responseDTO.CompanyResDTO;
import com.example.onlinemarket.entity.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyResMapper extends CommonMapper<CompanyResDTO, Company> {
    @Override
    CompanyResDTO toDTO(Company company);
}
