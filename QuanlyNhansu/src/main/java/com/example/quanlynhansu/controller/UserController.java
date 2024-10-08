package com.example.quanlynhansu.controller;

import com.example.quanlynhansu.entity.UserEntity;
import com.example.quanlynhansu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users") // Đường dẫn cơ bản cho API users
public class UserController {

    @Autowired
    private UserService userService;

    // API lấy tất cả người dùng
    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    // API lấy người dùng theo ID
    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // API tạo hoặc cập nhật người dùng
    @PostMapping
    public UserEntity createOrUpdateUser(@RequestBody UserEntity user) {
        return userService.saveOrUpdateUser(user);
    }

    // API xóa người dùng theo ID
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
    }
}
