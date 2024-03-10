package service;

import java.util.ArrayList; 
import java.util.LinkedHashMap;

import entity.customer;

public interface Rentalservice {

	
	ArrayList<customer> Li = new ArrayList<customer>();
	LinkedHashMap<Integer, customer> nac = new LinkedHashMap<Integer, customer>();
	LinkedHashMap<Integer, customer> ac = new LinkedHashMap<Integer, customer>();
	LinkedHashMap<Integer, customer> deluxe = new LinkedHashMap<Integer, customer>();
	
	void info();
	void roomsAvialable();
	void checkIn();
	void checkOut();
	void customerdetails();
	
}
