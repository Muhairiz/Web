

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveStudent
 */
@WebServlet("/SaveStudent")
public class SaveStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveStudent() {
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
		 
		 String first=request.getParameter("fname");
		 String last=request.getParameter("lname");
		 String regno=request.getParameter("regno");
		 String phone=request.getParameter("phone");
		 String email=request.getParameter("email");
		 String address=request.getParameter("add");
		 String gender=request.getParameter("gender");
		 String username=request.getParameter("user");
		 String password=request.getParameter("pass");
		 
		 Students u=new Students();
		 
		 u.setFirstname(first);
		 u.setLastname(last);
		 u.setRegno(regno);
		 u.setPhone(phone);
		 u.setEmail(email);
		 u.setAddress(address);
		 u.setGender(gender);
		 u.setUsername(username);
		 u.setPassword(password);
		 
		 int result=StudentDb.saveStudent(u);
	        if(result>0){
	            out.print("<p>Record saved successfully!</p>");
	            request.getRequestDispatcher("view_students.jsp").include(request, response);
	        }else{
	            out.println("Sorry! unable to save record");
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
