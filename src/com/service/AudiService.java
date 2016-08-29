package com.service;

import java.util.List;

import com.Cars;
import com.repository.CarsRepository;

public class AudiService implements CustomerService {

	private CarsRepository repo;

	public void setRepo(CarsRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Cars> findAllCars() {
		return repo.findAllCars();
	}

}
