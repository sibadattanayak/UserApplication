package com.bridgelabz.userapplication.dto;

public class UserForgetPasswordDto {

	private String email;

	public UserForgetPasswordDto() {

	}

	public UserForgetPasswordDto(String email) {

		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
