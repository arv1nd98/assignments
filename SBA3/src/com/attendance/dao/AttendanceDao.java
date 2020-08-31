package com.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import com.attendance.dbutil.DBConnection;
import com.attendance.model.Attendance;
import com.attendance.model.Students;

public class AttendanceDao {
	public ArrayList<Students> getStudentsBySem(int sem){
		try {
			Connection connection=DBConnection.getConnect();
			String sql="select * from students where sem=?";
			PreparedStatement stat=connection.prepareStatement(sql);
			
			stat.setInt(1, sem);
			
			ResultSet rs=stat.executeQuery();
			ArrayList<Students> studentList=new ArrayList<>();
			
			while(rs.next()) {
				int studId=rs.getInt("stud_id");
				String studName=rs.getString("stud_name");
				Students students=new Students(studId, studName);
				
				studentList.add(students);
			}
			return studentList;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String insertIntoAttendance(Attendance attendance) {
		try {
			Connection con=DBConnection.getConnect();
			String sql="insert into attendance values(?,?,?,?,?)";
			PreparedStatement stat=con.prepareStatement(sql);
			
			stat.setInt(1, attendance.getStudId());;
			stat.setString(2, attendance.getStudName());
			stat.setDate(3, new java.sql.Date(attendance.getThisDate().getTime()));
			stat.setInt(4, attendance.getSemester());
			stat.setString(5, attendance.getAttendance());
			
			int res=stat.executeUpdate();
			if(res>0)
				return "Mark the Attendance";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "Invalid Credentials";
	}
	
	public String updateAttendance(Attendance attendance) {
		try {
			Connection con=DBConnection.getConnect();
			String sql="update attendance set attendance='Present' where stud_id=?";
			PreparedStatement stat=con.prepareStatement(sql);
			
			stat.setInt(1, attendance.getStudId());;
			
			int res=stat.executeUpdate();
			if(res>0)
				return "Updated the Attendance";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "Invalid Credentials";
	}
	
	public ArrayList<Attendance> searchResult(int sem,Date date){
		try {
			Connection connection=DBConnection.getConnect();
			String sql="select * from attendance where sem=? and ADate=?";
			PreparedStatement stat=connection.prepareStatement(sql);
			
			stat.setInt(1, sem);
			stat.setDate(2, new java.sql.Date(date.getTime()));
			
			ResultSet rs=stat.executeQuery();
			ArrayList<Attendance> attendanceList=new ArrayList<>();
			
			if(rs.next() == false) {
				return null;
			}
			else {
			do{
				int studId=rs.getInt(1);
				String studName=rs.getString(2);
				String attendance=rs.getString(5);
				Attendance attend=new Attendance(studId, studName, attendance);
				
				attendanceList.add(attend);
			}while(rs.next());
			}
			return attendanceList;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
