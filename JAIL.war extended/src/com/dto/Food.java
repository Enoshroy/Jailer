package com.dto;

public class Food {


		private String foodnames;

		@Override
		public String toString() {
			return "Food [foodnames=" + foodnames + "]";
		}

		public Food() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Food(String foodnames) {
			super();
			this.foodnames = foodnames;
		}

		public String getFoodnames() {
			return foodnames;
		}

		public void setFoodnames(String foodnames) {
			this.foodnames = foodnames;
		}
		
}