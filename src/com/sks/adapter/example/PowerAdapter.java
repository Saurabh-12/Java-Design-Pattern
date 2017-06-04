package com.sks.adapter.example;

public class PowerAdapter extends SocketTypeB{

	public String Adapt(String typeA, String typeB) {
		//some conversion logic
		String adaptA = typeA;
		String adaptB = typeB;
	
		
		return powerFromSocketB("Adapter: "+adaptA+adaptB);
	}
}
