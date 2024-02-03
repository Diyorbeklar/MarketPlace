package com.example.onlinemarket.repostory;

import com.example.onlinemarket.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementRepostory extends JpaRepository<Measurement,Long> {
}
