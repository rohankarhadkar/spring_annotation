package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.Cars;

public class SkodaRepository implements CarsRepository {

	@Override
	public List<Cars> findAllCars() {
		List<Cars> cars = new ArrayList<>();
		
		Cars c1 = new Cars();
		c1.setManufacturer("Skoda");
		c1.setName("Superb");
		
		Cars c2 = new Cars();
		c2.setManufacturer("Skoda");
		c2.setName("Rapid");
		
		cars.add(c1);
		cars.add(c2);
		
		return cars;
	}

}
