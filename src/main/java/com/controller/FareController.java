package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Fare;
import com.model.FareDAO;

@RestController
public class FareController {
	@Autowired
	FareDAO fareDAO;
	@PatchMapping("/modifyfare")
	public String modifyFare(@RequestBody Fare f) {
		fareDAO.save(f);
		return "fare modified";
	}
	

}
