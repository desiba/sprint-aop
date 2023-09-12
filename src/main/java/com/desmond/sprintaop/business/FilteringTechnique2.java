package com.desmond.sprintaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desmond.sprintaop.data.User;

@Service
public class FilteringTechnique2 {

	@Autowired
	private User user;
	
	public String collaborativeFiltering() {
		String userDetails =  user.getUserDetails();
		return userDetails;
	}
}
