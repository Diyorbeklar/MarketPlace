package com.example.onlinemarket.service;

import com.example.onlinemarket.dto.requestDTO.DocItemsReqDTO;
import com.example.onlinemarket.dto.responseDTO.DocItemsResDTO;
import com.example.onlinemarket.entity.DocItems;
import com.example.onlinemarket.mapper.DocItemsReqMapper;
import com.example.onlinemarket.mapper.DocItemsResMapper;
import com.example.onlinemarket.repostory.DocItemsRepostory;
import com.example.onlinemarket.repostory.DocumentRepostory;
import com.example.onlinemarket.repostory.ProductRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocItemsServiceImpl implements DocItemsService{
    private final DocItemsRepostory docItemsRepostory;
    private final DocItemsReqMapper docItemsReqMapper;
    private final DocItemsResMapper docItemsResMapper;
    private final ProductRepostory productRepostory;
    private final DocumentRepostory documentRepostory;
    @Override
    public List<DocItemsResDTO> getALLDocItems() {
        return docItemsResMapper.toDTOs(docItemsRepostory.findAll());
    }

    @Override
    public DocItemsResDTO getDocItemsById(Long id) {

        return docItemsResMapper.toDTO(docItemsRepostory.getReferenceById(id));
    }

    @Override
    public DocItemsResDTO createDocItems(DocItemsReqDTO docItemsReqDTO) {

        return docItemsResMapper.toDTO(docItemsRepostory.save(docItemsReqMapper.toENTITY(docItemsReqDTO)));
    }

    @Override
    public DocItemsResDTO updateDocItems(Long id, DocItemsReqDTO docItemsReqDTO) {
        DocItems docItems = docItemsRepostory.getReferenceById(id);
        docItems.setCount(docItemsReqDTO.getCount());
        docItems.setCurrent_price(docItemsReqDTO.getCurrent_price());
        docItems.setDocument(documentRepostory.getReferenceById(docItemsReqDTO.getDocument_id()));
        docItems.setProduct(productRepostory.getReferenceById(docItemsReqDTO.getProduct_id()));
        return docItemsResMapper.toDTO(docItemsRepostory.save(docItems));
    }

    @Override
    public void deleteDocItemsById(Long id) {
        docItemsRepostory.deleteById(id);
    }
}

