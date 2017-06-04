package com.sks.abstractfactory.example;

public class Apple implements Fruits {

	@Override
	public String getFruitsName() {
		
		return "Apple";
	}

	@Override
	public String getFruitType() {
		
		return "An apple a day";
	}

}
