package de.sambi.arroundme.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import de.sambi.arroundme.model.UserEntity;


@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

	@PersistenceContext
	private EntityManager entityManager;	
	
	public UserEntity login(long pLogin, String pPassword) {
		
		String vQueryStr = "SELECT OBJ FROM UserEntity OBJ WHERE (OBJ.tel =:pTel) and (OBJ.password =:pPass)";
        TypedQuery<UserEntity> query = this.entityManager.createQuery(vQueryStr, UserEntity.class);
        query.setParameter("pTel", pLogin);
        query.setParameter("pPass", pPassword);
        
        UserEntity vRp = null;
        List<UserEntity> vListRp = query.getResultList();
        if(vListRp.size()>0)
        	vRp = vListRp.get(0);
		
		return vRp;
	}

	public UserEntity register(UserEntity pRq) {
		
		this.entityManager.persist(pRq);
		
		return pRq;
	}
	
	
	
	
	

}
