package com.attendance.model;

public class Students {
	private int studId; 
	private String studName;
	private int sem;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public Students(int studId, String studName, int sem) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.sem = sem;
	}
	public Students(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}
	
	public Students() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Students [studId=" + studId + ", studName=" + studName + ", sem=" + sem + "]";
	}
}
