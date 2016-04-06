package de.sambi.arroundme.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.sambi.arroundme.dao.ServiceDAO;
import de.sambi.arroundme.dao.UserDAO;
import de.sambi.arroundme.dto.AuthenticationDTO;
import de.sambi.arroundme.dto.RegisterRequestDTO;
import de.sambi.arroundme.dto.RegisterResponseDTO;
import de.sambi.arroundme.dto.UserInfoDTO;
import de.sambi.arroundme.model.LocationEntity;
import de.sambi.arroundme.model.ServiceEntity;
import de.sambi.arroundme.model.TypeUserEntity;
import de.sambi.arroundme.model.UserEntity;
import de.sambi.arroundme.model.VehiculeEntity;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO gUserDAO;
	
	@Autowired
	ServiceDAO gServiceDAO;

	public UserInfoDTO authentication(AuthenticationDTO pRq) {
		
		UserEntity vUserEntity = gUserDAO.login(pRq.getLogin(), pRq.getPassword());
		UserInfoDTO vRp = new UserInfoDTO();
		if(vUserEntity.equals(null))
			return vRp;
		else{
			vRp.setName(vUserEntity.getName());
			vRp.setLastName(vUserEntity.getLastName());
			return vRp;
		}
		
	}

	public RegisterResponseDTO register(RegisterRequestDTO pRq) {
		
		LocationEntity vLocationEntity = new LocationEntity();
		VehiculeEntity vVehiculeEntity = new VehiculeEntity();
		UserEntity vUserEntity = new UserEntity();
		TypeUserEntity vTypeUserEntity = new TypeUserEntity();
		Set<ServiceEntity> vSetservice = new HashSet<>();
		
		//set Type user
		vTypeUserEntity.setId(pRq.getTypeUserId());
		vUserEntity.setTypeUser(vTypeUserEntity);
		//set service
		vSetservice.add(gServiceDAO.findByID(pRq.getIdTypeService()));
		//set location
		vLocationEntity.setCurrentLatitude(pRq.getCurrentLatitude());
		vLocationEntity.setCurrentLongitude(pRq.getCurrentLongitude());
		vLocationEntity.setVehicule(vVehiculeEntity);
		//Set vehicule
		vVehiculeEntity.setMaticule(pRq.getMatricule());
		vVehiculeEntity.setModele(pRq.getCarModel());
		vVehiculeEntity.setType(pRq.getCarType());
		vVehiculeEntity.setUser(vUserEntity);
		vVehiculeEntity.setLocation(vLocationEntity);
		//Set User
		vUserEntity.setAdress(pRq.getAdress());
		vUserEntity.setCin(pRq.getCin());		
		vUserEntity.setVehicule(vVehiculeEntity);
		vUserEntity.setLastName(pRq.getLastName());
		vUserEntity.setName(pRq.getFirstName());
		vUserEntity.setMail(pRq.getMail());
		vUserEntity.setPassword(pRq.getPassword());
		vUserEntity.setService(vSetservice);
		vUserEntity.setTel(pRq.getTel());
		
		vUserEntity = gUserDAO.register(vUserEntity);
		
		RegisterResponseDTO vRp = new RegisterResponseDTO();
		vRp.setName(vUserEntity.getName());
		
		
		return vRp;
	}


}
