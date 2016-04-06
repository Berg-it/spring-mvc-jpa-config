package de.sambi.arroundme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.sambi.arroundme.dto.AuthenticationDTO;
import de.sambi.arroundme.dto.RegisterRequestDTO;
import de.sambi.arroundme.dto.RegisterResponseDTO;
import de.sambi.arroundme.dto.UserInfoDTO;
import de.sambi.arroundme.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService gUserService;
	
	
	//http://localhost:8080/aroundme/users/login
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public UserInfoDTO authentication(@RequestBody AuthenticationDTO pRq){
		UserInfoDTO vUserInfoDTO = gUserService.authentication(pRq);
		return vUserInfoDTO;
	}
	
	//http://localhost:8080/aroundme/users/register
	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json",consumes="application/json")
	public RegisterResponseDTO authentication(@RequestBody RegisterRequestDTO pRq){
		RegisterResponseDTO vRp = gUserService.register(pRq);
		return vRp;
	}	 	
 
}
