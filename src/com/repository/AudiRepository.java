package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.Cars;

public class AudiRepository implements CarsRepository {

	@Override
	public List<Cars> findAllCars() {
		List<Cars> cars = new ArrayList<>();
		
		Cars c1 = new Cars();
		c1.setManufacturer("Audi");
		c1.setName("R8");
		
		Cars c2 = new Cars();
		c2.setManufacturer("Audi");
		c2.setName("A6");
		
		cars.add(c1);
		cars.add(c2);
		
		return cars;
	}

}
