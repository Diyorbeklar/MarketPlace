package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.responseDTO.DocItemsResDTO;
import com.example.onlinemarket.entity.DocItems;
import com.example.onlinemarket.mapper.DocItemsResMapper;
import com.example.onlinemarket.mapper.DocumentResMapper;
import com.example.onlinemarket.mapper.ProductResMapper;
import com.example.onlinemarket.repostory.ProductRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class DocItemsResMapperImpl implements DocItemsResMapper {
    final private ProductResMapper productResMapper;
    final private DocumentResMapper documentResMapper;
    @Override
    public DocItemsResDTO toDTO(DocItems docItems) {
        return DocItemsResDTO.builder()
                .count(docItems.getCount())
                .come_price(docItems.getCome_price())
                .documentResDTO(documentResMapper.toDTO(docItems.getDocument()))
                .productResDTO(productResMapper.toDTO(docItems.getProduct()))
                .build();
    }

    @Override
    public DocItems toENTITY(DocItemsResDTO docItemsResDTO) {
        return null;
    }

    @Override
    public List<DocItemsResDTO> toDTOs(List<DocItems> docItems) {
        return docItems.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<DocItems> toENTOTies(List<DocItemsResDTO> docItemsResDTOS) {
        return null;
    }
}
