package com.sks.adapter.example;

public class SocketTypeA {
	
	public static void main(String[] args) {
		
		System.out.println(new SocketTypeA().powerFromSocketA("SocketA"));
	}
	
	public String powerFromSocketA(String socketA) {
		return "Curent Flow from "+socketA;
	}

}
