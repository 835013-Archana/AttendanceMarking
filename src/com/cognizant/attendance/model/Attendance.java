package com.cognizant.attendance.model;



public class Attendance {
	private String sessionId;
	private String employeeId;
	private String attendance;

	public Attendance() {
		// TODO Auto-generated constructor stub
	}

	public Attendance(String sessionId, String employeeId, String attendance) {
		super();
		this.sessionId = sessionId;
		this.employeeId = employeeId;
		this.attendance = attendance;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
}
