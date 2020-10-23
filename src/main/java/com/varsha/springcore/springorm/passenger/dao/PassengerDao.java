package com.varsha.springcore.springorm.passenger.dao;

import java.util.List;

import com.varsha.springcore.springorm.passenger.model.Passenger;

public interface PassengerDao {
	int create(Passenger passenger);

	void update(Passenger passenger);

	void delete(Passenger passenger);

	Passenger find(int id);

	List<Passenger> getAll();
}
