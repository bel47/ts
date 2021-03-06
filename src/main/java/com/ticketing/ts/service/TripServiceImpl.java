package com.ticketing.ts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ticketing.ts.dao.TripDAO;
import com.ticketing.ts.dao.UserDAO;
import com.ticketing.ts.model.Trip;
import com.ticketing.ts.model.User;

public class TripServiceImpl implements TripService {

	@Autowired
	private TripDAO tripDAO;

	@Transactional
	@Override
	public List<Trip> get() {
		return tripDAO.get();
	}

	@Transactional
	@Override
	public Trip get(int id) {
		return tripDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Trip trip) {
		tripDAO.save(trip);
	}

	@Transactional
	@Override
	public void delete(int id) {
		tripDAO.delete(id);
	}

}
