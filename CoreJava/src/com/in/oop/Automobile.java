package com.Basic.Oop;

public class Automobile {
	private String colour;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 5;
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void Break(String Break) {
		 if(getSpeed()>0) {
	setSpeed(getSpeed()- 20);}	
	}
	public void accelerator(String accelerator) {
		if(getSpeed()<220) {
	setSpeed (getSpeed() + 20);	}
	}
    public void changeGear(int changeGear) {
    	if(getSpeed()<40 && getSpeed()>0) {
    setSpeed(getSpeed());
    System.out.println("1st Gear");
    }
    	
    else if (getSpeed()<80 && getSpeed()>=40) {
    setSpeed(getSpeed());
    System.out.println("2nd Gear");
    }
    	
    else if (getSpeed()<140 && getSpeed()>=80) {
    setSpeed(getSpeed());
    System.out.println("3rd Gear");
    }
    	
    else if (getSpeed()>140 && getSpeed()<220) {
    setSpeed(getSpeed());
    System.out.println("4th Gear");
    }
    	
    else {
    setSpeed(getSpeed());
    System.out.println("Neutral");
    }	
    	
    }
    
	
	
	
}
