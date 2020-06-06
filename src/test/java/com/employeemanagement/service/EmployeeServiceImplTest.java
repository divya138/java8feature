package com.employeemanagement.service;


import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.employeemanagement.dao.EmployeeRespositroy;
import com.employeemanagement.dto.EmployeeDto;
import com.employeemanagement.model.Employee;
@RunWith(MockitoJUnitRunner.Silent.class)
public class EmployeeServiceImplTest {
	

	private static final EmployeeDto employeedto = null;

	@InjectMocks
	EmployeeServiceImpl employeeServiceImpl;

	@Mock
	EmployeeRespositroy employeeRepository;
	
	@Test
	public void testGetEmployeesForPositive() {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		employees.add(employee);
		Employee employee1=new Employee(778887, "divya", "db", "divya@gmail.com");
		employees.add(employee1);
		Mockito.when(employeeRepository.findAll()).thenReturn(employees);
		List<Employee> employee2 = employeeServiceImpl.getAllEmployess();
		Assert.assertNotNull(employee2);
		Assert.assertEquals(2, employee2.size());

	}

	@Test
	public void testGetEmployeesForNegative() {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		employees.add(employee);
		Employee employee1=new Employee(778887, "divya", "db", "divya@gmail.com");
		employees.add(employee1);
		Mockito.when(employeeRepository.findAll()).thenReturn(employees);
		List<Employee> employee2 = employeeServiceImpl.getAllEmployess();
		Assert.assertNotNull(employee2);
		Assert.assertEquals(2, employee2.size());

	}

	@Test
	public void testFindByIdForPositive() {
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		Mockito.when(employeeRepository.findById(5190)).thenReturn(Optional.of(employee));
		Employee employee1 = employeeServiceImpl.getByEmployee(5190);
		
	}

	@Test
	public void testFindByIdForNegative() {
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		Mockito.when(employeeRepository.findById(-5190)).thenReturn(Optional.of(employee));
		Employee employee1 = employeeServiceImpl.getByEmployee(-5190);
		}
	@Test
	public void testCreateEmployeeForPositive() {
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
		Assert.assertNotNull(employee);
	}


	@Test
	public void testCreateEmployeeForNegative() {
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
		Assert.assertNotNull(employee);
	}


	@Test
	public void removeEmployeeForPositive() {
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		employeeServiceImpl.deleteEmployee(5190);
		verify(employeeRepository, times(1)).deleteById(5190);
	}

	@Test
	public void removeEmployeeForNegative() {
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		employeeServiceImpl.deleteEmployee(-5190);
		verify(employeeRepository, times(1)).deleteById(-5190);
	}



	@Test
	public void testupdateEmployeeForPositive() {
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
	}

	@Test
	public void testupdateEmployeeForNegative() {
		EmployeeDto dto=new EmployeeDto();
		Employee employee=new Employee(778887, "divya", "db", "divya@gmail.com");
		Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
	
	}
	

}
