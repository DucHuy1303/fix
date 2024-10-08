package com.example.quanlynhansu.controller;

import com.example.quanlynhansu.entity.DepartmentEntity;
import com.example.quanlynhansu.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<DepartmentEntity> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping
    public DepartmentEntity createOrUpdateDepartment(@RequestBody DepartmentEntity department) {
        return departmentService.saveOrUpdateDepartment(department);
    }
}