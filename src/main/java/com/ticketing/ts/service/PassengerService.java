package com.ticketing.ts.service;

import java.util.List;

import com.ticketing.ts.model.Passenger;

public interface PassengerService {

	List<Passenger> get();
	Passenger get(Long id);
	void save(Passenger passenger);
	void delete(Long id);

}
