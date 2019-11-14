package com.bridgelabz.userapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.userapplication.dto.UserForgetPasswordDto;
import com.bridgelabz.userapplication.dto.UserLoginDto;
import com.bridgelabz.userapplication.dto.UserRegistrationDto;
import com.bridgelabz.userapplication.service.Users;

@RestController
@RequestMapping(value = "/userapplication")
public class UserController {
//, produces = "Application/json, Application/html", consumes = "Application/json, Application/html"

	@Autowired
	Users userService;

	@PostMapping(value = "/login")
	public ResponseEntity<String> userLogin(@RequestBody UserLoginDto userLoginData) {
		userService.userLogin(userLoginData);
		return new ResponseEntity<String>("", HttpStatus.OK);
	}

	@PostMapping(value = "/registration")
	public ResponseEntity<String> userRegistration(@RequestBody UserRegistrationDto userRegistrationData) {
		userService.userRegistratio(userRegistrationData);
		System.out.println("userData in user controller>> "+ userRegistrationData.getUserEmail());
		return new ResponseEntity<String>("registration succ", HttpStatus.CREATED);
	}

	@PostMapping(value = "/resetpassword")
	public ResponseEntity<String> userResetPassword(@RequestBody UserRegistrationDto userResetData) {
		userService.resetPassword(userResetData);
		return new ResponseEntity<String>("", HttpStatus.OK);
	}

	@PostMapping(value = "/forgotpassword")
	public ResponseEntity<String> userForgotPassword(@RequestHeader UserForgetPasswordDto userForgotPasswordData) {
		userService.forgotPassword(userForgotPasswordData);
		return new ResponseEntity<String>("", HttpStatus.OK);
	}

}
