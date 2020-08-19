import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDb {
	
	public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/ELibrary","root","");
        }catch(Exception e){System.out.println(e);}
        return con;   
    }
	
	public static int saveStudent(Students s) {
		int result =0;
		
		try {
			Connection conn=UsersDao.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into students_tb(first_name,last_name,regno,phone,email,address,gender,username,password) values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, s.getFirstname());
			ps.setString(2, s.getLastname());
			ps.setString(3, s.getRegno());
			ps.setString(4, s.getPhone());
			ps.setString(5, s.getEmail());
			ps.setString(6, s.getAddress());
			ps.setString(7, s.getGender());
			ps.setString(8, s.getUsername());
			ps.setString(9, s.getPassword());
			result =ps.executeUpdate();
			conn.close();
		}catch(Exception ex){ex.printStackTrace();}

        return result;
	}
	
	 public static int delete(int id){
	        int status=0;
	        try{
	            Connection con=StudentDb.getConnection();
	            PreparedStatement ps=con.prepareStatement("delete from students_tb where std_id=?");
	            ps.setInt(1,id);
	            status=ps.executeUpdate();

	            con.close();
	        }catch(Exception e){e.printStackTrace();}

	        return status;
	    }
	 
	 public static int update(Students us){
		 
	        int result=0;
	        try{
	            Connection con=StudentDb.getConnection();
	            PreparedStatement ps=con.prepareStatement(
	                    "update students_tb set first_name=?,last_name=?,regno=?,phone=?,email=?,address=?,gender=?,username=?,password=? where std_id=?");
	            ps.setString(1, us.getFirstname());
				ps.setString(2, us.getLastname());
				ps.setString(3, us.getRegno());
				ps.setString(4, us.getPhone());
				ps.setString(5, us.getEmail());
				ps.setString(6, us.getAddress());
				ps.setString(7, us.getGender());
				ps.setString(8, us.getUsername());
				ps.setString(9, us.getPassword());
	            ps.setInt(10,us.getId());

	            result=ps.executeUpdate();

	            con.close();
	        }catch(Exception ex){ex.printStackTrace();}

	        return result;
	    }
	 
	 public static Students getStudentById(int id){
	        Students us=new Students();

	        try{
	            Connection con=StudentDb.getConnection();
	            PreparedStatement ps=con.prepareStatement("select * from students_tb where std_id=?");
	            ps.setInt(1,id);
	            ResultSet rs=ps.executeQuery();
	            if(rs.next()){
	            	us.setId(rs.getInt(1));
	                us.setFirstname(rs.getString(2));
	                us.setLastname(rs.getString(3));
	                us.setRegno(rs.getString(4));
	                us.setPhone(rs.getString(5));
	                us.setEmail(rs.getString(6));
	                us.setAddress(rs.getString(7));
	                us.setGender(rs.getString(8));
	                us.setUsername(rs.getString(9));
	                us.setPassword(rs.getString(10));
	            }
	            con.close();
	        }catch(Exception ex){ex.printStackTrace();}

	        return us;
	    }


}
