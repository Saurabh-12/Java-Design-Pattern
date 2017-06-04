package com.sks.abstractfactory.example;

public class ConsumeFruitFactory {
	
	public ConsumeFruitFactory(FruitsFactory fruitFactory) {
		if(fruitFactory != null) {
		Fruits mfruit = fruitFactory.getFruitDetail();
			System.out.println(mfruit.getFruitsName());
			System.out.println(mfruit.getFruitType());	
		}else {
			System.out.println("No such a Fruit. Please add it in class.");
		}
		
	}

}
