

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditBook
 */
@WebServlet("/EditBook")
public class EditBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditBook() {
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
		 
	     String sid =request.getParameter("id");
	        int id=Integer.parseInt(sid);
		 String bookn=request.getParameter("bname");
		 String author=request.getParameter("aname");
		 String bookt=request.getParameter("btype");
		 String course=request.getParameter("bcourse");
		 
		 Book b = new Book();
		 b.setBname(bookn);
		 b.setAname(author);
		 b.setBtype(bookt);
		 b.setBcourse(course);
		 b.setId(id);
		 
		 int result=BookDb.update(b);
	        if(result>0){
	            out.print("<p>Record saved successfully!</p>");
	            request.getRequestDispatcher("view_books.jsp").include(request, response);
	        }else{
	            out.println("Sorry! unable to save record");
	            request.getRequestDispatcher("view_books.jsp").include(request, response);
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
