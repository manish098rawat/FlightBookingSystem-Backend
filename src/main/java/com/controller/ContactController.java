package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Contact;
import com.model.ContactDAO;

@RestController
public class ContactController {
	@Autowired
	ContactDAO contactDAO;
	@PostMapping("/addcontact")
	public String addContact(@RequestBody Contact c) {
		contactDAO.save(c);
		return "contact saved successfully";
	}
	

}
