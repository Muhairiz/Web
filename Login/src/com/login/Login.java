package com.login;

public class Login {
	
	private String uname;
	private String pass;
	
	public Login() {
		
	}

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public boolean validate() {
		if(pass.equals("Triple")) {
			return true;
		}else {
			return false;
		}
	}
}
