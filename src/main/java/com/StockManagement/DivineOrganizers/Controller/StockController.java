package com.StockManagement.DivineOrganizers.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.spring6.expression.SpringStandardConversionService;

import com.StockManagement.DivineOrganizers.Entity.Products;
import com.StockManagement.DivineOrganizers.Service.StockService;

@Controller
public class StockController {
	
	@Autowired
	private StockService stservice;
	
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	@GetMapping("/allproducts")
	public String prodList()
	{
		return "productList";
	}
	@GetMapping("/addProduct")
	public String addProduct()
	{
		return "addProduct";
	}
	
	
	@GetMapping("/productList")
	public ModelAndView productList()
	{
		List<Products> lst=stservice.productList();
		
		return new ModelAndView("productList","prod",lst);
	}
	
	
	@PostMapping("/save")
	public String addProd(@ModelAttribute Products Products)
	{
		stservice.save(Products);
		return "redirect:/productList";
	}
	
	@RequestMapping("/deleteMyProd/{id}")
	public String deleteMyProd(@PathVariable("id") int id)
	{
		stservice.deleteById(id);
		return "redirect:/productList";
	}
	
	@RequestMapping("/updateProduct/{id}")
	public String updateProduct(@PathVariable("id") int id,Model model)
	{
		Products prod=stservice.getProductsById(id);
		model.addAttribute("Products",prod);
		return "updateProduct";
	}
	
	
	
	
	
}
