package com.cts.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.project.bean.Company;
import com.cts.project.repo.CompanyRepo;
import com.cts.project.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	CompanyRepo companyRepo;

	@Override
	public List<Company> getAllCompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company getCompanyById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company saveCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCompany(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
