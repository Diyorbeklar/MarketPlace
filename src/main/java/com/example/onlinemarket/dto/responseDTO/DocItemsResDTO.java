package com.example.onlinemarket.dto.responseDTO;

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
public class DocItemsResDTO {
    DocumentResDTO documentResDTO;
    ProductResDTO productResDTO;
    Integer current_price;
    Integer count;
}
