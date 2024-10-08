package com.example.quanlynhansu.controller;

import com.example.quanlynhansu.entity.PermissionEntity;
import com.example.quanlynhansu.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permissions")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping
    public List<PermissionEntity> getAllPermissions() {
        return permissionService.getAllPermissions();
    }

    @PostMapping
    public PermissionEntity createOrUpdatePermission(@RequestBody PermissionEntity permission) {
        return permissionService.saveOrUpdatePermission(permission);
    }
}
