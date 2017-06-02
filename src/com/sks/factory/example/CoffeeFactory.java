package com.sks.factory.example;

public class CoffeeFactory {
	
	public static Coffee getCoffeeVariant(String Coffee) {
	       if (Coffee.equalsIgnoreCase ("Fresh")){
	              return new FreshCoffee();
	       }else if(Coffee.equalsIgnoreCase ("Cappuccino")){
	              return new Cappuccino();
	       }else if(Coffee.equalsIgnoreCase ("Viennese")){
	              return new VienneseCoffee();
	        }
	       throw new IllegalArgumentException("No such Coffee");
	}

}
