package com.cognizant.attendance.dao;

import com.cognizant.attendance.model.UserDetails;

public interface UserDao {
	public void insertUser(UserDetails userDetails);

	public UserDetails getUserDetails(String employeeId);

	public void enrollment();

	public void attendance();
}
