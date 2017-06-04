package com.sks.adapter.example;

public class PowerClient {
	
	public static void main(String[] args) {
		
		PowerAdapter adapter = new PowerAdapter();
		System.out.println(adapter.Adapt("Client A ", " Client B"));
		
	}

}
