package com.alfar.demo.CalController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alfar.demo.CalService.CalculatorService;
import com.alfar.demo.model.products;



@RestController
@RequestMapping(value = "/wel")
@CrossOrigin(origins = "http://localhost:4200")
public class CalculatorController {
	
	@Autowired
	CalculatorService calservice;
	
	@RequestMapping("/welcome")
	public String welcome() {
		 
		return "Hello welcome to the application";
	
	}
	
	@RequestMapping(value = "productList/{productcode}" , method = RequestMethod.GET)
	public List<Double> productPricelist(@PathVariable String productcode){
		
		
		return calservice.calculateList(productcode);
		
	}
	
	@RequestMapping(value = "calculate" , method = RequestMethod.POST)
	public double calculatePrice(@RequestBody products product) {
		
		return calservice.calculatePrice(product);
	}
	
	

}
