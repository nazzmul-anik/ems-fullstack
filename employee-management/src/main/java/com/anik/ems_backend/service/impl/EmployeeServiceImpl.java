package com.anik.ems_backend.service.impl;

import com.anik.ems_backend.dto.EmployeeDTO;
import com.anik.ems_backend.entity.Employee;
import com.anik.ems_backend.mapper.EmployeeMapper;
import com.anik.ems_backend.repository.EmployeeRepository;
import com.anik.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
}
