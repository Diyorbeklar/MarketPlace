package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.requestDTO.CompanyReqDTO;
import com.example.onlinemarket.entity.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyReqMapper extends CommonMapper<CompanyReqDTO, Company>{

}
