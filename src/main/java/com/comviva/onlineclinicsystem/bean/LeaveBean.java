package com.comviva.onlineclinicsystem.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LEAVES")
public class LeaveBean {
	@Id
	@GeneratedValue
	private int reporterID;
	private String reporterName;
	private int doctorID;
	private String leaveFrom;
	private String leaveTo;
	private String reason;
	private int status;
	public LeaveBean() {
		super();
	}
	public LeaveBean(String reporterName, int doctorID, String leaveFrom, String leaveTo, String reason,
			int status) {
		super();
		this.reporterName = reporterName;
		this.doctorID = doctorID;
		this.leaveFrom = leaveFrom;
		this.leaveTo = leaveTo;
		this.reason = reason;
		this.status = status;
	}
	public int getReporterID() {
		return reporterID;
	}
	public void setReporterID(int reporterID) {
		this.reporterID = reporterID;
	}
	public String getReporterName() {
		return reporterName;
	}
	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	public String getLeaveFrom() {
		return leaveFrom;
	}
	public void setLeaveFrom(String leaveFrom) {
		this.leaveFrom = leaveFrom;
	}
	public String getLeaveTo() {
		return leaveTo;
	}
	public void setLeaveTo(String leaveTo) {
		this.leaveTo = leaveTo;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
		
}
