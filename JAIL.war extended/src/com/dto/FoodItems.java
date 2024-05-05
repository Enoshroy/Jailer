package com.dto;

public class FoodItems {

	private String foodnames;
	private int itemno;
	
	
	
	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}



	public FoodItems(String foodnames, int itemno) {
		super();
		this.foodnames = foodnames;
		this.itemno = itemno;
	}



	public String getFoodnames() {
		return foodnames;
	}



	public void setFoodnames(String foodnames) {
		this.foodnames = foodnames;
	}



	public int getItemno() {
		return itemno;
	}



	public void setItemno(int itemno) {
		this.itemno = itemno;
	}



	@Override
	public String toString() {
		return "FoodItems [foodnames=" + foodnames + ", itemno=" + itemno + "]";
	}
	
}
