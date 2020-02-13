package com.cts.training.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

//import org.hibernate.HibernateException;

import com.cts.training.spring.model.Register;
import com.cts.training.spring.dao.RegisterDAO;
@Repository(value="registerDAOImpl")
public class RegisterDAOImpl implements RegisterDAO{
	
	
	private JdbcTemplate jdbcTemplate; 
	 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{ 
		this.jdbcTemplate = jdbcTemplate;
		}
	


	public boolean saveUser(Register register) {
		/*String query = "insert into employee values('" +               
		 * employee.getId() + "','" +     employee.getName() + "','" + employee.getAddress() + "','" +     
		 * employee.getEmail() + "','" + employee.getMobile() + "')"; 
	 *  try { 
	 *  jdbcTemplate.update(query); 
	 *  return true;
	 *  } 
	 *  catch (DataAccessException e) 
	 *  {     
	 *  e.printStackTrace();  
	 *  return false;  
	 *  }         */   
		 
		String query = "insert into springjdbc values(?,?,?,?,?,?)";   
		try { 
			jdbcTemplate.update(query, register.getId(), register.getName(), register.getEmail(), 
					register.getPhone(), register.getUsername(), register.getPassword());    
			return true;  
			} 
		catch (DataAccessException e) 
		{    
			e.printStackTrace();    
			return false;   
		}  
	}

	public boolean updateUser(Register register) {
		
		String query = "update springjdbc set name=?,,email=?,phone=? ";   
		try { 
			jdbcTemplate.update(query, register.getId(), register.getName(), register.getEmail(), 
					register.getPhone(), register.getUsername(), register.getPassword());    
			return true;  
			} 
		catch (DataAccessException e) 
		{    
			e.printStackTrace();    
			return false;   
		}  
	}

	public boolean deleteUser(Register register) {
		
		String query = "delete from employee where id =?";   
		try {    
			jdbcTemplate.update(query, register.getId());    
			return true;   
			} 
		catch (DataAccessException e) 
		{    
			e.printStackTrace();    
			return false;   
			} 
	}

	public Register getUserById(int id) {
		
		
		String query = "select * from springjdbc where id = " +id;   
		RowMapper<Register> rowMapper = new BeanPropertyRowMapper<Register>(Register.class);   
		return jdbcTemplate.queryForObject(query, rowMapper); 
	}

	public List<Register> getAllUsers() {
		 return jdbcTemplate.query("select * from springjdbc", new RowMapper<Register>() { 
			 
			   public Register mapRow(ResultSet rs, int rownumber) throws SQLException { 
			    Register reg = new Register(); 
			    reg.setId(rs.getInt(1));    
			    reg.setName(rs.getString(2));     
			    reg.setEmail(rs.getString(3));     
			    reg.setPhone(rs.getLong(4));    
			    reg.setUsername(rs.getString(5));
			    reg.setPassword(rs.getString(6));
			    
			    return reg;    }  
			   }); 
	}
	
}