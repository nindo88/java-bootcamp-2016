package exercise4;

//product Class
public class DbConnections {

	private String url;
	private String user;
	private String password;
	
	//Getters & Setters
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return url + ", " + user + ", " + password ;
	}
	
	
}
