package com.cognizant.attendance.model;

import java.util.Date;

public class SessionDetails {
	private String sessionId;
	private String sessionDescription;
	private String skillId;
	private Date date;
	private String time;
	private Integer availableSlots;

	public SessionDetails() {
		super();
	}

	public SessionDetails(String sessionId, String sessionDescription,
			String skillId, Date date, String time, Integer availableSlots) {
		super();
		this.sessionId = sessionId;
		this.sessionDescription = sessionDescription;
		this.skillId = skillId;
		this.date = date;
		this.time = time;
		this.availableSlots = availableSlots;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSessionDescription() {
		return sessionDescription;
	}

	public void setSessionDescription(String sessionDescription) {
		this.sessionDescription = sessionDescription;
	}

	public String getSkillId() {
		return skillId;
	}

	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getAvailableSlots() {
		return availableSlots;
	}

	public void setAvailableSlots(Integer availableSlots) {
		this.availableSlots = availableSlots;
	}

}
