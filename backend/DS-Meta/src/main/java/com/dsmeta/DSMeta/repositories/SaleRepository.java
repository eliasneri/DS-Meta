package com.dsmeta.DSMeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dsmeta.DSMeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query(value="SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC",
		   countQuery = "SELECT count(1) FROM Sale obj WHERE obj.date BETWEEN :min AND :max")
		// o countQuery ja vai enviar pageable o count certo para que possa fazer o calculo de size por página
	Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);

}
