

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveBook
 */
@WebServlet("/SaveBook")
public class SaveBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveBook() {
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
		 
		 String bookname=request.getParameter("bname");
		 String author=request.getParameter("aname");
		 String btype=request.getParameter("btype");
		 String course=request.getParameter("bcourse");
		 
 Book b=new Book();
		 
		 b.setBname(bookname);
		 b.setAname(author);
		 b.setBtype(btype);
		 b.setBcourse(course);
		 
		 int result=BookDb.saveBook(b);
	        if(result>0){
	            out.print("<p>Record saved successfully!</p>");
	            request.getRequestDispatcher("view_books.jsp").include(request, response);
	        }else{
	        	request.getRequestDispatcher("view_books.jsp").include(request, response);
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
