package com.cognizant.attendance.dao;

import java.util.List;

import com.cognizant.attendance.model.UserDetails;

public interface UserDao {
	public List<UserDetails> getRegistrationUserList();
	
	public void viewAvailable();
	
	public void search();
	
	public void enroll();
	
	public void logout();

}
