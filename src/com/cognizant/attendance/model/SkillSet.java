package com.cognizant.attendance.model;



public class SkillSet {
	private String skillId;
	private int skillType;
	private String skillDescription;
	public SkillSet() {		
	}
	public SkillSet(String skillId, int skillType, String skillDescription) {
		super();
		this.skillId = skillId;
		this.skillType = skillType;
		this.skillDescription = skillDescription;
	}
	public String getSkillId() {
		return skillId;
	}
	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}
	public int getSkillType() {
		return skillType;
	}
	public void setSkillType(int skillType) {
		this.skillType = skillType;
	}
	public String getSkillDescription() {
		return skillDescription;
	}
	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}
	
	
}
