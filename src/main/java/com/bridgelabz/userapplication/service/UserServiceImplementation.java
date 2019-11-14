package com.bridgelabz.userapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bridgelabz.userapplication.dto.UserForgetPasswordDto;
import com.bridgelabz.userapplication.dto.UserLoginDto;
import com.bridgelabz.userapplication.dto.UserRegistrationDto;
import com.bridgelabz.userapplication.model.UserDetails;
import com.bridgelabz.userapplication.repository.UserInformationRepository;

@Component
public class UserServiceImplementation implements Users{

	@Autowired
	UserInformationRepository userRepository;
	
	UserDetails userDetails;
	
	@Override
	public UserLoginDto userLogin(UserLoginDto userLoginData) {
		
		
		return null;
	}

	@Override
	public UserRegistrationDto userRegistratio(UserRegistrationDto userData) {
//		userDetails.setUserFirstName(userData.getUserFirstName());
//		userDetails.setUserLastName(userData.getUserLastName());
//		userDetails.setUserEmail(userData.getUserEmail());
//		userDetails.setUserPassword(userData.getUserPassword());

		UserDetails userInfo = new UserDetails(userDetails.getUserFirstName(),userDetails.getUserLastName(),userDetails.getUserEmail(),userDetails.getUserPassword() );		
		System.out.println("userData in user service>> "+ userData.getUserEmail());
		
		userDetails= userRepository.save(userDetails);

		UserRegistrationDto regDto =new UserRegistrationDto
				(userDetails.getUserFirstName(),userDetails.getUserLastName(),userDetails.getUserEmail(),userDetails.getUserPassword());
		return regDto;
	}

	@Override
	public String forgotPassword(UserForgetPasswordDto userForgetPasswordDto) {
		
		return null;
	}

	@Override
	public String resetPassword(UserRegistrationDto userRegistrationDto) {
		
		return null;
	}

}
