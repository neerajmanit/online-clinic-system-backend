package com.comviva.onlineclinicsystem.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_CREDENTAILS")
public class CredentialsBean {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="user_id")
	private int userID;
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(name="user_type")
	private UserType userType;
	
	public CredentialsBean() {
		super();
	}

	public CredentialsBean(int userID, String password, UserType userType) {
		super();
		this.userID = userID;
		this.password = password;
		this.userType = userType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
		
}
