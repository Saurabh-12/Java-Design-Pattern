package com.sks.adapter.example;

public class Rose implements Flower{

	@Override
	public void blossom() {
		
		System.out.println("Rose is blossom.");
	}

	@Override
	public void aroma() {
		System.out.println("This is rose aroma.");
		
	}

}
