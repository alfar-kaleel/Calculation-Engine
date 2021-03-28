package com.alfar.demo.CalService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alfar.demo.model.products;

@Service
public class CalculatorServiceImpl implements CalculatorService {
	
	
 
 private double totalprice;
 private double total;
   
 
 
@Override
public List<Double> calculateList(String productCode) {
	
	List<Double> productList = new ArrayList<>();
	
	 int x = 0;
		int y = 0;
	
	
	for(int i = 1; i<=50; i++) {
	
	
		if(productCode.equals("penguinears")) {
			
			x = i / 20 ;
			y = i % 20;
			
			if(x>=3) {
			
			totalprice = (x * 175 *0.9) + (y * 175 * 1.3 / 20);
			}
			
			else {
				totalprice = (x * 175) + (y * 175 * 1.3 / 20);
				
			}
			productList.add(totalprice);
			
			
	}
		
  else if(productCode.equals("horseshoe")) {
	  
	  x = i / 5; y = i % 5;
	  
	 
	  if(x >= 3) {
	  totalprice = (x * 825 *0.9) + (y * 825 / 5 * 1.3);
	  }
	  else {
		  totalprice = (x * 825 ) + (y * 825 / 5 * 1.3);
		  
	  }
	productList.add(totalprice);
	  
  }
		
		
		
	}
	
	return productList;
	
	}


@Override
public double calculatePrice(products Product) {
	
	
	 int x = 0;
		int y = 0;
	
	if(Product.getName().equals("Penguin Ear")) {
		
		x = Product.getQuantity() /20;
		y = Product.getQuantity() % 20;
		
		if(Product.getQuantitymode().equals("Carton")) {
			
			if(Product.getQuantity() <0) {
				
				total = 0;
			}
			
			if(Product.getQuantity() >0 && Product.getQuantity() < 3) {
				
				total = 175 * Product.getQuantity();
				
			}
			
			else {
				
				total = 175 * Product.getQuantity() * 0.9;
				
			}
			
		}
		
		else if(Product.getQuantitymode().equals("Single Unit")) {
			
			if(x <=0) {
				
				total = 0;
			}
			if(x>=3) {
				
				total = (x * 175 * 0.9) + (y * 175 * 1.3 / 20) ;
			}
			
			else {
				total = (x * 175) + (y * 175 * 1.3 / 20);
			}
			
		}
		
		
	}
	
	else if(Product.getName().equals("Horse Shoe")) {
		
		x = Product.getQuantity() /5;
		y = Product.getQuantity() % 5;
		
		if(Product.getQuantitymode().equals("Carton")) {
			
	if(Product.getQuantity() <0) {
				
				total = 0;
			}
			
			if(Product.getQuantity() >0 && Product.getQuantity() < 3) {
				
				total = 825 * Product.getQuantity();
				
			}
			
			else {
				
				total = 825 * Product.getQuantity() * 0.9;
				
			}
			
		}
		
		else if(Product.getQuantitymode().equals("Single Unit")) {
			
          if(x <=0) {
				
				total = 0;
			}
			if(x>=3) {
				
				total = (x * 825 * 0.9) + (y * 825 / 5 * 1.3) ;
			}
			
			else {
				total = (x * 825) + (y * 825 / 5 * 1.3);
			}
			
		}
	}
	
	
	return total;
	

	
	
	
}




	
}
 
 


