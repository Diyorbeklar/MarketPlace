package com.example.onlinemarket.controller;

import com.example.onlinemarket.dto.requestDTO.MeasurementReqDTO;
import com.example.onlinemarket.dto.responseDTO.MeasurementResDTO;
import com.example.onlinemarket.service.MeasurementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/measurement")
@RequiredArgsConstructor
public class MeasurementController {
    private final MeasurementService measurementService;
    @GetMapping
    List<MeasurementResDTO> getAllCategories(){
        return measurementService.getALLMeasurement();
    }
    @GetMapping("/{id}")
    MeasurementResDTO getMeasurementById(@PathVariable Long id){
        return measurementService.getMeasurementById(id);
    }
    @PostMapping()
    MeasurementResDTO createMeasurement(@RequestBody MeasurementReqDTO measurementReqDTO){
        return measurementService.createMeasurement(measurementReqDTO);
    }

    @PutMapping("/{id}")
    MeasurementResDTO updateMeasurement(@PathVariable Long id,@RequestBody MeasurementReqDTO measurementReqDTO){
        return measurementService.updateMeasurement(id,measurementReqDTO);
    }

    @DeleteMapping("/{id}")
    void deleteMeasurement(@PathVariable Long id){
        measurementService.deleteMeasurementById(id);
    }

}

