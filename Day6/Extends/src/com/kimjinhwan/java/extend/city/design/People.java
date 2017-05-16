package com.kimjinhwan.java.extend.city.design;

public class People {
	
	private String gender;
	private int age;
	private String skinColor;
	private String hairColor;
	private int height;
	private int weight;
	private String name;
	
	public void move(String direction){
		System.out.println(direction + "방향으로 움직인다.");
	}

	public String getName(){		//getter 생성
		return name;
	}
	
	public void setName(String value){		//setter 생성
		name = value;
	}
	
	public void setArray(){
		
				
	}
}
