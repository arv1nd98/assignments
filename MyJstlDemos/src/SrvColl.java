

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SrvColl")
public class SrvColl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> FootballNames=new ArrayList<>();

		FootballNames.add("Messi");
		FootballNames.add("Ronaldo");
		FootballNames.add("Neymar");
		FootballNames.add("De bruyne");
		FootballNames.add("kante");
		FootballNames.add("Casimero");
		FootballNames.add("Trent Arnold");
		FootballNames.add("Ramos");
		FootballNames.add("Pique");
		FootballNames.add("Davis");
		FootballNames.add("Oblak");
		

		HttpSession session= request.getSession();

		session.setAttribute("WorldXI", FootballNames);

		RequestDispatcher rd= request.getRequestDispatcher("NewFile.jsp");
		rd.forward(request, response);

		}

	}


