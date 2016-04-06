package de.sambi.arroundme.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity//REQUIRED
@Table (name="service")//OPTIONELLE
public class ServiceEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7714625494289271157L;

	
	@Id
	@SequenceGenerator(name="seq_id_service", sequenceName="seq_id_service",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="seq_id_service")	
	private long id;
	private  String serviceType;
	private double price;
	
	@ManyToMany(mappedBy="service",fetch = FetchType.EAGER)
    private Set<UserEntity> user ;
	 
	 
	@ManyToMany(mappedBy="service",fetch = FetchType.EAGER)
    private Set<HistoricalEntity> historical ;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getServiceType() {
		return serviceType;
	}


	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Set<UserEntity> getUser() {
		return user;
	}


	public void setUser(Set<UserEntity> user) {
		this.user = user;
	}


	public Set<HistoricalEntity> getHistorical() {
		return historical;
	}


	public void setHistorical(Set<HistoricalEntity> historical) {
		this.historical = historical;
	}
	
	
	
}
