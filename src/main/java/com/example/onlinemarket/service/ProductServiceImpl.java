package com.example.onlinemarket.service;

import com.example.onlinemarket.dto.requestDTO.ProductReqDTO;
import com.example.onlinemarket.dto.responseDTO.ProductResDTO;
import com.example.onlinemarket.entity.Product;
import com.example.onlinemarket.mapper.ProductReqMapper;
import com.example.onlinemarket.mapper.ProductResMapper;
import com.example.onlinemarket.repostory.CategoryRepostory;
import com.example.onlinemarket.repostory.ProductRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepostory productRepostory;
    private final ProductReqMapper productReqMapper;
    private final ProductResMapper productResMapper;
    private final CategoryRepostory categoryRepostory;
    @Override
    public List<ProductResDTO> getALLProduct() {
        return productResMapper.toDTOs(productRepostory.findAll());
    }

    @Override
    public ProductResDTO getProductById(Long id) {
        return productResMapper.toDTO(productRepostory.getReferenceById(id));
    }

    @Override
    public ProductResDTO createProduct(ProductReqDTO productReqDTO) {

        return productResMapper.toDTO(productRepostory.save(productReqMapper.toENTITY(productReqDTO)));
    }

    @Override
    public ProductResDTO updateProduct(Long id, ProductReqDTO productReqDTO) {
        Product product = productRepostory.getReferenceById(id);
        product.setName(productReqDTO.getName());
        product.setUnit(productReqDTO.getUnit());
        product.setPrice(productReqDTO.getPrice());
        product.setAmount(productReqDTO.getAmount());
        product.setCategory(categoryRepostory.getReferenceById(productReqDTO.getCategory_id()));
        return productResMapper.toDTO(productRepostory.save(product));
    }

    @Override
    public void deleteProductById(Long id) {
        productRepostory.deleteById(id);
    }
}
