package com.StockManagement.DivineOrganizers.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockManagement.DivineOrganizers.Entity.Products;
import com.StockManagement.DivineOrganizers.Repository.StockRepository;

@Service
public class StockService {
	
	@Autowired
	private StockRepository strepo;
	
	public void save(Products prod)
	{
		strepo.save(prod);
	}

public List<Products> productList()
{
	return strepo.findAll();
}

public void deleteById(int id)
{
	strepo.deleteById(id);
}

public Products getProductsById(int id)
{
	return strepo.findById(id).get();
}
}
