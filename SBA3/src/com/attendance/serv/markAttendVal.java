package com.attendance.serv;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.attendance.dao.AttendanceDao;
import com.attendance.model.Attendance;


@WebServlet("/markAttendVal")
public class markAttendVal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public markAttendVal() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		AttendanceDao dao=new AttendanceDao();
		
		String[] data=request.getParameterValues("status");
		//PrintWriter out=response.getWriter();
		for(String datum:data) {
			int studId=Integer.parseInt(datum);	
			Attendance attend=new Attendance(studId);
			dao.updateAttendance(attend);
		}
		RequestDispatcher rd= request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

