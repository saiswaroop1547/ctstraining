package dto;

public class Users {
	String uname;
	String password;
	public Users(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [uname=" + uname + ", password=" + password + "]";
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
