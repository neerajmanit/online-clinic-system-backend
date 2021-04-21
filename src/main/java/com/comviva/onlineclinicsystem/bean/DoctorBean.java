package com.comviva.onlineclinicsystem.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOCTOR")
public class DoctorBean {
	@Id
	@GeneratedValue
	private int doctorID;
	@Column(name="doctor_name")
	private String doctorName;
	@Column(name="date_of_birth")
	private String dateOfBirth;
	@Column(name="date_of_joining")
	private String dateOfJoining;
	private String gender;
	private String qualification;
	private String specialization;
	@Column(name="year_of_experience")
	private int yearOfExperience;
	private String street;
	private String location;
	private String city;
	private String state;
	private String pincode;
	@Column(name="contact_number")
	private String contactNumber;
	@Column(name="email_id")
	private String emailID;
	public DoctorBean() {
		super();
	}
	public DoctorBean(String doctorName, String dateOfBirth, String dateOfJoining, String gender, String qualification,
			String specialization, int yearOfExperience, String street, String location, String city, String state,
			String pincode, String contactNumber, String emailID) {
		super();
		this.doctorName = doctorName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.gender = gender;
		this.qualification = qualification;
		this.specialization = specialization;
		this.yearOfExperience = yearOfExperience;
		this.street = street;
		this.location = location;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.contactNumber = contactNumber;
		this.emailID = emailID;
	}
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
		
}
