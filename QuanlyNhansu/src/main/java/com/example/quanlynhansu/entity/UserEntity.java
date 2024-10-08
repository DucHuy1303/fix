package com.example.quanlynhansu.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity // Đánh dấu đây là một entity JPA
@Table(name = "users") // Tên bảng trong CSDL
@Data // Tạo getter, setter, toString, equals và hashCode bằng Lombok
@NoArgsConstructor // Tạo constructor không tham số bằng Lombok
@AllArgsConstructor // Tạo constructor có tham số bằng Lombok
public class UserEntity {

    @Id // Đánh dấu khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Tự động tăng giá trị khóa chính
    private Long id;

    @Column(name = "username", nullable = false, unique = true) // Ràng buộc không null và duy nhất
    private String username;

    @Column(name = "password", nullable = false) // Ràng buộc không null
    private String password;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true) // Ràng buộc không null và duy nhất
    private String email;

    @Column(name = "phone_number", nullable = true) // Cho phép null
    private String phoneNumber;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;


    // Quan hệ ManyToMany với RoleEntity thông qua bảng trung gian user_roles
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<RoleEntity> roles = new HashSet<>();
}

