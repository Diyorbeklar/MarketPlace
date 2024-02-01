package com.example.onlinemarket.controller;

import com.example.onlinemarket.dto.requestDTO.ProductReqDTO;
import com.example.onlinemarket.dto.responseDTO.ProductResDTO;
import com.example.onlinemarket.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping
    List<ProductResDTO> getAllCategories(){
        return productService.getALLProduct();
    }
    @GetMapping("/{id}")
    ProductResDTO getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }
    @PostMapping()
    ProductResDTO createProduct(@RequestBody ProductReqDTO productReqDTO){
        return productService.createProduct(productReqDTO);
    }

    @PutMapping("/{id}")
    ProductResDTO updateProduct(@PathVariable Long id,@RequestBody ProductReqDTO productReqDTO){
        return productService.updateProduct(id,productReqDTO);
    }

    @DeleteMapping("/{id}")
    void deleteProduct(@PathVariable Long id){
        productService.deleteProductById(id);
    }

}

