package com.comviva.onlineclinicsystem.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCHEDULES")
public class ScheduleBean {
	@Id
	@GeneratedValue
	private int scheduleID;
	private String doctorID;
	private String availableDays;
	private String slot;
	public ScheduleBean() {
		super();
	}
	public ScheduleBean(int scheduleID, String doctorID, String availableDays, String slot) {
		super();
		this.scheduleID = scheduleID;
		this.doctorID = doctorID;
		this.availableDays = availableDays;
		this.slot = slot;
	}
	public int getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}
	public String getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}
	public String getAvailableDays() {
		return availableDays;
	}
	public void setAvailableDays(String availableDays) {
		this.availableDays = availableDays;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	
}
