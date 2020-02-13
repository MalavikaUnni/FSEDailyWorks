package com.cts.training.spring.dao;

import java.util.List;

import com.cts.training.spring.model.Register;

public interface RegisterDAO {

	public boolean saveUser(Register register);

	public boolean updateUser(Register register);
	
//	public boolean saveOrUpdateUser(Register register);

	public boolean deleteUser(Register register);

	public Register getUserById(int id);

	public List<Register> getAllUsers();
}
