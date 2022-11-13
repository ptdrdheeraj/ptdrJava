package com.Basic.Oop.constructor;

public class Automobile1 {
	private String colour;
	private int Speed;
	private String make;
	
	public Automobile1 (String colour,String make,int Speed) {
		this.colour = colour;
		this.Speed = Speed;
		this.make = make;
		
	}
    public Automobile1 (String make,String colour) {
    	this.colour = colour;
    	this.make = make;
    }
    public Automobile1 (int Speed) {
    	this.Speed = Speed;
    }
    public void Break(int a) {
    	if(a>20) {
    	a=a-20;
    	System.out.println("Speed is decrease by "+a);}
    	else {
    	a=a-5; 
    	
    	System.out.println("Speed is decrease by "+a);}
    }	
    public void Accelerator(int b) {
    	if(b<240&&b>20) {
    	b=b+20;
    	System.out.println("Speed is increase by "+b);}
        else {
    	b=b+5; 
    	
    	System.out.println("Speed is increase by "+b);}
    }		
    public void ChangeGear(int a) {
       if(a>=180 && a<240) {
    	System.out.println("The car is moving in 5th Gear");}
    
       else if(a>=120 && a<180) {
		System.out.println("The car is moving in 4th Gear");}
       else if(a>=80 && a<120) {
   		System.out.println("The car is moving in 3rd Gear");}
       else if(a>=50 && a<80){  
   		System.out.println("The car is moving in 2nd Gear");}
       else if(a>0 && a<50) {
   		System.out.println("The car is moving in 1st Gear");}
   	   else 
   		System.out.println("The car is nutral");
    
   }
    
	public String getColour() {
		return colour;
	}

	public int getSpeed() {
		return Speed;
	}

	public String getMake() {
		return make;
	}

}
