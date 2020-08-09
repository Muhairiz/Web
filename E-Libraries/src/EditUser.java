

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditUser
 */
@WebServlet("/EditUser")
public class EditUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
	     PrintWriter out=response.getWriter();
		 
	     String sid=request.getParameter("id");
	        int id=Integer.parseInt(sid);
		 String first=request.getParameter("fname");
		 String last=request.getParameter("lname");
		 String phone=request.getParameter("phone");
		 String email=request.getParameter("email");
		 String address=request.getParameter("add");
		 String gender=request.getParameter("gender");
		 String username=request.getParameter("user");
		 String password=request.getParameter("pass");
		 
		 Users us=new Users();
		 
		 us.setFirstname(first);
		 us.setLastname(last);
		 us.setPhone(phone);
		 us.setEmail(email);
		 us.setAddress(address);
		 us.setGender(gender);
		 us.setUsername(username);
		 us.setPassword(password);
		 us.setId(id);
		 
		 int result=UsersDao.update(us);
	        if(result>0){
	            out.print("<p>Record saved successfully!</p>");
	            request.getRequestDispatcher("view_user.jsp").include(request, response);
	        }else{
	            out.println("Sorry! unable to save record");
	            request.getRequestDispatcher("view_user.jsp").include(request, response);
	        }

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
