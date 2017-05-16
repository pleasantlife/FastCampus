package com.kimjinhwan.java.polymorphism;

public class Son extends Father {
	private int age;
	private String name = "아들";
	
	public void goSchool(){
		System.out.println("학교에 갑니다.");
	}
	
	public void setName(String name){
		super.setName("s"+name);
	}
}
