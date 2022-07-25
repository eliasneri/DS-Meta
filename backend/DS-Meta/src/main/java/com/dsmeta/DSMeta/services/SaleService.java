package com.dsmeta.DSMeta.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsmeta.DSMeta.entities.Sales;
import com.dsmeta.DSMeta.repositories.SaleRepository;

@Service
public class SaleService implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private SaleRepository repository;
	
	
	public List<Sales> findSales() {
		return repository.findAll();
	}
}
