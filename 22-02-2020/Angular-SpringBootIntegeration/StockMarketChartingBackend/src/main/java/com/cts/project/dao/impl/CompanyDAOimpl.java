package com.cts.project.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.bean.Company;
import com.cts.project.dao.CompanyDAO;

@CrossOrigin(origins="*")
@RestController
public class CompanyDAOimpl {
	
	@Autowired
	CompanyDAO companyDao;
	
	@GetMapping("/company")
	public List<Company> getAllCompany()
	{
		return companyDao.findAll();
	}
	
	
	@GetMapping("/company/{id}")
	public Company getCompanyById(@PathVariable int id)
	{
		Optional<Company> companyList=companyDao.findById(id);
		Company company=companyList.get();
		return company;
	}
	
	@PostMapping("/company")
	public Company saveCompany(@RequestBody Company company)
	{
		Company newCompany=companyDao.save(company);
		return newCompany;
	}
	
	@DeleteMapping("/company/{id}")
	public void deleteCompany(@PathVariable int id)
	{
		companyDao.deleteById(id);
	}
	
	public Company updateCompany(@RequestBody Company company)
	{
		Company updateCompany=companyDao.save(company);
		return updateCompany;
	}

}
