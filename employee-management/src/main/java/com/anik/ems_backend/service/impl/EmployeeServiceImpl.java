package com.anik.ems_backend.service.impl;

import com.anik.ems_backend.dto.EmployeeDTO;
import com.anik.ems_backend.entity.Employee;
import com.anik.ems_backend.exception.ResourceNotFoundException;
import com.anik.ems_backend.mapper.EmployeeMapper;
import com.anik.ems_backend.repository.EmployeeRepository;
import com.anik.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        Employee saveEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDTO(saveEmployee);
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Employee is not exist with given id: "+id));
        return EmployeeMapper.mapToEmployeeDTO(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                .map(EmployeeMapper::mapToEmployeeDTO)
                .toList();
    }

    @Override
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO employeeDTO) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Employee is not exist with given id: "+id));
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setEmail(employeeDTO.getEmail());
        Employee updatedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDTO(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Employee is not exist with given id: "+id));
        employeeRepository.delete(employee);
    }
}
