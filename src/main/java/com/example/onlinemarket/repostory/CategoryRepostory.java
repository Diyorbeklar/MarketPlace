package com.example.onlinemarket.repostory;

import com.example.onlinemarket.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepostory extends JpaRepository<Category,Long> {
}
