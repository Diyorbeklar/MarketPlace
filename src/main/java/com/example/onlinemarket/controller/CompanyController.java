package com.example.onlinemarket.controller;

import com.example.onlinemarket.dto.requestDTO.CompanyReqDTO;
import com.example.onlinemarket.dto.responseDTO.CompanyResDTO;
import com.example.onlinemarket.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService companyService;
    @GetMapping
    List<CompanyResDTO> getAllCategories(){
        return companyService.getALLCompany();
    }
    @GetMapping("/{id}")
    CompanyResDTO getCompanyById(@PathVariable Long id){
        return companyService.getCompanyById(id);
    }
    @PostMapping()
    CompanyResDTO createCompany(@RequestBody CompanyReqDTO companyReqDTO){
        return companyService.createCompany(companyReqDTO);
    }
    @PutMapping("/{id}")
    CompanyResDTO updateCompany(@PathVariable Long id,@RequestBody CompanyReqDTO companyReqDTO){
        return companyService.updateCompany(id,companyReqDTO);
    }
    @DeleteMapping("/{id}")
    void deleteCompany(@PathVariable Long id){
        companyService.deleteCompanyById(id);
    }

}

