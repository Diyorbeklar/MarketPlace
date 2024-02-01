package com.example.onlinemarket.dto.responseDTO;

import com.example.onlinemarket.entity.Company;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class DocumentResDTO {
    CompanyResDTO companyResDTO;
    Date date;
    Integer document_number;
}
