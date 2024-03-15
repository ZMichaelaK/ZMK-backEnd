package com.zmk.services;

import org.springframework.stereotype.Service;

import com.zmk.repos.BasketRepo;
import com.zmk.repos.PetRepo;

@Service
public class PetServices {
	private PetRepo repo;
	
	private BasketRepo basketRepo;

	public PetServices(PetRepo repo, BasketRepo basketRepo) {
		super();
		this.repo=repo;
		this.basketRepo = basketRepo;
	}
	
}
