package com.example.employeeManagement.Controller;

import com.example.employeeManagement.Entity.Employee;
import com.example.employeeManagement.Repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeRespository employeeRespository;

    @Autowired
    public EmployeeController(EmployeeRespository employeeRespository) {
        this.employeeRespository = employeeRespository;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRespository.findAll();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRespository.save(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeRespository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        if (employeeRespository.existsById(id)) {
            updateEmployee(id, employee);
            return employeeRespository.save(employee);
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> softDeleteEmployee(@PathVariable int id) {
        Optional<Employee> employeeOpt = employeeRespository.findById(id);
        if (employeeOpt.isPresent()) {
            Employee employee = employeeOpt.get();
            employee.setDeleted(true);
            employeeRespository.save(employee);
            return ResponseEntity.ok("Employee soft-deleted");
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/search")
    public List<Employee> searchByName(@RequestParam String name) {
        return employeeRespository.findByNameContainingIgnoreCaseAndIsDeletedFalse(name);
    }
    @GetMapping("/salary/greater-than")
    public List<Employee> getBySalaryGreaterThan(@RequestParam int amount) {
        return employeeRespository.findBySalaryGreaterThanAndIsDeletedFalse(amount);
    }


}
