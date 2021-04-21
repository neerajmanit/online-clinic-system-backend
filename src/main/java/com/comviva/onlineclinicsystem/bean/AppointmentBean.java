package com.comviva.onlineclinicsystem.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="APPOINTMENT")
public class AppointmentBean {
	@Id
	@GeneratedValue
	private int appointmentID;
	
	@Column(name="d_id")
	private String doctorID;
	@Column(name="p_id")
	private String patientID;
	private String appointmentTime;
	private String appointmentDate;
	public AppointmentBean() {
		super();
	}
	public AppointmentBean(String doctorID, String patientID, String appointmentTime, String appointmentDate) {
		super();
		this.doctorID = doctorID;
		this.patientID = patientID;
		this.appointmentTime = appointmentTime;
		this.appointmentDate = appointmentDate;
	}
	public int getAppointmentID() {
		return appointmentID;
	}
	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}
	public String getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
		
}
