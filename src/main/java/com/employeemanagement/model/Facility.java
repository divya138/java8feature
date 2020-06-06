package com.employeemanagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Facility {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int facilityId;
	private String facilityName;
	private String facilityBranch;
	private String facilityCity;
	@OneToMany(mappedBy = "facility", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Swipe> swipe;
	public int getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}
	public String getFacilityName() {
		return facilityName;
	}
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	public String getFacilityBranch() {
		return facilityBranch;
	}
	public void setFacilityBranch(String facilityBranch) {
		this.facilityBranch = facilityBranch;
	}
	public String getFacilityCity() {
		return facilityCity;
	}
	public void setFacilityCity(String facilityCity) {
		this.facilityCity = facilityCity;
	}
	public List<Swipe> getSwipe() {
		return swipe;
	}
	public void setSwipe(List<Swipe> swipe) {
		this.swipe = swipe;
	}
	public Facility(String facilityName, String facilityBranch, String facilityCity, List<Swipe> swipe) {
		super();
		this.facilityName = facilityName;
		this.facilityBranch = facilityBranch;
		this.facilityCity = facilityCity;
		this.swipe = swipe;
	}
	public Facility() {
		super();
	}
	
	
	
	

}
