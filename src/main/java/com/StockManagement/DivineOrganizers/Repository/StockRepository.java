package com.StockManagement.DivineOrganizers.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StockManagement.DivineOrganizers.Entity.Products;

@Repository
public interface StockRepository extends JpaRepository<Products,Integer> {

}
