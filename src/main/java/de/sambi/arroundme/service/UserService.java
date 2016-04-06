package de.sambi.arroundme.service;

import de.sambi.arroundme.dto.AuthenticationDTO;
import de.sambi.arroundme.dto.RegisterRequestDTO;
import de.sambi.arroundme.dto.RegisterResponseDTO;
import de.sambi.arroundme.dto.UserInfoDTO;

public interface UserService {
	

	public UserInfoDTO authentication(AuthenticationDTO pRq);
	public RegisterResponseDTO register(RegisterRequestDTO pRq);
	
	
}
