package com.example.onlinemarket.dto.requestDTO;

import com.example.onlinemarket.entity.Company;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class DocumentReqDTO {
    Long company_id;
    Date date;
    Integer document_number;
}
