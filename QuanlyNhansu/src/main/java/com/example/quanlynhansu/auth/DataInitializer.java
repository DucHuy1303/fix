package com.example.quanlynhansu.auth;

import com.example.quanlynhansu.entity.UserEntity;
import com.example.quanlynhansu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;

@Configuration
public class DataInitializer {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public CommandLineRunner initData() {
        return args -> {
            // Kiểm tra nếu chưa có người dùng, thì thêm người dùng mới
            if (userRepository.findByUsername("admin") == null) {
                UserEntity user = new UserEntity();
                user.setUsername("admin");
                user.setPassword(passwordEncoder.encode("password123"));
                user.setEmail("admin@example.com");
                user.setFirstName("Admin");
                user.setLastName("User");
                user.setPhoneNumber("0123456789");
                user.setIsActive(true);
                user.setCreatedAt(LocalDateTime.now()); // Khởi tạo createdAt với thời gian hiện tại
                user.setUpdatedAt(LocalDateTime.now()); // Khởi tạo updatedAt với thời gian hiện tại

                // Lưu người dùng vào database
                userRepository.save(user);
                System.out.println("Tài khoản mặc định đã được tạo: admin / password123");
            }
        };
    }
}

