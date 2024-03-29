package com.example.onlinemarket.dto.requestDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class CompanyReqDTO {
    String name;
    String address;
    String tell;
    String description;
}
