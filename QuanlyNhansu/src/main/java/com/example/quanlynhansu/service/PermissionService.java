package com.example.quanlynhansu.service;

import com.example.quanlynhansu.entity.PermissionEntity;
import com.example.quanlynhansu.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    public List<PermissionEntity> getAllPermissions() {
        return permissionRepository.findAll();
    }

    public PermissionEntity saveOrUpdatePermission(PermissionEntity permission) {
        return permissionRepository.save(permission);
    }
}

