package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.requestDTO.CompanyReqDTO;
import com.example.onlinemarket.entity.Company;
import com.example.onlinemarket.mapper.CompanyReqMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CompanyReqMapperImpl implements CompanyReqMapper {
    @Override
    public CompanyReqDTO toDTO(Company company) {
        return CompanyReqDTO.builder()
                .address(company.getAddress())
                .description(company.getDescription())
                .tell(company.getTell())
                .name(company.getName())
                .build();
    }

    @Override
    public Company toENTITY(CompanyReqDTO companyReqDTO) {
        return Company.builder().address(companyReqDTO.getAddress())
                .description(companyReqDTO.getDescription())
                .tell(companyReqDTO.getTell())
                .name(companyReqDTO.getName())
                .build();
    }

    @Override
    public List<CompanyReqDTO> toDTOs(List<Company> companies) {
        return companies.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Company> toENTOTies(List<CompanyReqDTO> companyReqDTOS) {
        return companyReqDTOS.stream().map(this::toENTITY).collect(Collectors.toList());
    }
}
