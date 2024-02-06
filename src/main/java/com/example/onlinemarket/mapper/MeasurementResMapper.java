package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.responseDTO.MeasurementResDTO;
import com.example.onlinemarket.entity.Measurement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MeasurementResMapper extends CommonMapper<MeasurementResDTO, Measurement> {
}
