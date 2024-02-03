package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.requestDTO.DocItemsReqDTO;
import com.example.onlinemarket.entity.DocItems;
import com.example.onlinemarket.mapper.DocItemsReqMapper;
import com.example.onlinemarket.repostory.DocumentRepostory;
import com.example.onlinemarket.repostory.ProductRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class DocItemsReqMapperImpl implements DocItemsReqMapper {
    private final DocumentRepostory documentRepostory;
    private final ProductRepostory productRepostory;
    @Override
    public DocItemsReqDTO toDTO(DocItems docItems) {
        return null;
    }

    @Override
    public DocItems toENTITY(DocItemsReqDTO docItemsReqDTO) {
        System.out.println(docItemsReqDTO.toString());
        System.out.println(documentRepostory.getReferenceById(2L));
        return DocItems.builder().count(docItemsReqDTO.getCount())
                .come_price(docItemsReqDTO.getCome_price())
                .document(documentRepostory.getReferenceById(docItemsReqDTO.getDocument_id()))
                .product(productRepostory.getReferenceById(docItemsReqDTO.getProduct_id()))
                .build();
    }

    @Override
    public List<DocItemsReqDTO> toDTOs(List<DocItems> docItems) {
        return null;
    }

    @Override
    public List<DocItems> toENTOTies(List<DocItemsReqDTO> docItemsReqDTOS) {
        return docItemsReqDTOS.stream().map(this::toENTITY).collect(Collectors.toList());
    }
}
