package com.cts.project.service;

import java.util.List;

import com.cts.project.dto.UserDTO;

public interface UserService {
	
	
	public List<UserDTO> getAllUsers();
	public UserDTO getUserById(int id);
	public UserDTO saveUser(UserDTO UserDTO);
	public void deleteUser(int id);
	public UserDTO updateUser(UserDTO UserDTO);
	public boolean activateUser(String email);
	
	
	

}
