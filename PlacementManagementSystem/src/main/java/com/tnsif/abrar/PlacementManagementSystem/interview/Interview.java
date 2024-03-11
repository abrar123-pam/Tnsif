package com.tnsif.abrar.PlacementManagementSystem.interview;

import java.time.LocalDate;
import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Interview {
	
	//Id is primary key and auto incremented
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int interviewId;
	private int applicationId;
	
	//@JsonFormat(pattern="YYYY-MM-DD")
	private LocalDate interviewDate;
	private String interviewLocation;
	private String interviewResult;
	
	//Parameterized Constructor
	public Interview(int applicationId, LocalDate interviewDate, String interviewLocation,
			String interviewResult) {
		super();
		this.applicationId = applicationId;
		this.interviewDate = interviewDate;
		this.interviewLocation = interviewLocation;
		this.interviewResult = interviewResult;
	}
	
	//Non parameterized constructor
	public Interview() {
		super();
	}
	
	//Getters and Setters
	public int getInterviewId() {
		return interviewId;
	}
	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public LocalDate getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(LocalDate interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getInterviewLocation() {
		return interviewLocation;
	}
	public void setInterviewLocation(String interviewLocation) {
		this.interviewLocation = interviewLocation;
	}
	public String getInterviewResult() {
		return interviewResult;
	}
	public void setInterviewResult(String interviewResult) {
		this.interviewResult = interviewResult;
	}
	
	

}
