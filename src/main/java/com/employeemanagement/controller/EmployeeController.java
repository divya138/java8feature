package com.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.dto.EmployeeDto;
import com.employeemanagement.dto.ResponseMessage;
import com.employeemanagement.model.Employee;
import com.employeemanagement.service.EmployeeService;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

@RestController
public class EmployeeController {
	 @Autowired
		private EmployeeService employeeService;
		 @PostMapping("/empoyee")
	  public ResponseEntity<ResponseMessage> createEmployee(@RequestBody EmployeeDto employeedto){
			 ResponseMessage employee=employeeService.createEmployee(employeedto);
		  return new ResponseEntity<ResponseMessage>(employee, HttpStatus.OK);
	  }
	  
		 @PutMapping("/employee")
		  public ResponseEntity<Employee> updateemployee(@RequestBody EmployeeDto employeedto){
			 Employee employee=employeeService.updateEmployee(employeedto);
			  return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		  }
		 
		 @DeleteMapping("/employee/{employeeCode}")
		 public ResponseEntity<ResponseMessage>  deleteEmployess(@PathVariable int employeeCode){
			 ResponseMessage employee=employeeService.deleteEmployee(employeeCode);
			 return new ResponseEntity<ResponseMessage>(employee, HttpStatus.OK);
			 
		 }
		 
		 @GetMapping("/employee/{employeeCode}") 
		 public ResponseEntity<Employee>  getEmployee(@PathVariable int employeeCode){
			Employee employee=employeeService.getByEmployee(employeeCode);
			 return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		 }
		 
		 @GetMapping("/employee")
		 public ResponseEntity<List<Employee>> getAllEmployess(){
			 List<Employee> employess=employeeService.getAllEmployess();
			 return new ResponseEntity<List<Employee>>(employess, HttpStatus.OK);
		 }
		 


}
