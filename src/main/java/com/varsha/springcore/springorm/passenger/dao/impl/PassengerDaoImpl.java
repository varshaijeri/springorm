package com.varsha.springcore.springorm.passenger.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.varsha.springcore.springorm.passenger.dao.PassengerDao;
import com.varsha.springcore.springorm.passenger.model.Passenger;

@Component
public class PassengerDaoImpl implements PassengerDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Passenger passenger) {
		int result = (int) hibernateTemplate.save(passenger);
		return result;
	}

	@Override
	@Transactional
	public void update(Passenger passenger) {
		hibernateTemplate.update(passenger);
	}

	@Override
	@Transactional
	public void delete(Passenger passenger) {
		hibernateTemplate.delete(passenger);
	}

	@Override
	public Passenger find(int id) {
		Passenger passenger = hibernateTemplate.get(Passenger.class, id);
		return passenger;
	}

	@Override
	public List<Passenger> getAll() {
		List<Passenger> passengers = hibernateTemplate.loadAll(Passenger.class);
		return passengers;
	}

}
