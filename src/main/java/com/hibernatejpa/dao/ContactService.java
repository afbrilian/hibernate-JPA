package com.hibernatejpa.dao;

import java.util.List;

import com.hibernatejpa.model.Contact;

public interface ContactService {
	List<Contact> findAll();
	List<Contact> findAllWithDetail();
	Contact findById(Long id);
	Contact save(Contact contact);
	void delete(Contact contact);
}