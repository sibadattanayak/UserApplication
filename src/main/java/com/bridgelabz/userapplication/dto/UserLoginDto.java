package com.bridgelabz.userapplication.dto;

public class UserLoginDto {
	
	private String userEmail;
	private String userPassword;

	public UserLoginDto() {

	}

	public UserLoginDto(String userEmail, String userPassword) {

		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
