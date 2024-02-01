package com.example.onlinemarket.repostory;

import com.example.onlinemarket.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepostory extends JpaRepository<Company,Long> {
}
