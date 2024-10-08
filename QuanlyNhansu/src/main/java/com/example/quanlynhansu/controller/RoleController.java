package com.example.quanlynhansu.controller;

import com.example.quanlynhansu.entity.RoleEntity;
import com.example.quanlynhansu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<RoleEntity> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PostMapping
    public RoleEntity createOrUpdateRole(@RequestBody RoleEntity role) {
        return roleService.saveOrUpdateRole(role);
    }
}
