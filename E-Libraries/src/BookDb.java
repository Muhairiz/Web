import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookDb {
	
	public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/ELibrary","root","");
        }catch(Exception e){System.out.println(e);}
        return con;   
    }
	
	public static int saveBook(Book b) {
		int result =0;
		
		try {
			Connection conn=BookDb.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into books_tb(book_name,book_author,book_type,book_course) values(?,?,?,?)");
			ps.setString(1, b.getBname());
			ps.setString(2, b.getAname());
			ps.setString(3, b.getBtype());
			ps.setString(4, b.getBcourse());
			result =ps.executeUpdate();
			conn.close();
		}catch(Exception ex){ex.printStackTrace();}

        return result;
	}
	
	 public static int delete(int id){
	        int status=0;
	        try{
	            Connection con=BookDb.getConnection();
	            PreparedStatement ps=con.prepareStatement("delete from books_tb where book_id=?");
	            ps.setInt(1,id);
	            status=ps.executeUpdate();

	            con.close();
	        }catch(Exception e){e.printStackTrace();}

	        return status;
	    }
	 
	 public static int update(Book b){
		 
	        int result=0;
	        try{
	            Connection con=StudentDb.getConnection();
	            PreparedStatement ps=con.prepareStatement(
	                    "update books_tb set book_name=?,book_author=?,book_type=?,book_course=? where book_id=?");
	            ps.setString(1, b.getBname());
				ps.setString(2, b.getAname());
				ps.setString(3, b.getBtype());
				ps.setString(4, b.getBcourse());
				ps.setInt(5, b.getId());

	            result=ps.executeUpdate();

	            con.close();
	        }catch(Exception ex){ex.printStackTrace();}

	        return result;
	    }
	 
	 public static Book getBookById(int id){
	        Book b=new Book();

	        try{
	            Connection con=BookDb.getConnection();
	            PreparedStatement ps=con.prepareStatement("select * from books_tb where book_id=?");
	            ps.setInt(1,id);
	            ResultSet rs=ps.executeQuery();
	            if(rs.next()){
	            	b.setId(rs.getInt(1));
	                b.setBname(rs.getString(2));
	                b.setAname(rs.getString(3));
	                b.setBtype(rs.getString(4));
	                b.setBcourse(rs.getString(5));
	            }
	            con.close();
	        }catch(Exception ex){ex.printStackTrace();}

	        return b;
	    }

}