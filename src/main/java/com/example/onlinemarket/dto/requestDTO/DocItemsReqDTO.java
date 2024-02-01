package com.example.onlinemarket.dto.requestDTO;

import com.example.onlinemarket.entity.Document;
import com.example.onlinemarket.entity.Product;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class DocItemsReqDTO {
    Long document_id;
    Long product_id;
    Integer current_price;
    Integer count;
}
