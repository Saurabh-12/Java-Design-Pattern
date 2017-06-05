package com.sks.decorator.example;

/*
 * FoodDecorator abstract class implements the Food interface and override it's all methods 
 * and it has the ability to decorate some more foods.*/

public abstract class FoodDecorator implements Food {

	private Food newFood;

	public FoodDecorator(Food newFood) {
		this.newFood = newFood;
	}

	@Override
	public String prepareFood() {
		return newFood.prepareFood();
	}

	public double foodPrice() {
		return newFood.foodPrice();
	}

}
