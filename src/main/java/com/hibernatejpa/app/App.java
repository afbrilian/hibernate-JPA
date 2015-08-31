package com.hibernatejpa.app;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.hibernatejpa.dao.ContactService;
import com.hibernatejpa.dao.ContactServiceImpl;
import com.hibernatejpa.model.Contact;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-annotation.xml");
		ctx.refresh();

		ContactService contactService = ctx.getBean("jpaContactService", ContactService.class);
		listContacts(contactService.findAll());
	}

	private static void listContacts(List<Contact> contacts) {
		System.out.println("");
		System.out.println("Listing contacts without details:");
		for (Contact contact : contacts) {
			System.out.println(contact);
			System.out.println();
		}
	}
}
