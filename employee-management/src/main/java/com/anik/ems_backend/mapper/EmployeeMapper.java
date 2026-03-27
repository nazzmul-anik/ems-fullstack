package com.anik.ems_backend.mapper;

import com.anik.ems_backend.dto.EmployeeDTO;
import com.anik.ems_backend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDTO mapToEmployeeDTO(Employee employee) {
        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDTO employeeDTO) {
        return new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getFirstName(),
                employeeDTO.getEmail()
        );
    }
}
