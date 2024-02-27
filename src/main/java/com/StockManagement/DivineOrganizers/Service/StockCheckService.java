package com.StockManagement.DivineOrganizers.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockManagement.DivineOrganizers.Entity.Products;
import com.StockManagement.DivineOrganizers.Entity.StockCheck;
import com.StockManagement.DivineOrganizers.Repository.StockCheckRepo;

@Service
public class StockCheckService {
	
	@Autowired
	private StockCheckRepo stcheckrepo;
	
	public void stockSave(StockCheck stock)
	{
		stcheckrepo.save(stock);
	}

public List<StockCheck> StockCheck()
{
	return stcheckrepo.findAll();
}
public void deleteById(int id)
{
	stcheckrepo.deleteById(id);
}

public StockCheck getStockCheckById(int id)
{
	return stcheckrepo.findById(id).get();
}
	

}
