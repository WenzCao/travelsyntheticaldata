package platform.travel.syntheticaldata.action;

import java.io.IOException;

import platform.travel.syntheticaldata.dao.UserDAO;

public class LoginAction {
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
	
	public String execute() throws IOException {
		if (this.username == null || this.password == null)
			return "input";
		boolean isExcit = UserDAO.isUserExcit(this.username, this.password);
		if (isExcit) {
			return "success";
		}
		return "input";
	}
}
