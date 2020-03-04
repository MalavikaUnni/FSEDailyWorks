package com.cts.project.service;

import java.util.List;

import com.cts.project.bean.Company;



public interface CompanyService {
	
	

	public List<Company> getAllCompany();
	public Company getCompanyById(int id);
	public Company saveCompany(Company company);
	public void deleteCompany(int id);
	public Company updateCompany(Company company);


}
