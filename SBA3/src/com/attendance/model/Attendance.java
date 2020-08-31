package com.attendance.model;

import java.util.Date;

public class Attendance {
	private int studId;
	private String studName;
	private Date thisDate;
	private int semester;
	private String attendance;
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
	public Date getThisDate() {
		return thisDate;
	}
	public void setThisDate(Date thisDate) {
		this.thisDate = thisDate;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	public Attendance(int studId, String studName, Date thisDate, int semester, String attendance) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.thisDate = thisDate;
		this.semester = semester;
		this.attendance = attendance;
	}
	
	public Attendance(int studId) {
		super();
		this.studId = studId;
	}
	public Attendance(int studId, String studName, String attendance) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.attendance = attendance;
	}
	
	
	@Override
	public String toString() {
		return "Attendance [studId=" + studId + ", studName=" + studName + ", thisDate=" + thisDate + ", semester="
				+ semester + ", attendance=" + attendance + "]";
	}
	
	

}
