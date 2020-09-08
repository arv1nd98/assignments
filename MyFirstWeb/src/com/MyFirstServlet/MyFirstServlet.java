package com.MyFirstServlet;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyFirstServlet() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		String data=request.getParameter("user");
		response.setContentType("text/html");
		out.print("<h1><font color=red>Hello"+data+"</font></h1>");
		String arr[]=request.getParameterValues("LanguagesKnown");
		for(String a:arr)
		{
			out.println(a+"<br>");
		}
}

	

}
