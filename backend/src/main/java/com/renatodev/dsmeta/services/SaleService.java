package com.renatodev.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renatodev.dsmeta.entities.Sale;
import com.renatodev.dsmeta.repository.SaleRepository;



@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> FindSales() {
		return repository.findAll();
	}
}
