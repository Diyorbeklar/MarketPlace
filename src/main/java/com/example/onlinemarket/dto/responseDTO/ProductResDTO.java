package com.example.onlinemarket.dto.responseDTO;

import com.example.onlinemarket.Unit;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class ProductResDTO {
    CategoryResDTO categoryResDTO;
    String name;
    Integer price;
    Unit unit;
    Integer amount;
}

