package com.java.eightversion;

public interface InterfaceA {

	public void funA();

	public default void funB(){
		System.out.println("funB of InterfaceA");
	}
	
	static void show(){
		System.err.println("static method");
	}
	
}
