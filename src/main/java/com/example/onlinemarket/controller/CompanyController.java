package com.example.onlinemarket.controller;

import com.example.onlinemarket.dto.requestDTO.CompanyReqDTO;
import com.example.onlinemarket.dto.responseDTO.CompanyResDTO;
import com.example.onlinemarket.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/market/company")
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService companyService;
    @GetMapping
    ModelAndView getAllCategories(){
        ModelAndView mv = new ModelAndView("company");
        return mv.addObject("companies",companyService.getALLCompany());
    }
    @GetMapping("/{id}")
    CompanyResDTO getCompanyById(@PathVariable Long id){
        return companyService.getCompanyById(id);
    }
    @PostMapping()
    ModelAndView createCompany(@RequestParam("name") String name,@RequestParam("address") String address,@RequestParam("phoneNumber") String phoneNumber,@RequestParam("description") String  description){
        companyService.createCompany(new CompanyReqDTO(name,address,phoneNumber,description));
        return new ModelAndView("redirect:/market/company");
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

