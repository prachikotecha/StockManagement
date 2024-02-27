package com.StockManagement.DivineOrganizers.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.StockManagement.DivineOrganizers.Entity.Products;
import com.StockManagement.DivineOrganizers.Entity.StockCheck;
import com.StockManagement.DivineOrganizers.Service.StockCheckService;

@Controller
public class StockCheckController {
	
	@Autowired
	private StockCheckService stCheckService;
	
	@GetMapping("/addStock")
	public String addStock()
	{
		return "addStock";
	}
	
	@GetMapping("/StockCheck")
	public ModelAndView stockCheck()
	{
		List<StockCheck> lst=stCheckService.StockCheck();
		
		return new ModelAndView("StockCheck","stock",lst);
	}
	
	
	@PostMapping("/stockSave")
	public String addStock(@ModelAttribute StockCheck StockCheck)
	{
		stCheckService.stockSave(StockCheck);
		return "redirect:/StockCheck";
	}
	@RequestMapping("/deleteStock/{id}")
	public String deleteStock(@PathVariable("id") int id)
	{
		stCheckService.deleteById(id);
		return "redirect:/StockCheck";
	}
	@RequestMapping("/updateStock/{id}")
	public String updateStock(@PathVariable("id") int id,Model mod)
	{
		StockCheck Stock=stCheckService.getStockCheckById(id);
		mod.addAttribute("StockCheck",Stock);
		return "updateStock";
	}

}
