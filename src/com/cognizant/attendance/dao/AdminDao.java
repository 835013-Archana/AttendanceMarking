package com.cognizant.attendance.dao;


import com.cognizant.attendance.model.AdminDetails;
import com.cognizant.attendance.model.SessionDetails;
import com.cognizant.attendance.model.SkillSet;
import com.cognizant.attendance.model.TrainerDetails;


public interface AdminDao {
	public void insertAdmin(AdminDetails adminDetails);
	
	public void addSkillSet(SkillSet skillSet);
	
	public AdminDetails getAdminDetails(String adminId);

	public void addTrainerList(TrainerDetails trainerDetails);
	
	public TrainerDetails getTrainer(String trainerId);

	public void updateTrainerList(TrainerDetails trainerDetails);

	public void addSessionDetails(SessionDetails sessionDetails);

	public void updateSessionDetails(SessionDetails sessionDetails);
}
