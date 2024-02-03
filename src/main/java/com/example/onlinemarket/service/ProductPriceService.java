package com.example.onlinemarket.service;

import com.example.onlinemarket.dto.requestDTO.ProductPriceReqDTO;
import com.example.onlinemarket.dto.responseDTO.ProductPriceResDTO;

import java.util.List;

public interface ProductPriceService {
    List<ProductPriceResDTO> getALLProductPrice();
    ProductPriceResDTO getProductPriceById(Long id);
    ProductPriceResDTO createProductPrice(ProductPriceReqDTO productPriceReqDTO);
    ProductPriceResDTO updateProductPrice(Long id ,ProductPriceReqDTO productPriceReqDTO);
    void deleteProductPriceById(Long id);
}
