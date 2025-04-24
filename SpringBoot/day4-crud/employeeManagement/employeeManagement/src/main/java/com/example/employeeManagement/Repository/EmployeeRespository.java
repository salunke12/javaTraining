package com.example.employeeManagement.Repository;

import com.example.employeeManagement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRespository extends JpaRepository<Employee, Integer> {
    List<Employee> findByNameContainingIgnoreCaseAndIsDeletedFalse(String name);
    List<Employee> findBySalaryGreaterThanAndIsDeletedFalse(int salary);

}
