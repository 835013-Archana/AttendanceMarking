package com.cognizant.attendance.model;



public class Enrollment {
	private String sessionId;
	private String employeeId;
	private String firstName;
	private String status;

	public Enrollment() {
		// TODO Auto-generated constructor stub
	}

	public Enrollment(String sessionId, String employeeId, String firstName, String status) {
		super();
		this.sessionId = sessionId;
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.status = status;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
