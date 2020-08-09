

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditStudent
 */
@WebServlet("/EditStudent")
public class EditStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStudent() {
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
		 
	     String sid=request.getParameter("id");
	        int id=Integer.parseInt(sid);
		 String first=request.getParameter("fname");
		 String last=request.getParameter("lname");
		 String regno=request.getParameter("regno");
		 String phone=request.getParameter("phone");
		 String email=request.getParameter("email");
		 String address=request.getParameter("add");
		 String gender=request.getParameter("gender");
		 String username=request.getParameter("user");
		 String password=request.getParameter("pass");
		 
		 Students s=new Students();
		 
		 s.setFirstname(first);
		 s.setLastname(last);
		 s.setRegno(regno);
		 s.setPhone(phone);
		 s.setEmail(email);
		 s.setAddress(address);
		 s.setGender(gender);
		 s.setUsername(username);
		 s.setPassword(password);
		 s.setId(id);
		 
		 int result=StudentDb.update(s);
	        if(result>0){
	            out.print("<p>Record saved successfully!</p>");
	            request.getRequestDispatcher("view_students.jsp").include(request, response);
	        }else{
	            out.println("Sorry! unable to save record");
	            request.getRequestDispatcher("view_students.jsp").include(request, response);
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
