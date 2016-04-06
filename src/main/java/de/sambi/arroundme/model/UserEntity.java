package de.sambi.arroundme.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * tous les classes de la package model doivent être implément la classe Serializable!!!!!
 * 
 *
 */
@Entity//REQUIRED
@Table (name="user")//OPTIONELLE
public class UserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5012625948444358261L;
	
	@Id
	@SequenceGenerator(name="seq_id_user", sequenceName="seq_id_user",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="seq_id_user")
	private long id;
	@Column(name = "firstName")
	private String name;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "mail")
	private String mail;
	private long cin;
	private long tel;
	private String adress;
	private String password;

	
	@ManyToOne
	@JoinColumn(name = "type_user_id",referencedColumnName="id", nullable = false) //ADD FOREIGN KEY (type_id) REFERENCES TypeUserEntity (ID);
    private TypeUserEntity typeUser;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="vehicule_id",referencedColumnName="id")
	private VehiculeEntity vehicule ;
	
	
	@ManyToMany
    @JoinTable(name="Service_User", 
    joinColumns=@JoinColumn(name="USER_ID"),
    inverseJoinColumns=@JoinColumn(name="SERVICE_ID"))
    @Fetch(FetchMode.SUBSELECT)	
    private Set<ServiceEntity> service ;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getCin() {
		return cin;
	}
	public void setCin(long cin) {
		this.cin = cin;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public TypeUserEntity getTypeUser() {
		return typeUser;
	}
	public void setTypeUser(TypeUserEntity typeUser) {
		this.typeUser = typeUser;
	}
	public VehiculeEntity getVehicule() {
		return vehicule;
	}
	public void setVehicule(VehiculeEntity vehicule) {
		this.vehicule = vehicule;
	}
	public Set<ServiceEntity> getService() {
		return service;
	}
	public void setService(Set<ServiceEntity> service) {
		this.service = service;
	}
	
	

}
