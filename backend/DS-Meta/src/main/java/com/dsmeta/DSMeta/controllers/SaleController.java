package com.dsmeta.DSMeta.controllers;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsmeta.DSMeta.entities.Sales;
import com.dsmeta.DSMeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController implements Serializable{
	private static final long serialVersionUID = 1L;
		
		@Autowired
		private SaleService service;
		
		@GetMapping
		public List<Sales> findAll() {
			return service.findSales(); 
		}
	
	
}
