

import java.io.IOException;
import java.sql.*;
//import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

//import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String first="Suleiman";
		String last="Suleiman";
		String user="Suleiman";
		
		Connection conn= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn =DriverManager.getConnection("jdbc:mysql://localhost/mfano", "root", "");
			response.getWriter().append("Connected");
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			response.getWriter().append("Not Connected");
		}
		try {
		PreparedStatement ps=(PreparedStatement) conn.prepareStatement("insert into data(fname,lname,uname) values('"+first+"','"+last+"','"+user+"')");
        ps.executeUpdate();
    }catch(Exception e){System.out.println(e);}
}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}