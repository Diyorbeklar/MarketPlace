package com.example.onlinemarket.service;

import com.example.onlinemarket.dto.requestDTO.CompanyReqDTO;
import com.example.onlinemarket.dto.responseDTO.CompanyResDTO;

import java.util.List;

public interface CompanyService {
    List<CompanyResDTO> getALLCompany();
    CompanyResDTO getCompanyById(Long id);
    CompanyResDTO createCompany(CompanyReqDTO companyReqDTO);
    CompanyResDTO updateCompany(Long id ,CompanyReqDTO companyReqDTO);
    void deleteCompanyById(Long id);
}
