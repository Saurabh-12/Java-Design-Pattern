package com.sks.adapter.example;

public class AdapterClientExample {
	
	public static void main(String[] args) {
		//Rose
		Rose mrose = new Rose();
		
		//Marigold
		Marigold marigold = new Marigold();
		
		//Jasmine
		Jasmine mJasmine = new Jasmine();
		
		//Plastic Flower
		PlasticToyFlower plasticFlower = new PlasticToyFlower();
		
		 // Wrap a Flower in a FlowerAdapter so that it 
        // behaves like toy Flower
        ToyFlower toyFlowerAdapter = new FlowerAdapter(mrose);
        
        mrose.blossom();
        mrose.aroma();
        System.out.println(".........");
        marigold.blossom();
        marigold.aroma();
        System.out.println("...........");
        mJasmine.blossom();
        mJasmine.aroma();
        System.out.println("................");
        plasticFlower.beautiful();
        System.out.println("................");
        
        //Flower behaving like a plastic toy flower
        System.out.println("FlowerAdapter...");
        toyFlowerAdapter.beautiful();
        
		
	}

}
