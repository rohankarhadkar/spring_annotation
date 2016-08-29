package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Cars;
import com.repository.HondaRepository;

public class HondaService implements CustomerService {

	HondaRepository HondaRepository;
	
	@Autowired
	public void setHondaRepository(HondaRepository hondaRepository) {
		this.HondaRepository = hondaRepository;
	}

	@Override
	public List<Cars> findAllCars() {
		return HondaRepository.findAllCars();
	}

}
