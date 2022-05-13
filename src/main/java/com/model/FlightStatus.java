package com.model;

import javax.persistence.*;

@Entity
public class FlightStatus {
	@Id
	@GeneratedValue
	private int id;
	private int remainingEconomySeats;
	private int remainingPremiumSeats;
	private int remainingBusinessSeats;
	public FlightStatus() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRemainingEconomySeats() {
		return remainingEconomySeats;
	}
	public void setRemainingEconomySeats(int remainingEconomySeats) {
		this.remainingEconomySeats = remainingEconomySeats;
	}
	public int getRemainingPremiumSeats() {
		return remainingPremiumSeats;
	}
	public void setRemainingPremiumSeats(int remainingPremiumSeats) {
		this.remainingPremiumSeats = remainingPremiumSeats;
	}
	public int getRemainingBusinessSeats() {
		return remainingBusinessSeats;
	}
	public void setRemainingBusinessSeats(int remainingBusinessSeats) {
		this.remainingBusinessSeats = remainingBusinessSeats;
	}
	
			
	

}
