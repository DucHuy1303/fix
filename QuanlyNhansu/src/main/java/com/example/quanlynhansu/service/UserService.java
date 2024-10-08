package com.example.quanlynhansu.service;

import com.example.quanlynhansu.entity.UserEntity;
import com.example.quanlynhansu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Lấy tất cả người dùng
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    // Lấy người dùng theo ID
    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Tạo hoặc cập nhật người dùng
    public UserEntity saveOrUpdateUser(UserEntity user) {
        return userRepository.save(user);
    }

    // Xóa người dùng theo ID
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}

