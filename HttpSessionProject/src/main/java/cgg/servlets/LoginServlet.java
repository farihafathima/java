package cgg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				String username=request.getParameter("username");
				String password=request.getParameter("password");
				
				if(username.equals("fariha") && password.equals("#Fariha9515")) {
					HttpSession session = request.getSession();
					String usernameFromSession=(String)session.getAttribute("username");
					if(usernameFromSession != null && usernameFromSession.equals(username)) {
						
					}
					else {
						session.setAttribute("username",username);
						response.sendRedirect("Welcome.jsp");
						
						
					}
					
				}
				else {
					
					
				}
				
				
				
			
	}

}
