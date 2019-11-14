package com.bridgelabz.userapplication.service;

import org.springframework.stereotype.Service;

import com.bridgelabz.userapplication.dto.UserForgetPasswordDto;
import com.bridgelabz.userapplication.dto.UserLoginDto;
import com.bridgelabz.userapplication.dto.UserRegistrationDto;

@Service
public interface Users {

	UserLoginDto userLogin(UserLoginDto userRegistrationData);

	UserRegistrationDto userRegistratio(UserRegistrationDto userData);

	String forgotPassword(UserForgetPasswordDto userForgetPasswordDto);

	String resetPassword(UserRegistrationDto userRegistrationDto);

}
