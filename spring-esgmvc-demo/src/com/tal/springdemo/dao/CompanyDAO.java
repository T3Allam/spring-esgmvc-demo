package com.tal.springdemo.dao;

import java.util.List;

import javax.validation.Valid;

import com.tal.springdemo.entity.Company;

public interface CompanyDAO {
	public List<Company> getCompanies();

	public void saveCompany(@Valid Company company);
}
