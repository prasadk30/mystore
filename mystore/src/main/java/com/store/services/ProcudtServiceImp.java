package com.store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.repositories.ProductRepository;

@Service
public class ProcudtServiceImp implements ProductService{

	@Autowired
	ProductRepository productRepository;
	@Override
	public void showProducts() {
		productRepository.findAll();
		
	}

}
