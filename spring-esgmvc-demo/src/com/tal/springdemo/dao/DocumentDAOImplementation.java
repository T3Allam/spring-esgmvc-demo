package com.tal.springdemo.dao;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tal.springdemo.entity.Document;

@Repository
public class DocumentDAOImplementation implements DocumentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Document> getDocuments() {
		//get hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		//create Query
		Query<Document> theQuery = currentSession.createQuery("from Document", Document.class);
		//get result list
		List<Document> documents= theQuery.getResultList();
		//return results
		return documents;
	}

	@Override
	@Transactional
	public void saveDocument(@Valid Document document) {
		//get hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		//save company
		currentSession.save(document);
	}
}
