package com.example.onlinemarket.service;

import com.example.onlinemarket.dto.requestDTO.ProductReqDTO;
import com.example.onlinemarket.dto.responseDTO.ProductResDTO;

import java.util.List;

public interface ProductService {
    List<ProductResDTO> getALLProduct();
    ProductResDTO getProductById(Long id);
    ProductResDTO createProduct(ProductReqDTO productReqDTO);
    ProductResDTO updateProduct(Long id ,ProductReqDTO productReqDTO);
    void deleteProductById(Long id);
}
