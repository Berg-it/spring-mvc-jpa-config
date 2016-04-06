package de.sambi.arroundme.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity//REQUIRED
@Table (name="typeUser")//OPTIONELLE
public class TypeUserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2740538633954244210L;
	
	@Id
	@SequenceGenerator(name="seq_id_type", sequenceName="seq_id_type",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="seq_id_type")	
	private long id;
	@Column(name = "typeName")
	private String typeName;
    @OneToMany(fetch=FetchType.LAZY,mappedBy="typeUser")
    private Set<UserEntity> users;

    
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public Set<UserEntity> getUsers() {
		return users;
	}
	public void setUsers(Set<UserEntity> users) {
		this.users = users;
	}
	
    
    
    
	

}
