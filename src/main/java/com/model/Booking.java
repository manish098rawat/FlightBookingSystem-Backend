package com.model;

import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Booking {
	@Id
	@GeneratedValue
	private int id;
	private long bookingNumber;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date bookingDate;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date travelDate;
	private double totalCost;
	@OneToOne
	private Flight flightBooked;
	public Booking() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getBookingNumber() {
		return bookingNumber;
	}
	public void setBookingNumber(long bookingNumber) {
		this.bookingNumber = bookingNumber;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public Flight getFlightBooked() {
		return flightBooked;
	}
	public void setFlightBooked(Flight flightBooked) {
		this.flightBooked = flightBooked;
	}
	
}