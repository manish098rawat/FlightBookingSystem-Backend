package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.FlightStatus;
import com.model.FlightStatusDAO;

@RestController
public class FlightStatusController {
	@Autowired
	FlightStatusDAO flightstatusDAO ;
	@PostMapping("/addflightstatus")
	public String addFlightStatus(@RequestBody FlightStatus fs) {
		flightstatusDAO.save(fs);
		return "flight status added";
	}
	
	
}
