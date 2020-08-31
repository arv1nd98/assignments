package com.attendance.serv;

import java.io.IOException;
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


@WebServlet("/SemDateServ")
public class SemDateServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SemDateServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		AttendanceDao dao=new AttendanceDao();
		
		int sem=Integer.parseInt(request.getParameter("sem"));
		String dt=request.getParameter("date");
		
		Date date=null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			date=sdf.parse(dt);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Date not given");
		}
		
		
		
		if(dao.searchResult(sem, date)==null){
			HttpSession session=request.getSession();
			session.setAttribute("norecs", dao.searchResult(sem, date));
			
			RequestDispatcher red= request.getRequestDispatcher("ResultPageNotFound.jsp");
			red.forward(request, response);
		}
		else {
			ArrayList<Attendance> attendanceList=dao.searchResult(sem, date);
		HttpSession session=request.getSession();
		session.setAttribute("attendanceList", attendanceList);
		
		RequestDispatcher rd= request.getRequestDispatcher("ResultPage.jsp");
		rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
