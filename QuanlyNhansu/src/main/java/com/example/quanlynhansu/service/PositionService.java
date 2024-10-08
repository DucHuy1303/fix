package com.example.quanlynhansu.service;

import com.example.quanlynhansu.entity.PositionEntity;
import com.example.quanlynhansu.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {

    @Autowired
    private PositionRepository positionRepository;

    public List<PositionEntity> getAllPositions() {
        return positionRepository.findAll();
    }

    public PositionEntity saveOrUpdatePosition(PositionEntity position) {
        return positionRepository.save(position);
    }
}
