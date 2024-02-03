package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.requestDTO.MeasurementReqDTO;
import com.example.onlinemarket.entity.Measurement;
import com.example.onlinemarket.mapper.MeasurementReqMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class MeasurementReqMapperImpl implements MeasurementReqMapper {
    @Override
    public MeasurementReqDTO toDTO(Measurement measurement) {
        return null;
    }

    @Override
    public Measurement toENTITY(MeasurementReqDTO measurementReqDTO) {
        return Measurement.builder().name(measurementReqDTO.getName()).build();
    }

    @Override
    public List<MeasurementReqDTO> toDTOs(List<Measurement> measurements) {
        return null;
    }

    @Override
    public List<Measurement> toENTOTies(List<MeasurementReqDTO> measurementReqDTOS) {
        return measurementReqDTOS.stream().map(this::toENTITY).collect(Collectors.toList());
    }
}
