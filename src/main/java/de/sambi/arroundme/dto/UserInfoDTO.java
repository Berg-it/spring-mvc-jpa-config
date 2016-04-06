package de.sambi.arroundme.dto;

import java.io.Serializable;

public class UserInfoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -333819930532615355L;
	
	private String name;
	private String lastName;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
