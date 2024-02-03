package com.example.onlinemarket.repostory;

import com.example.onlinemarket.entity.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPriceRepostory extends JpaRepository<ProductPrice,Long> {
}
