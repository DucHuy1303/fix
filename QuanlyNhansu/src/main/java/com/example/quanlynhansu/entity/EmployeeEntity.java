package com.example.quanlynhansu.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true) // Ràng buộc duy nhất
    private String email;

    @Column(name = "phone_number", nullable = true)
    private String phoneNumber;

    @Column(name = "birthday", nullable = true)
    private LocalDateTime birthday;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "profile_image", nullable = true)
    private String profileImage;

    // Quan hệ ManyToOne với DepartmentEntity
    @ManyToOne
    @JoinColumn(name = "department_id", nullable = true)
    private DepartmentEntity department;

    // Quan hệ ManyToOne với PositionEntity
    @ManyToOne
    @JoinColumn(name = "position_id", nullable = true)
    private PositionEntity position;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}

