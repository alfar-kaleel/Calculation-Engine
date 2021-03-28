package com.alfar.demo.CalService;

import java.util.List;

import com.alfar.demo.model.products;

public interface CalculatorService {
	
	List<Double> calculateList(String productCode);
	double calculatePrice(products product);

}
