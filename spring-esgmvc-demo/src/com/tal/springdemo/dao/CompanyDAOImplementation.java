package com.tal.springdemo.dao;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tal.springdemo.entity.Company;

@Repository
public class CompanyDAOImplementation implements CompanyDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
		
	@Override
	@Transactional
	public List<Company> getCompanies() {
		//get hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		//create query
		Query<Company> theQuery = currentSession.createQuery("from Company", Company.class);
		//get result list
		List<Company> companies = theQuery.getResultList();
		//return results
		return companies;
	}

	@Override
	@Transactional
	public void saveCompany(@Valid Company company) {
		//get hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		//save company
		currentSession.save(company);
		
	}

}
