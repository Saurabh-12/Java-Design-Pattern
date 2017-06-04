package com.sks.adapter.example;

public class FlowerAdapter implements ToyFlower{
	  // You need to implement the interface your
    // client expects to use.
	Flower flower;

	public FlowerAdapter(Flower flower){
		this.flower = flower;
	}
	
	@Override
	public void beautiful() {
		System.out.println("Real Flower Butiful via Adapter");
	}

}
