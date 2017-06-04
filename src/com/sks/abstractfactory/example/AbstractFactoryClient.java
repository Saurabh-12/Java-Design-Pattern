package com.sks.abstractfactory.example;

public class AbstractFactoryClient {
	
	public static void main(String[] args) {
		
		new ConsumeFruitFactory(getFruitDetail("Orange"));
	}

	public static FruitsFactory getFruitDetail(String type) {
		if("Orange".equalsIgnoreCase(type)) {
			return new OrangeFactory();
		}else if("Mango".equalsIgnoreCase(type)) {
			return new MangoFactory();
		}else if("Apple".equalsIgnoreCase(type)) {
			return new AppleFactory();
		}else {
			return null;
		}
	}
}
