package com.example.onlinemarket.dto.responseDTO;

import com.example.onlinemarket.entity.Product;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class ProductPriceResDTO {
    ProductResDTO productResDTO;
    Double price;
    Date date;
    Boolean status;
}
