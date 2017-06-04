package com.sks.adapter.example;

public class SocketTypeB {
	
	public static void main(String[] args) {
		
		System.out.println(new SocketTypeB().powerFromSocketB("SocketB"));
	}

	public String powerFromSocketB(String socketB) {
		return "Curent Flow from "+socketB;
	}
}
