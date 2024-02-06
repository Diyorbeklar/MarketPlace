package com.example.onlinemarket.mapper;

import com.example.onlinemarket.dto.requestDTO.MeasurementReqDTO;
import com.example.onlinemarket.entity.Measurement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MeasurementReqMapper extends CommonMapper<MeasurementReqDTO, Measurement>{
}
