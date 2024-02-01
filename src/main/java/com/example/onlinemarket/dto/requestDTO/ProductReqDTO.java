package com.example.onlinemarket.dto.requestDTO;

import com.example.onlinemarket.Unit;
import com.example.onlinemarket.entity.Category;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class ProductReqDTO {
    Long category_id;
    String name;
    Integer price;
    Unit unit;
    Integer amount;
}
