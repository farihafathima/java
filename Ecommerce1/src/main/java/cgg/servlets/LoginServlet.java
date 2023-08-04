package cgg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import cgg.doa.UserDao;
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
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		Boolean isUserExist=UserDao.userExist(username,password);
		
		if(isUserExist) {
		 HttpSession session = request.getSession();
		 session.setAttribute("username", username);
		 session.setAttribute("password", password);
		 out.println();
		 if(UserDao.getUserType(username, password).equals("normal")) {
			 session.setAttribute("userType", "normal");
			 response.sendRedirect("normaluserpage.jsp");
			 
		 }
		 else {
			 session.setAttribute("userType", "admin");
			 response.sendRedirect("adminpage.jsp");
			 
		 }
		 
		 out.println("<h2>Loggedin successfull</h2>");
		}
		else {
			  // Set an error message as a request attribute
            request.setAttribute("error", "Username or password is wrong, please check.");
            
            // Forward the request to the login page
            request.getRequestDispatcher("Login.jsp").forward(request, response);
           
		}
		
	}

}
