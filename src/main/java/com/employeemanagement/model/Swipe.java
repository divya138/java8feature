package com.employeemanagement.model;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table
public class Swipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int swipeId;
	@Temporal(TemporalType.TIME)
	private Date swipeIn;
	@Temporal(TemporalType.TIME)
	private Date swipeOut;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "employeeCode")
	@JsonIgnore
	private Employee employee;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "facilityId")
	@JsonIgnore
	private Facility facility;
	public int getSwipeId() {
		return swipeId;
	}
	public void setSwipeId(int swipeId) {
		this.swipeId = swipeId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Facility getFacility() {
		return facility;
	}
	public void setFacility(Facility facility) {
		this.facility = facility;
	}
	public Date getSwipeIn() {
		return swipeIn;
	}
	public void setSwipeIn(Date swipeIn) {
		this.swipeIn = swipeIn;
	}
	public Date getSwipeOut() {
		return swipeOut;
	}
	public void setSwipeOut(Date swipeOut) {
		this.swipeOut = swipeOut;
	}
	public Swipe() {
		super();
	}
	@Override
	public String toString() {
		return "Swipe [swipeId=" + swipeId + ", swipeIn=" + swipeIn + ", swipeOut=" + swipeOut + ", employee="
				+ employee + ", facility=" + facility + "]";
	}
	
	
	
	
	
	

}
