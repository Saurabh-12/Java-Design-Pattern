package com.sks.factory.example;

import java.util.Scanner;

public class Factoryclient {
	
	public static void main(String[] args) {
		String coffee = "test";
		System.out.println("Enter Coffee name.\n");
		Scanner mscan = new Scanner(System.in);
		try {
			coffee = mscan.nextLine();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		mscan.close();
		
        Coffee mCoffee = CoffeeFactory.getCoffeeVariant(coffee);
        System.out.println(mCoffee.getCoffeeVariant());
	}

}
