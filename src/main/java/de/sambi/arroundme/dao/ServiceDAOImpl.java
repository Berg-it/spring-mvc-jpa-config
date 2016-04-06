package de.sambi.arroundme.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import de.sambi.arroundme.model.ServiceEntity;

@Repository
@Transactional
public class ServiceDAOImpl implements ServiceDAO {

	@PersistenceContext
	private EntityManager entityManager;	
	
	@Override
	public ServiceEntity findByID(long idTypeService) {
		return this.entityManager.find(ServiceEntity.class, idTypeService);
	}

}
