package com.bridgelabz.userapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.userapplication.model.UserDetails;

public interface UserInformationRepository extends JpaRepository<UserDetails, Long> {

}
