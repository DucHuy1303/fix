package com.example.quanlynhansu.service;

import com.example.quanlynhansu.entity.DepartmentEntity;
import com.example.quanlynhansu.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<DepartmentEntity> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public DepartmentEntity saveOrUpdateDepartment(DepartmentEntity department) {
        return departmentRepository.save(department);
    }
}
