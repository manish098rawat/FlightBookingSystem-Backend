package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Booking;
import com.model.BookingDAO;
import com.model.Payment;
import com.model.PaymentDAO;

@RestController
public class BookingController {
	@Autowired
	BookingDAO bookingDAO;
	@Autowired
	PaymentDAO paymentDAO;
	@PostMapping("/makepayment")
	public String makePayment(@RequestBody Payment p) {
		paymentDAO.save(p);
		return "payment done";
	}
	@DeleteMapping("/cancelbooking/{id}")
	public String cancelBooking(@RequestBody int id) {
		bookingDAO.deleteById(id);
		return "Booking cancelled";
	}

}
