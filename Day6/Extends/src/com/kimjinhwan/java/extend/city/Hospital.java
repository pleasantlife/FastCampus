package com.kimjinhwan.java.extend.city;

import com.kimjinhwan.java.extend.city.design.Building;

public class Hospital extends Building{
	int doctor;
	int nurs;
	int bed;
	public int door = 5;
	String color = "흰색";
	String floor = "10층";
	int size = 15000;
	
	public int getDoor(){
		return door;
	}
	
	public String getColor(){
		return color;
	}
	
	public String getFloor(){
		return floor;
	}
	
	public int getSize(){
		return size;
	}
}
