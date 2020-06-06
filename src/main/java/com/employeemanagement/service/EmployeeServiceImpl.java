package com.employeemanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.dao.EmployeeRespositroy;
import com.employeemanagement.dto.EmployeeDto;
import com.employeemanagement.dto.ResponseMessage;
import com.employeemanagement.exception.EmployeeDataNotFoundException;
import com.employeemanagement.model.Employee;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRespositroy employeeRespositroy;
	Employee employee = new Employee();
	ResponseMessage dto = new ResponseMessage();

	@Override
	public ResponseMessage createEmployee(EmployeeDto employeedto) {
		BeanUtils.copyProperties(employeedto, employee);
		employee = employeeRespositroy.save(employee);
		dto.setMessage("create successfully");
		return dto;

	}

	@Override
	public Employee updateEmployee(EmployeeDto employeedto) {
		EmployeeDto employeeDto = new EmployeeDto();
		Employee employee1;
		if (employee != null) {
			employee1= employeeRespositroy.save(employee);
			BeanUtils.copyProperties(employee1, employeeDto);
			return employee;
		} else {
			throw new EmployeeDataNotFoundException("no data found");
		}

	}


	@Override
	public ResponseMessage deleteEmployee(int employeeCode) {
		employeeRespositroy.deleteById(employeeCode);
		dto.setMessage("deleted successfully");
		return dto;
	}

	@Override
	public Employee getByEmployee(int employeeCode){
		return employeeRespositroy.getOne(employeeCode);
	}

	@Override
	public List<Employee> getAllEmployess() {
		return employeeRespositroy.findAll();
	}

}
