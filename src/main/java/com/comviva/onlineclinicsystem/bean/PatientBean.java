package com.comviva.onlineclinicsystem.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PATIENT")
public class PatientBean {
	@Id
	@GeneratedValue
	private int patientID;
	private String userID;
	private String appointmentDate;
	private String aligmentType;
	private String aligmentDetails;
	private String diagnosisHistory;
	public PatientBean() {
		super();
	}
	public PatientBean(String userID, String appointmentDate, String aligmentType, String aligmentDetails,
			String diagnosisHistory) {
		super();
		this.userID = userID;
		this.appointmentDate = appointmentDate;
		this.aligmentType = aligmentType;
		this.aligmentDetails = aligmentDetails;
		this.diagnosisHistory = diagnosisHistory;
	}
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAligmentType() {
		return aligmentType;
	}
	public void setAligmentType(String aligmentType) {
		this.aligmentType = aligmentType;
	}
	public String getAligmentDetails() {
		return aligmentDetails;
	}
	public void setAligmentDetails(String aligmentDetails) {
		this.aligmentDetails = aligmentDetails;
	}
	public String getDiagnosisHistory() {
		return diagnosisHistory;
	}
	public void setDiagnosisHistory(String diagnosisHistory) {
		this.diagnosisHistory = diagnosisHistory;
	}
		
}
