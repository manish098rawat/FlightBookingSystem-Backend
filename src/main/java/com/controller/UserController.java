package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.exception.BookingNotFoundException;
import com.exception.UserExistsException;
import com.exception.UserNotFoundException;
import com.model.Booking;
import com.model.BookingDAO;
import com.model.Flight;
import com.model.FlightDAO;
import com.model.User;
import com.model.UserDAO;

@RestController
public class UserController {
	@Autowired
	UserDAO userDAO;
	@Autowired
	FlightDAO flightDAO;
	@Autowired
	BookingDAO bookingDAO;
	
	
	@PostMapping("/adduser")
	public String addUser(@RequestBody User u) {
		
		Optional<User> opt=userDAO.findByUserName(u.getUserName());
		if(opt.isPresent()) {
			throw new UserExistsException();
		}
		userDAO.save(u);
		return "user added";
	}
	@PatchMapping("/modifyuser")
	public String modifyUser(@RequestBody User u) {
		Optional<User> opt=userDAO.findById(u.getId());
		if(!opt.isPresent()) {
			throw new UserNotFoundException();
		}
		userDAO.save(u);
		return "user modified";
	}

	@DeleteMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable int id) {
		Optional<User> opt=userDAO.findById(id);
		if(!opt.isPresent()) {
			throw new UserNotFoundException();
		}
		userDAO.deleteById(id);
		return "user deleted";
		
	}
	@GetMapping("/viewschedule/{id}")
	public Optional<Flight> searchFlight(@PathVariable int id) {
		return flightDAO.findById(id);
	}
	
	@PostMapping("/bookticket")
	public String bookTicket(@RequestBody Booking b) {
		bookingDAO.save(b) ;
		System.out.println("ticket booked");
		return "ticket Booked";
		
	}
	
	
	@DeleteMapping("/cancelticket/{id}")
	public String cancelTicket(@PathVariable int id) {
		Optional<Booking> opt=bookingDAO.findById(id);
		if(!opt.isPresent()) {
			throw new BookingNotFoundException();
		}
		bookingDAO.deleteById(id);
		return "Booking cancelled";
	}
	
	
}
