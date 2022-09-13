package com.Basic.java;

public class BusGear {
	public static void main(String[]args) {
		
		int speed = 0;
		if(speed >=80 && speed<220) {
		System.out.println("The bus is moving in,  5th Gear");}
		else if(speed >=60 && speed < 80 ) {
		System.out.println("The bus is moving in,  4th Gear");}
		else if(speed >=40 && speed < 60) {
		System.out.println("The bus is moving in,  3rd Gear");}
		else if(speed >=20 && speed < 40) {
		System.out.println("The bus is moving in,  2nd Gear");}
		else if(speed>0 && speed < 20)
		{System.out.println("The bus is moving in, 1st Gear");
		}else if(speed == 0)
		{System.out.println("nutral");}
		else{System.out.println("The number is invalid");}
		
		
		
		
		
		
		
		}

}
