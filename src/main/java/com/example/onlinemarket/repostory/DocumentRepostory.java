package com.example.onlinemarket.repostory;

import com.example.onlinemarket.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepostory extends JpaRepository<Document,Long> {
}
