package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.model.PaymentDAO;

@RestController
public class PaymentController {
	@Autowired
	PaymentDAO paymentDAO;
	
	
}
