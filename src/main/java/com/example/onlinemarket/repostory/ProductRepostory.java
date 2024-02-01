package com.example.onlinemarket.repostory;

import com.example.onlinemarket.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepostory extends JpaRepository<Product,Long> {
}
