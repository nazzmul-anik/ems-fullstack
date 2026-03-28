package com.anik.ems_backend.controller;

import com.anik.ems_backend.dto.EmployeeDTO;
import com.anik.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    // Create Employee
    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeDTO saveEmployee = employeeService.createEmployee(employeeDTO);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }

    // Get employee by id
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id){
        EmployeeDTO employeeDTO = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employeeDTO);
    }

    // Get all employees
    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees(){
        List<EmployeeDTO> employeeDTOS = employeeService.getAllEmployees();
        return ResponseEntity.ok(employeeDTOS);
    }

    // Update employee
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO) {
        EmployeeDTO updatedEmployee = employeeService.updateEmployee(id, employeeDTO);
        return ResponseEntity.ok(updatedEmployee);
    }

    // Delete employee
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Employee has been deleted successfully!");
    }
}
