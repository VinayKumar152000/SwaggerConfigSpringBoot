package com.example.demo.controllers;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Contact;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
public class AddressBookResource {

	ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();

	@GetMapping("/{id}")
	@ApiOperation(value = "find contact by id", notes = "provide id", response = Contact.class)
	public Contact getContact(@ApiParam(value = "id to retrieve", required = true) @PathVariable("id") String id) {

		return contacts.get(id);
	}

	@GetMapping
	public List<Contact> getAllContacts() {

		return new ArrayList<Contact>(contacts.values());
	}

	@PostMapping
	public Contact addContact(@RequestBody Contact contact) {
		contacts.put(contact.getId(), contact);
		return contact;
	}
}
