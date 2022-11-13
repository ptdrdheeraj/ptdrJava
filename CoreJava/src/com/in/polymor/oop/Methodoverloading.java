package com.Basic.Polymor.Oop;

public class Methodoverloading {
	
	
	public  void Add(int a,int b) {//overloading >>method same but parameter diff.
		System.out.println(a+b);
	}
	public  void Add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public  void Add(double a,int b) {
		System.out.println(a+b);
	}
	public  void Add(double a,double b) {
		System.out.println(a+b);
	}
	public  void Add(double a ,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String []args) {
		
		Methodoverloading a = new Methodoverloading();
		a.Add(4.4,5.4);
		a.Add(4.4, 50);
		
		a.Add(2,4,5);
		a.Add(5.8, 5, 6);
		
	}
	

}
