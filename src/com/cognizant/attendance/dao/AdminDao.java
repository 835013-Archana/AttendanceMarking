package com.cognizant.attendance.dao;

import java.util.List;

import com.cognizant.attendance.model.AdminDetails;
import com.cognizant.attendance.model.SessionDetails;
import com.cognizant.attendance.model.SkillSet;
import com.cognizant.attendance.model.TrainerDetails;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public interface AdminDao {
	public void insertAdmin(AdminDetails adminDetails);

	public AdminDetails getAdminDetails(String adminId, String password);

	public AdminDetails getAdminPendingDetails(String adminId);// super user

	public void updateAdminRequest(AdminDetails adminPendingDetails);// super user

	public List<AdminDetails> getPendingDetails();// super user

	public void addSkillSet(SkillSet skillSet);

	public void addTrainerList(TrainerDetails trainerDetails);

	public TrainerDetails getTrainer(String trainerId);

	public void updateTrainerList(TrainerDetails trainerDetails);

	public void addSessionDetails(SessionDetails sessionDetails) throws ParseException;

	public List<SessionDetails> getSessionDetails() throws SessionEmptyException;

	public SessionDetails getSessionDetails(String sessionId);

	public void updateSessionDetails(SessionDetails sessionDetails);

	public void deleteSessionDetails(String sessionId);

	public void mapSkillSet(SessionDetails sessionDetails);
}
