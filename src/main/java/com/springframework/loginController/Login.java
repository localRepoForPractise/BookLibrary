package com.springframework.loginController;

import java.util.Date;

public class Login {

	private int userId;
	private String userType;
	private String createdBy;
	private Date createdDate;
	private String password;
	private String userEmail;
	private String userName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Login(int userId, String userName, String userType, String createdBy, Date createdDate, String password,
			String userEmail) {
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.password = password;
		this.userEmail = userEmail;
	}
}
