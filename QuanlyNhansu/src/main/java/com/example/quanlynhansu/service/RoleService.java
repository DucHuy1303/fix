package com.example.quanlynhansu.service;

import com.example.quanlynhansu.entity.RoleEntity;
import com.example.quanlynhansu.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<RoleEntity> getAllRoles() {
        return roleRepository.findAll();
    }

    public RoleEntity saveOrUpdateRole(RoleEntity role) {
        return roleRepository.save(role);
    }
}
