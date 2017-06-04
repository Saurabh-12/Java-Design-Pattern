package com.sks.abstractfactory.example;

public class MangoFactory implements FruitsFactory{

	@Override
	public Fruits getFruitDetail() {
		// TODO Auto-generated method stub
		return new Mango();
	}

}
