package com.example.onlinemarket.repostory;

import com.example.onlinemarket.entity.DocItems;
import com.example.onlinemarket.mapper.CommonMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocItemsRepostory extends JpaRepository<DocItems,Long> {
}
