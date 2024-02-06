package com.example.onlinemarket.service;

import com.example.onlinemarket.dto.requestDTO.CompanyReqDTO;
import com.example.onlinemarket.dto.responseDTO.CompanyResDTO;
import com.example.onlinemarket.entity.Company;
import com.example.onlinemarket.mapper.CompanyReqMapper;
import com.example.onlinemarket.mapper.CompanyResMapper;
import com.example.onlinemarket.repostory.CompanyRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService{
    private final CompanyRepostory companyRepostory;
    private final CompanyReqMapper companyReqMapper;
    private final CompanyResMapper companyResMapper;
    @Override
    public List<CompanyResDTO> getALLCompany() {

        return companyResMapper.toDTOs(companyRepostory.findAll());
    }

    @Override
    public CompanyResDTO getCompanyById(Long id) {

        return companyResMapper.toDTO(companyRepostory.getReferenceById(id));
    }

    @Override
    public CompanyResDTO createCompany(CompanyReqDTO companyReqDTO) {

        return companyResMapper.toDTO(companyRepostory.save(companyReqMapper.toENTITY(companyReqDTO)));
    }

    @Override
    public CompanyResDTO updateCompany(Long id, CompanyReqDTO companyReqDTO) {
        Company company = companyRepostory.getReferenceById(id);
        company.setName(companyReqDTO.getName());
        company.setTell(companyReqDTO.getTell());
        company.setAddress(companyReqDTO.getAddress());
        company.setDescription(companyReqDTO.getDescription());
        return companyResMapper.toDTO(companyRepostory.save(company));
    }

    @Override
    public void deleteCompanyById(Long id) {
        companyRepostory.deleteById(id);
    }
}
