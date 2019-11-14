package com.bridgelabz.userapplication.dto;

public class UserResetPasswordDto {

	private String password;

	public UserResetPasswordDto() {

	}

	public UserResetPasswordDto(String password) {

		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
