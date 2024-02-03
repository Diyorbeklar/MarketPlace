package com.example.onlinemarket.service;

import com.example.onlinemarket.dto.requestDTO.ProductPriceReqDTO;
import com.example.onlinemarket.dto.responseDTO.ProductPriceResDTO;
import com.example.onlinemarket.entity.ProductPrice;
import com.example.onlinemarket.mapper.ProductPriceReqMapper;
import com.example.onlinemarket.mapper.ProductPriceResMapper;
import com.example.onlinemarket.mapper.ProductResMapper;
import com.example.onlinemarket.repostory.ProductPriceRepostory;
import com.example.onlinemarket.repostory.ProductRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductPriceServiceImpl implements ProductPriceService{
    private final ProductPriceRepostory productPriceRepostory;
    private final ProductPriceResMapper productPriceResMapper;
    private final ProductPriceReqMapper productPriceReqMapper;
    private final ProductRepostory productRepostory;
    @Override
    public List<ProductPriceResDTO> getALLProductPrice() {
        return productPriceResMapper.toDTOs(productPriceRepostory.findAll()) ;
    }

    @Override
    public ProductPriceResDTO getProductPriceById(Long id) {
        return productPriceResMapper.toDTO(productPriceRepostory.getReferenceById(id));
    }

    @Override
    public ProductPriceResDTO createProductPrice(ProductPriceReqDTO productPriceReqDTO) {
        return productPriceResMapper.toDTO(productPriceRepostory.save(productPriceReqMapper.toENTITY(productPriceReqDTO)));
    }

    @Override
    public ProductPriceResDTO updateProductPrice(Long id, ProductPriceReqDTO productPriceReqDTO) {
        ProductPrice productPrice = new ProductPrice();
        productPrice.setProduct(productRepostory.getReferenceById(productPriceReqDTO.getProduct_id()));
        productPrice.setPrice(productPriceReqDTO.getPrice());
        productPrice.setStatus(productPriceReqDTO.getStatus());
        productPrice.setDate(productPriceReqDTO.getDate());
        return productPriceResMapper.toDTO(productPrice);
    }

    @Override
    public void deleteProductPriceById(Long id) {
       productPriceRepostory.deleteById(id);
    }
}
