package com.example.quanlynhansu.repository;

import com.example.quanlynhansu.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Phương thức tìm người dùng theo tên đăng nhập (username)
    UserEntity findByUsername(String username);
}

