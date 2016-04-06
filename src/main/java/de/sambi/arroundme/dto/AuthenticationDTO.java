package de.sambi.arroundme.dto;

import java.io.Serializable;

public class AuthenticationDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -37005217419993184L;
	
	private long login;
	private String password;
	public long getLogin() {
		return login;
	}
	public void setLogin(long login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
