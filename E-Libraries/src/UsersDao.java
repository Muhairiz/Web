import java.sql.*;
import java.util.*;

public class UsersDao {
	
	public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/ELibrary","root","");
        }catch(Exception e){System.out.println(e);}
        return con;
    }

	public static int saveUser(Users u) {
		int result =0;
		
		try {
			Connection conn=UsersDao.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into users_tb(first_name,last_name,phone,email,address,gender,username,password) values(?,?,?,?,?,?,?,?)");
			ps.setString(1, u.getFirstname());
			ps.setString(2, u.getLastname());
			ps.setString(3, u.getPhone());
			ps.setString(4, u.getEmail());
			ps.setString(5, u.getAddress());
			ps.setString(6, u.getGender());
			ps.setString(7, u.getUsername());
			ps.setString(8, u.getPassword());
			result =ps.executeUpdate();
			conn.close();
		}catch(Exception ex){ex.printStackTrace();}

        return result;
	}
	
	 public static List<Users> getAllUsers(){
	        List<Users> list=new ArrayList<Users>();
	        try{
	            Connection con=UsersDao.getConnection();
	            PreparedStatement ps=con.prepareStatement("select * from users_tb");
	            ResultSet rs=ps.executeQuery();
	            while(rs.next()){
	                Users us=new Users();
	                us.setId(rs.getInt(1));
	                us.setFirstname(rs.getString(2));
	                us.setLastname(rs.getString(3));
	                us.setPhone(rs.getString(4));
	                us.setEmail(rs.getString(5));
	                us.setAddress(rs.getString(6));
	                us.setGender(rs.getString(7));
	                us.setUsername(rs.getString(8));
	                us.setPassword(rs.getString(9));
	                list.add(us);
	            }
	            con.close();
	        }catch(Exception e){e.printStackTrace();}

	        return list;
	    }
	 
	 public static Users getUserById(int id){
	        Users us=new Users();

	        try{
	            Connection con=UsersDao.getConnection();
	            PreparedStatement ps=con.prepareStatement("select * from users_tb where user_id=?");
	            ps.setInt(1,id);
	            ResultSet rs=ps.executeQuery();
	            if(rs.next()){
	            	us.setId(rs.getInt(1));
	                us.setFirstname(rs.getString(2));
	                us.setLastname(rs.getString(3));
	                us.setPhone(rs.getString(4));
	                us.setEmail(rs.getString(5));
	                us.setAddress(rs.getString(6));
	                us.setGender(rs.getString(7));
	                us.setUsername(rs.getString(8));
	                us.setPassword(rs.getString(9));
	            }
	            con.close();
	        }catch(Exception ex){ex.printStackTrace();}

	        return us;
	    }
	 
	 public static int delete(int id){
	        int status=0;
	        try{
	            Connection con=UsersDao.getConnection();
	            PreparedStatement ps=con.prepareStatement("delete from users_tb where user_id=?");
	            ps.setInt(1,id);
	            status=ps.executeUpdate();

	            con.close();
	        }catch(Exception e){e.printStackTrace();}

	        return status;
	    }
	 
	 public static int update(Users us){
		 
	        int result=0;
	        try{
	            Connection con=UsersDao.getConnection();
	            PreparedStatement ps=con.prepareStatement(
	                    "update users_tb set first_name=?,last_name=?,phone=?,email=?,address=?,gender=?,username=?,password=? where user_id=?");
	            ps.setString(1, us.getFirstname());
				ps.setString(2, us.getLastname());
				ps.setString(3, us.getPhone());
				ps.setString(4, us.getEmail());
				ps.setString(5, us.getAddress());
				ps.setString(6, us.getGender());
				ps.setString(7, us.getUsername());
				ps.setString(8, us.getPassword());
	            ps.setInt(9,us.getId());

	            result=ps.executeUpdate();

	            con.close();
	        }catch(Exception ex){ex.printStackTrace();}

	        return result;
	    }
	 
	 public Users checkLogin(String username,String password) throws SQLException {
		 
		 Connection con=UsersDao.getConnection();
		 String sql ="select * from users_tb where username=? and password=?";
		 PreparedStatement ps=con.prepareStatement(sql);
		 
		 ps.setString(1,username);
		 ps.setString(2,password);
		 ResultSet result =ps.executeQuery();
		 
		Users user=null;
		
		if(result.next()) {
			user= new Users();
			user.setUsername(result.getString("username"));
			user.setPassword(result.getString("password"));
		}
		con.close();
		return user;
		 
	 }
	 
	
}


