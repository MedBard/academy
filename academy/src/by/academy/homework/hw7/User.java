package by.academy.homework.hw7;

public class User extends Person {
	private String login;
	private String password;
	private String email;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void printUserInfo() {
		System.out.println(getLogin() + " " + getPassword());
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", email=" + email + "]";
	}
}
