package com.sks.abstractfactory.example;

public class OrangeFactory implements FruitsFactory {

	@Override
	public Fruits getFruitDetail() {

		return new Orange();
	}
	

}
