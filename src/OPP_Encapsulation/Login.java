package OPP_Encapsulation;

public class Login {
	
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with credentials: " + un + ":" + pwd);
	}
	
	public void doLogin(String un, String pwd, int otp) {
		System.out.println("login with credentials: " + un + ":" + pwd + " :" + otp);
	}

}
