package com.example.onlinemarket.service;

import com.example.onlinemarket.dto.requestDTO.DocumentReqDTO;
import com.example.onlinemarket.dto.responseDTO.DocumentResDTO;

import java.util.List;

public interface DocumentService {
    List<DocumentResDTO> getALLDocument();
    DocumentResDTO getDocumentById(Long id);
    DocumentResDTO createDocument(DocumentReqDTO documentReqDTO);
    DocumentResDTO updateDocument(Long id ,DocumentReqDTO documentReqDTO);
    void deleteDocumentById(Long id);
}
