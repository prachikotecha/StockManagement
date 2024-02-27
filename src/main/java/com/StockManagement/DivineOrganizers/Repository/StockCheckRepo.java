package com.StockManagement.DivineOrganizers.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StockManagement.DivineOrganizers.Entity.StockCheck;

@Repository
public interface StockCheckRepo extends JpaRepository<StockCheck,Integer>{
	
}
