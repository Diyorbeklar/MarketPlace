package com.example.onlinemarket.dto.responseDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class CompanyResDTO {
    String name;
    String address;
    String tell;
    String description;
}
