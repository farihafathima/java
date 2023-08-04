package cgg.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is get method....");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1> This is get metod of my servlet</h1>");
		out.println("<h1>"+LocalDate.now()+"</h1>");
;	}
}
