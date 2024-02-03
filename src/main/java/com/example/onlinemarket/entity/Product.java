package com.example.onlinemarket.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @ManyToOne(cascade = CascadeType.ALL)
    Category category;
    @ManyToOne(cascade = CascadeType.ALL)
    Measurement measurement;
    Integer amount;

}
