package com.cognizant.attendance.model;

public class TrainerDetails {
	private String trainerId;
	private String trainerName;
	private long contactNumber;
	private String email;
	private String skillId;
	public TrainerDetails() {
		
	}
	
	
	public TrainerDetails(String trainerId, String trainerName,
			long contactNumber, String email, String skillId) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.skillId = skillId;
	}
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkillId() {
		return skillId;
	}
	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}
	

}
	