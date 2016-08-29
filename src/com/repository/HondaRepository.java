package com.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Cars;

@Repository("hondaRepository")
public class HondaRepository implements CarsRepository {

	@Override
	public List<Cars> findAllCars() {
		List<Cars> cars = new ArrayList<>();
		
		Cars c1 = new Cars();
		c1.setManufacturer("Honda");
		c1.setName("Civic");
		
		Cars c2 = new Cars();
		c2.setManufacturer("Honda");
		c2.setName("City");
		
		cars.add(c1);
		cars.add(c2);
		
		return cars;
	}

}
