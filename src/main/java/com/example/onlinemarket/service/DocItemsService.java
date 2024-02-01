package com.example.onlinemarket.service;

import com.example.onlinemarket.dto.requestDTO.DocItemsReqDTO;
import com.example.onlinemarket.dto.responseDTO.DocItemsResDTO;

import java.util.List;

public interface DocItemsService {
    List<DocItemsResDTO> getALLDocItems();
    DocItemsResDTO getDocItemsById(Long id);
    DocItemsResDTO createDocItems(DocItemsReqDTO docItemsReqDTO);
    DocItemsResDTO updateDocItems(Long id ,DocItemsReqDTO docItemsReqDTO);
    void deleteDocItemsById(Long id);
}
