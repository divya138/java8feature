package com.employeemanagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeCode;
	private String employeeName;
	private String projectName;
	@Column(unique=true)
	private String email;
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Swipe> swipe;
	public int getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Swipe> getSwipe() {
		return swipe;
	}
	public void setSwipe(List<Swipe> swipe) {
		this.swipe = swipe;
	}
	public Employee(String employeeName, String projectName, String email, List<Swipe> swipe) {
		super();
		this.employeeName = employeeName;
		this.projectName = projectName;
		this.email = email;
		this.swipe = swipe;
	}
	public Employee() {
		super();
	}
	public Employee(int employeeCode, String employeeName, String projectName, String email, List<Swipe> swipe) {
		super();
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.projectName = projectName;
		this.email = email;
		this.swipe = swipe;
	}
	public Employee(int i, String projectName2, String email2, String string) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
