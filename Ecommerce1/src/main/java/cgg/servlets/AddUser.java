package cgg.servlets;

import java.io.IOException;

import cgg.doa.CategoryDoa;
import cgg.doa.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddUser
 */
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddUser() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String addType = request.getParameter("addType");
		
		if(addType.equals("AddUser")) {
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String phone = request.getParameter("phonenumber");
			String address = request.getParameter("address");
			UserDao.addUser(username, email, password, phone, address, "normal");
			response.sendRedirect("adminpage.jsp");
			
		}
		else if(addType.equals("AddCategory")) {
			String Name = request.getParameter("categoryName");
			String discription = request.getParameter("Description");
			CategoryDoa.addCategory(Name, discription);
			response.sendRedirect("adminpage.jsp");
			
		}
		else {
			request.getParameter("")
			for
		}
	}

}
