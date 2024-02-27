package com.StockManagement.DivineOrganizers.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StockCheck {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String prodName;
	private int purchaseRate;
	private int sellingRate;
	private int sold;
	private int inStock;
	public StockCheck(int id, String prodName, int purchaseRate, int sellingRate, int sold, int inStock) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.purchaseRate = purchaseRate;
		this.sellingRate = sellingRate;
		this.sold = sold;
		this.inStock = inStock;
	}
	public StockCheck() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPurchaseRate() {
		return purchaseRate;
	}
	public void setPurchaseRate(int purchaseRate) {
		this.purchaseRate = purchaseRate;
	}
	public int getSellingRate() {
		return sellingRate;
	}
	public void setSellingRate(int sellingRate) {
		this.sellingRate = sellingRate;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	public int getInStock() {
		return inStock;
	}
	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

}
