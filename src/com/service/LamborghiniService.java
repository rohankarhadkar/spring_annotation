package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Cars;
import com.repository.LamborghiniRepository;

public class LamborghiniService implements CustomerService {

	@Autowired
	LamborghiniRepository repo;

	public LamborghiniService() {
		System.out.println("default constructor of lamborghini");
	}

	public LamborghiniService(LamborghiniRepository cr) {
		System.out.println("paramaterized constructor of lamborghini");
		repo = cr;
	}

	@Override
	public List<Cars> findAllCars() {
		return repo.findAllCars();
	}

	public void setRepo(LamborghiniRepository repo) {
		System.out.println("setter of lamborghini");
		this.repo = repo;
	}

}
