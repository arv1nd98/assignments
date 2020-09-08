package com.registerservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RegisterServlet() {
        super();
    }
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		
		String data=request.getParameter("name");
		String data1=request.getParameter("Id");
		String data2=request.getParameter("password1");
		String data3=request.getParameter("password2");
		String data4=request.getParameter("address");
		String data5=request.getParameter("DOB");
		String data6=request.getParameter("Gender");
		String data7=request.getParameter("LanguagesKnown");
		String data8=request.getParameter("SecurityQuestions");
		String data9=request.getParameter("answers");
		response.setContentType("text/html");
		out.println(data);
		out.println(data1);
		out.println(data2);
		out.println(data3);
		out.println(data4);
		out.println(data5);
		out.println(data6);
		out.println(data7);
		out.println(data8);
		out.println(data9);
	}
}
