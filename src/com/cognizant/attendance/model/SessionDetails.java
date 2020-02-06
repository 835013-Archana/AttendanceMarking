package com.cognizant.attendance.model;
import java.sql.Time;
import java.util.Date;

public class SessionDetails {
	private String sessionId;
	private String sessionDescription;
	private String SkillId;
	private Date date;
	private Time time;
	private Integer availableSlots;

	public SessionDetails() {
		super();
	}

	public SessionDetails(String sessionId, String sessionDescription, String skillId, Date date, Time time,
			Integer availableSlots) {
		super();
		this.sessionId = sessionId;
		this.sessionDescription = sessionDescription;
		SkillId = skillId;
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
		return SkillId;
	}

	public void setSkillId(String skillId) {
		SkillId = skillId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Integer getAvailableSlots() {
		return availableSlots;
	}

	public void setAvailableSlots(Integer availableSlots) {
		this.availableSlots = availableSlots;
	}

}
