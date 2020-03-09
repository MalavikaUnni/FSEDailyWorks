package com.cts.project.userservice;

import java.util.List;
import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cts.project.userservice.UserDTO;
import com.cts.project.userservice.UserService;

@CrossOrigin(origins = "*")
@RestController
public class UserRestController {
	Logger logger=LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserService userService;
	
	
	@GetMapping("/login")
	public ResponseEntity<?> login() {
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@GetMapping("/user")
	//public List<UserDTO> getUsers() {
	    public ResponseEntity<?> getUsers() {
		
		List<UserDTO> list=userService.getAllUsers();
		if(list.size()>0)
		{
			return new ResponseEntity<List<UserDTO>>(list,HttpStatus.OK);
			
		}
		else
		{
			return new ResponseEntity<String>("Not Found",HttpStatus.NOT_FOUND);
		}
		//return userService.getAllUsers();
	}

	
	
	@GetMapping(value = "/user/{id}")
	public ResponseEntity<?> getUserById(@PathVariable("id") int id) {
		try {
			UserDTO user = userService.getUserById(id);
			return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<String>("No such user found\n" + e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
		
	
	@PostMapping(value = "/user")
	public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO user) {
		return new ResponseEntity<UserDTO>(userService.saveUser(user), HttpStatus.OK);
	}
	

	@DeleteMapping(value = "/user/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable int id) {
		try {
			userService.deleteUser(id);
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
		} catch (IllegalArgumentException e) {
			return new ResponseEntity<String>("No such user found", HttpStatus.BAD_REQUEST);
		}
	}
		
	@PutMapping(value = "/user")
	public ResponseEntity<?> updateUser(@RequestBody UserDTO user) {
		return new ResponseEntity<UserDTO>(userService.updateUser(user), HttpStatus.OK);
	}
	

	@PutMapping(value = "/activate")
	public ResponseEntity<?> activateUser(@RequestBody String email) {
		try {
			Boolean status = userService.activateUser(email);
			return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<String>("No such email assigned to user", HttpStatus.BAD_REQUEST);
		}
	}
	
}
