package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor: int int");
	}
	
	public Addition(double a, double b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor: double double");
	}
	
	public Addition(String a, String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor: string string");
	}
	
	public void add() {
		int sum=this.a+this.b;
		System.out.println("Value of a: "+a+"\n"+"Value of B: "+b+"\n"+"Sum is: "+sum);
	}
}