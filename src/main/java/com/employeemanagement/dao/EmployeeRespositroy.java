package com.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanagement.model.Employee;

public interface EmployeeRespositroy extends JpaRepository<Employee, Integer>{

}
