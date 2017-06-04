package com.sks.abstractfactory.example;

public class AppleFactory implements FruitsFactory{

	@Override
	public Fruits getFruitDetail() {
		return new Apple();
		
	}

}
