package com.cognizant.attendance.dao;

public class SessionEmptyException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Session is Empty";
	}
}
