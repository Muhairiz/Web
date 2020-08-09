

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditStudentForm
 */
@WebServlet("/EditStudentForm")
public class EditStudentForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStudentForm() {
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
	        out.println("<h1>Update Employee</h1>");
	        String sid=request.getParameter("id");
	        int id=Integer.parseInt(sid);

	        Students e=StudentDb.getStudentById(id);

	        out.print("<form action='EditStudent' method='post'>");
	        out.print("<table>");
	        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");
	        out.print("<tr><td>First Name:</td><td><input type='text' name='fname' value='"+e.getFirstname()+"'/></td></tr>");
	        out.print("<tr><td>Last Name:</td><td><input type='text' name='lname' value='"+e.getLastname()+"'/></td></tr>");
	        out.print("<tr><td>Last Name:</td><td><input type='text' name='regno' value='"+e.getRegno()+"'/></td></tr>");
	        out.print("<tr><td>Phone Number:</td><td><input type='text' name='phone' value='"+e.getPhone()+"'/></td></tr>");
	        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>");
	        out.print("<tr><td>Address:</td><td><input type='text' name='add' value='"+e.getAddress()+"'/></td></tr>");
	        out.print("<tr><td>Gender:</td><td><input type='radio' name='gender' value='Male'/>Male<input type='radio' name='gender' value='Female'/>Female</td></tr>");
	        out.print("<tr><td>Username:</td><td><input type='text' name='user' value='"+e.getUsername()+"'/></td></tr>");
	        out.print("<tr><td>Pasword:</td><td><input type='pasword' name='pass' value='"+e.getPassword()+"'/></td></tr>");
	        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");
	        out.print("</table>");
	        out.print("</form>");

	        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
