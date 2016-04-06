package de.sambi.arroundme.dao;

import de.sambi.arroundme.model.UserEntity;

public interface UserDAO {
	
	public UserEntity login(long pLogin, String pPassword );
	public UserEntity register(UserEntity pRq);

}
