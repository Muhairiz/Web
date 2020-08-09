

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ViewUser
 */
@WebServlet("/ViewUser")
public class ViewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewUser() {
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
        out.println("<h1>Users List</h1>");

        List<Users> list=UsersDao.getAllUsers();

        out.print("<table border='1' width='100%'");
        out.print("<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Phone</th><th>Email Address</th><th>Address</th><th>Genger</th> <th>Edit</th><th>Delete</th></tr>");
        for(Users u:list){
            out.print("<tr><td>"+u.getId()+"</td><td>"+u.getFirstname()+"</td><td>"+u.getLastname()+"</td><td>"+u.getPhone()+"</td><td>"+u.getEmail()+"</td><td>"+u.getAddress()+"</td><td>"+u.getGender()+"</td><td><a href='EditUserForm?id="+u.getId()+"'>edit</a></td><td><a href='DeleteUser?id="+u.getId()+"'>delete</a</td></tr>");
        }
        out.print("</table>");

        out.close();
        request.getAttribute("list");
        request.getRequestDispatcher("ViewUser/view_user.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
