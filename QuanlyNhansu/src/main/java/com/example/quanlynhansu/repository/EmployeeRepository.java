package com.example.quanlynhansu.repository;

import com.example.quanlynhansu.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    // Ví dụ phương thức tìm nhân viên theo email
    EmployeeEntity findByEmail(String email);
}
