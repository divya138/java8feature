package com.employeemanagement.service;

import java.util.List;

import com.employeemanagement.dto.EmployeeDto;
import com.employeemanagement.dto.ResponseMessage;
import com.employeemanagement.model.Employee;
public interface EmployeeService {
    public ResponseMessage createEmployee(EmployeeDto employeedto);
    public Employee updateEmployee(EmployeeDto employeedto);
    public ResponseMessage deleteEmployee(int employeeCode);
    public Employee getByEmployee(int employeeCode);
    public List<Employee> getAllEmployess();
}
