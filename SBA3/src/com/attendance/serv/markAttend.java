package com.attendance.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.attendance.dao.AttendanceDao;
import com.attendance.model.Attendance;
import com.attendance.model.Students;


@WebServlet("/markAttend")
public class markAttend extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public markAttend() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		AttendanceDao dao=new AttendanceDao();
		
		int sem=Integer.parseInt(request.getParameter("sem"));
		ArrayList<Students> studentList=dao.getStudentsBySem(sem);
		
		for(Students p:studentList) {
			int studId=p.getStudId();
			String studName=p.getStudName();
			Date thisDate=new Date();
			int semester=sem;
			String attendance="Absent";
			Attendance attend= new Attendance(studId, studName, thisDate, semester, attendance);
			dao.insertIntoAttendance(attend);
		}
		HttpSession session=request.getSession();
		session.setAttribute("studentList", studentList);
		RequestDispatcher rd= request.getRequestDispatcher("displayStudentsBySem.jsp");
		rd.forward(request, response);	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}