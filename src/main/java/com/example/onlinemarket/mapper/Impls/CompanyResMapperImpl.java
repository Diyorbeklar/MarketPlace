package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.responseDTO.CompanyResDTO;
import com.example.onlinemarket.entity.Company;
import com.example.onlinemarket.mapper.CompanyResMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CompanyResMapperImpl implements CompanyResMapper {
    @Override
    public CompanyResDTO toDTO(Company company) {
        return CompanyResDTO.builder().address(company.getAddress())
                .description(company.getDescription())
                .tell(company.getTell())
                .name(company.getName())
                .build();
    }

    @Override
    public Company toENTITY(CompanyResDTO companyResDTO) {
        return Company.builder().name(companyResDTO.getName())
                .tell(companyResDTO.getTell())
                .description(companyResDTO.getDescription())
                .address(companyResDTO.getAddress())
                .build();
    }

    @Override
    public List<CompanyResDTO> toDTOs(List<Company> companies) {
        return companies.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Company> toENTOTies(List<CompanyResDTO> companyResDTOS) {
        return companyResDTOS.stream().map(this::toENTITY).collect(Collectors.toList());
    }
}
