
public class Book {
	

	public Book() {
		
	}
	
	private int book_id;
	private String bname,aname,btype,bcourse;
	
	public int getId() {
		return book_id;
	}
	public void setId(int id) {
		book_id=id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
	}
	public String getBcourse() {
		return bcourse;
	}
	public void setBcourse(String bcourse) {
		this.bcourse = bcourse;
	}

}
