package de.sambi.arroundme.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity//REQUIRED
@Table (name="vehicule")//OPTIONELLE

public class VehiculeEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2357207425297982144L;
	@Id
	@SequenceGenerator(name="seq_id_vehicule", sequenceName="seq_id_vehicule",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="seq_id_vehicule")
	private long id;
	
	private String type;//Peugeot
	private String modele;//206
	
	@OneToOne(mappedBy="vehicule")
	private UserEntity user ;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="vehicule")
	private LocationEntity location ;
	
	private String maticule;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public LocationEntity getLocation() {
		return location;
	}

	public void setLocation(LocationEntity location) {
		this.location = location;
	}

	public String getMaticule() {
		return maticule;
	}

	public void setMaticule(String maticule) {
		this.maticule = maticule;
	}
	
	
	


}
