package de.sambi.arroundme.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity//REQUIRED
@Table (name="location")//OPTIONELLE

public class LocationEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6228881758259912513L;
	@Id
	@SequenceGenerator(name="seq_id_location", sequenceName="seq_id_location",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="seq_id_location")
	private long id;
	
    @Column(name = "currentLatitude", precision = 19, scale = 8)
    private BigDecimal  currentLatitude;
    @Column(name = "currentLongitude", precision = 19, scale = 8)
    private BigDecimal  currentLongitude;
    
	@OneToOne
	@JoinColumn(name="vehicule_id",referencedColumnName="id")
	private VehiculeEntity vehicule ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public VehiculeEntity getVehicule() {
		return vehicule;
	}

	public void setVehicule(VehiculeEntity vehicule) {
		this.vehicule = vehicule;
	}

	
}
