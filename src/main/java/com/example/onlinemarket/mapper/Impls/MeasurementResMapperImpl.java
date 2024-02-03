package com.example.onlinemarket.mapper.Impls;

import com.example.onlinemarket.dto.responseDTO.MeasurementResDTO;
import com.example.onlinemarket.entity.Measurement;
import com.example.onlinemarket.mapper.MeasurementResMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class MeasurementResMapperImpl implements MeasurementResMapper {
    @Override
    public MeasurementResDTO toDTO(Measurement measurement) {
        return MeasurementResDTO.builder()
                .name(measurement.getName())
                .build();
    }

    @Override
    public Measurement toENTITY(MeasurementResDTO measurementResDTO) {
        return null;
    }

    @Override
    public List<MeasurementResDTO> toDTOs(List<Measurement> measurements) {
        return measurements.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Measurement> toENTOTies(List<MeasurementResDTO> measurementResDTOS) {
        return null;
    }
}
