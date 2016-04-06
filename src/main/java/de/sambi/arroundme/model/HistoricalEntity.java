package de.sambi.arroundme.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
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
@Table (name="historical")//OPTIONELLE

public class HistoricalEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4623045243514606407L;
	@Id
	@SequenceGenerator(name="seq_id_historical", sequenceName="seq_id_historical",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="seq_id_historical")
	private long id;
	private Date date;
	private Time time;
	
	
	@ManyToMany
    @JoinTable(name="histo_serv", 
    joinColumns=@JoinColumn(name="HISTO_ID"),
    inverseJoinColumns=@JoinColumn(name="SERV_ID"))
    @Fetch(FetchMode.SUBSELECT)	
    private Set<ServiceEntity> service ;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Time getTime() {
		return time;
	}


	public void setTime(Time time) {
		this.time = time;
	}


	public Set<ServiceEntity> getService() {
		return service;
	}


	public void setService(Set<ServiceEntity> service) {
		this.service = service;
	}
	
	

}
