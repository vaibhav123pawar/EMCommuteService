package com.bits.commute.main;

public class Temp {

	public static void main(String[] args) {
		final TempObject t1 = new TempObject();
		t1.a = 10;
		t1.b = 20;
		
		TempObject t2 = t1;
		
		t2.a = 100;
		t2.b = 200;
		
		System.out.println("Temp {a : "+t1.a+", b : "+t1.b+"}");
		System.out.println("Temp 2 { a : "+t2.a+", b : "+t2.b+" }");
	}
}
