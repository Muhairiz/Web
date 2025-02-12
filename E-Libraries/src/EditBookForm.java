

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditBookForm
 */
@WebServlet("/EditBookForm")
public class EditBookForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditBookForm() {
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

        Book b=BookDb.getBookById(id);

        out.print("<form action='EditBook' method='post'>");
        out.print("<table>");
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+b.getId()+"'/></td></tr>");
        out.print("<tr><td>First Name:</td><td><input type='text' name='bname' value='"+b.getBname()+"'/></td></tr>");
        out.print("<tr><td>Last Name:</td><td><input type='text' name='aname' value='"+b.getAname()+"'/></td></tr>");
        out.print("<tr><td>Last Name:</td><td><input type='text' name='btype' value='"+b.getBtype()+"'/></td></tr>");
        out.print("<tr><td>Phone Number:</td><td><select name='bcourse'><option value'ICT'>ICT</option><option value='Account'>Account</option><option value='Bank'>Bank</option></select</td></tr>");
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
