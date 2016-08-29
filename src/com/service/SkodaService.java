package com.service;

import java.util.List;

import com.Cars;
import com.repository.CarsRepository;

public class SkodaService implements CustomerService {

	private CarsRepository repo;
	
	public SkodaService(CarsRepository sr) {
		repo = sr;
	}
	
	@Override
	public List<Cars> findAllCars() {
		return repo.findAllCars();
	}

}
