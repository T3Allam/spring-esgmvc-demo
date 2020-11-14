package com.tal.springdemo.dao;

import java.util.List;

import javax.validation.Valid;

import com.tal.springdemo.entity.Document;

public interface DocumentDAO {
	List<Document> getDocuments();
	void saveDocument(@Valid Document document);

}
