package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.requestDTO.DocItemsReqDTO;
import com.example.onlinemarket.entity.DocItems;
import com.example.onlinemarket.entity.Document;
import com.example.onlinemarket.entity.Product;
import com.example.onlinemarket.repostory.DocumentRepostory;
import com.example.onlinemarket.repostory.ProductRepostory;
import jakarta.persistence.EntityNotFoundException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class DocItemsReqMapper implements CommonMapper<DocItemsReqDTO, DocItems>{
    @Autowired
    private  DocumentRepostory documentRepostory;
    @Autowired
    private  ProductRepostory productRepostory;

    @Mapping(target = "document",expression = "java(findDocumentById(docItemsReqDTO.getDocument_id()))")
    @Mapping(target = "product",expression = "java(findProductById(docItemsReqDTO.getProduct_id()))")
    public abstract DocItems toENTITY(DocItemsReqDTO docItemsReqDTO);

    protected Document findDocumentById(Long id){
        return documentRepostory.findById(id).orElseThrow(()-> new EntityNotFoundException("Not found document"));
    }

    protected Product findProductById(Long id){
        return productRepostory.findById(id).orElseThrow(()-> new EntityNotFoundException("Not found product"));
    }



}
