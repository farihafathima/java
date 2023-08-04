package cgg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		out.println("<h2>Welcome to Register Servlet</h2>");
		String name=req.getParameter("user_name");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		String check = req.getParameter("condition");
		if (check != null) {
			if(check.equals("checked")) {
			out.println("<h2> Name:      "+name+"</h2>");
			out.println("<h2> Password:      "+password+"</h2>");
			out.println("<h2> Email:      "+email+"</h2>");
			out.println("<h2> Gender:      "+gender+"</h2>");
			out.println("<h2> Course:      "+course+"</h2>");
		}
		RequestDispatcher rd = req.getRequestDispatcher("SuccessServlet");	
		rd.forward(req, resp);
		}
		else {
			out.println("<h2> You have not accepted terms and conditions</h2>");
			//include the output of index.html
			//get the object of the requestDispatcher
			
				RequestDispatcher rs = req.getRequestDispatcher("index.html");
				rs.include(req, resp);
		}
	}

}
