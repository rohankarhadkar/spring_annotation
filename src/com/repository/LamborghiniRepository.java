package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.Cars;

public class LamborghiniRepository implements CarsRepository {

	@Override
	public List<Cars> findAllCars() {
		List<Cars> cars = new ArrayList<>();
		
		Cars c1 = new Cars();
		c1.setManufacturer("Lamborghini");
		c1.setName("Aventador");
		
		cars.add(c1);
		
		return cars;
	}

}
