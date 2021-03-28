package com.alfar.demo.model;


public class products {

	private String name;
	private String quantitymode;
	private int quantity;
	
	public products(String name,String quantitymode, int quantity) {
		
		this.name = name;
		this.quantitymode = quantitymode;
		this.quantity = quantity; 
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantitymode() {
		return quantitymode;
	}

	public void setQuantitymode(String quantitymode) {
		this.quantitymode = quantitymode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
	
	
}
