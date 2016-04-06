package de.sambi.arroundme.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegisterRequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3017734031191416268L;
	
	
	//vehicule 
	private String carModel;
	private String carType;
	private String matricule;
	
	//type User
	private long typeUserId;
	
	//User info
	private String adress;
	private long   cin;
	private String firstName;
	private String lastName;
	private String mail;
	private String password;
	private long   tel;
	
	//type de Service
	private long   idTypeService;
	
	//location of car
    private BigDecimal  currentLatitude;
    private BigDecimal  currentLongitude;
    
    
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public long getCin() {
		return cin;
	}
	public void setCin(long cin) {
		this.cin = cin;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	public long getIdTypeService() {
		return idTypeService;
	}
	public void setIdTypeService(long idTypeService) {
		this.idTypeService = idTypeService;
	}
	public BigDecimal getCurrentLatitude() {
		return currentLatitude;
	}
	public void setCurrentLatitude(BigDecimal currentLatitude) {
		this.currentLatitude = currentLatitude;
	}
	public BigDecimal getCurrentLongitude() {
		return currentLongitude;
	}
	public void setCurrentLongitude(BigDecimal currentLongitude) {
		this.currentLongitude = currentLongitude;
	}
	public long getTypeUserId() {
		return typeUserId;
	}
	public void setTypeUserId(long typeUserId) {
		this.typeUserId = typeUserId;
	}

    
	

}
