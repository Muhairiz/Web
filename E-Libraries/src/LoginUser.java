

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginUser
 */
@WebServlet("/LoginUser")
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
	     PrintWriter out=response.getWriter();
		
			String username = request.getParameter("user");
			String password = request.getParameter("pass");
		
			UsersDao ud=new UsersDao();
			try {
				Users user=ud.checkLogin(username, password);
				 request.getRequestDispatcher("loginForm.jsp").include(request, response);
				if(user !=null) {
					HttpSession session =request.getSession();
					session.setAttribute("username", username);
					RequestDispatcher rd =request.getRequestDispatcher("Index.jsp");
					rd.forward(request, response);
					//request.getRequestDispatcher("Index.jsp").include(request, response);
					//String destPage1 ="Index.jsp";
				}else {
					out.println("<div><div class='alert alert-danger col-md-3'><strong>Invalid username or password!</strong></div></div>");
					 //out.println("<p align='center'>Invalid username or password</p>");
			            //request.getRequestDispatcher("loginForm.jsp").include(request, response);
				}
				//RequestDispatcher rd =request.getRequestDispatcher(destPage1);
				//rd.forward(request, response);
				
			}catch(SQLException e){	
				System.out.print(e);
			}
						
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
