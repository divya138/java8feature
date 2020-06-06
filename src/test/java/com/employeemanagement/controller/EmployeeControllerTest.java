package com.employeemanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoJUnitRunner.Silent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.employeemanagement.dto.EmployeeDto;
import com.employeemanagement.dto.ResponseMessage;
import com.employeemanagement.model.Employee;
import com.employeemanagement.service.EmployeeService;
@RunWith(Silent.class)
public class EmployeeControllerTest {
	
	private static final EmployeeDto employeedto = null;
	@InjectMocks
	EmployeeController employeeeController;
	@Mock
	EmployeeService employeeService;
	
	@Test
	public void testEmployeeByIdForPositive() {
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		Mockito.when(employeeService.getByEmployee(5190)).thenReturn(employee);
		ResponseEntity<Employee> employee1 = employeeeController.getEmployee(89998);
		Assert.assertNotNull(employee1);
		Assert.assertEquals(HttpStatus.OK, employee1.getStatusCode());

	}

	@Test
	public void testStudentByIdForNegative() {
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		Mockito.when(employeeService.getByEmployee(-5190)).thenReturn(employee);
		ResponseEntity<Employee> employee1 = employeeeController.getEmployee(-5190);
		Assert.assertNotNull(employee1);
		Assert.assertEquals(HttpStatus.OK, employee1.getStatusCode());

	}

	@Test
	public void testDeleteStudentForPositive() {
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		employeeService.deleteEmployee(5190);
		ResponseEntity<ResponseMessage> employee1 = employeeeController.deleteEmployess(5190);
		Assert.assertNotNull(employee1);
		Assert.assertEquals(HttpStatus.OK, employee1.getStatusCode());

	}


	@Test
	public void testDeleteStudentForNegative() {
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		employeeService.deleteEmployee(-5190);
		ResponseEntity<ResponseMessage> employee1 = employeeeController.deleteEmployess(5190);
		Assert.assertNotNull(employee1);
		Assert.assertEquals(HttpStatus.OK, employee1.getStatusCode());

	}

	@Test
	public void testGetAllStudentForPositive() {

		List<Employee> employees = new ArrayList<Employee>();
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		employees.add(employee);
		Mockito.when(employeeService.getAllEmployess()).thenReturn(employees);
		ResponseEntity<List<Employee>> re = employeeeController.getAllEmployess();
		Assert.assertNotNull(re);
		Assert.assertEquals(HttpStatus.OK, re.getStatusCode());

	}
	@Test
	public void testGetAllStudentForNegative() {

		List<Employee> employees = new ArrayList<Employee>();
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		employees.add(employee);
		Mockito.when(employeeService.getAllEmployess()).thenReturn(employees);
		ResponseEntity<List<Employee>> re = employeeeController.getAllEmployess();
		Assert.assertNotNull(re);
		Assert.assertEquals(HttpStatus.OK, re.getStatusCode());

	}

	@Test
	public void testUpdateStudentForPositive() {
		EmployeeDto dto=new EmployeeDto();
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		Mockito.when(employeeService.updateEmployee(employeedto)).thenReturn(employee);
		ResponseEntity<Employee> employee1 = employeeeController.updateemployee(dto);
		Assert.assertNotNull(employee1);
		Assert.assertEquals(HttpStatus.OK, employee1.getStatusCode());

	}

	@Test
	public void testUpdateStudentForNegative() {
		EmployeeDto dto=new EmployeeDto();
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		Mockito.when(employeeService.updateEmployee(employeedto)).thenReturn(employee);
		ResponseEntity<Employee> employee1 = employeeeController.updateemployee(dto);
		Assert.assertNotNull(employee1);
		Assert.assertEquals(HttpStatus.OK, employee1.getStatusCode());

	}



}
