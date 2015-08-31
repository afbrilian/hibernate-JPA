package com.hibernatejpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernatejpa.model.Contact;

@Service("jpaContactService")
@Transactional
@Repository
public class ContactServiceImpl implements ContactService {
	private static final Log LOG = LogFactory.getLog(ContactServiceImpl.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional(readOnly=true)
	public List<Contact> findAll() {
		List<Contact> contacts = em.createNamedQuery("Contact.findAll", Contact.class).getResultList();
		return contacts;
	}
	
	public List<Contact> findAllWithDetail() {
		return null;
	}

	public Contact findById(Long id) {
		return null;
	}

	public Contact save(Contact contact) {
		return null;
	}

	public void delete(Contact contact) {
	}

}
