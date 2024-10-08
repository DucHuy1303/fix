package com.example.quanlynhansu.controller;

import com.example.quanlynhansu.entity.PositionEntity;
import com.example.quanlynhansu.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @GetMapping
    public List<PositionEntity> getAllPositions() {
        return positionService.getAllPositions();
    }

    @PostMapping
    public PositionEntity createOrUpdatePosition(@RequestBody PositionEntity position) {
        return positionService.saveOrUpdatePosition(position);
    }
}
