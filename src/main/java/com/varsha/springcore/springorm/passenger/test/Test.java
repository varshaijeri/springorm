package com.varsha.springcore.springorm.passenger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.varsha.springcore.springorm.passenger.dao.PassengerDao;
import com.varsha.springcore.springorm.passenger.model.Passenger;
import com.varsha.springcore.springorm.product.model.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/varsha/springcore/springorm/passenger/test/config.xml");
		PassengerDao passengerDao = (PassengerDao) ctx.getBean("passengerDaoImpl");

//insert new passenger
		Passenger passenger = new Passenger();
//		passenger.setId(3);
//		passenger.setFirstname("Sujith");
//		passenger.setLastname("MV");
//		int result = passengerDao.create(passenger);

//update the record
//		passenger.setId(3);
//		passenger.setFirstname("Sujit");
//		passenger.setLastname("MV");
//		passengerDao.update(passenger);

//delete the record
//		passenger.setId(3);
//		passengerDao.delete(passenger);

//read a single record
//		passenger = passengerDao.find(1);
//		System.out.println("passenger details: "+passenger);

//read all data
		List<Passenger> passengers = passengerDao.getAll();
		System.out.println("All passengers: \n" + passengers);

	}

}
