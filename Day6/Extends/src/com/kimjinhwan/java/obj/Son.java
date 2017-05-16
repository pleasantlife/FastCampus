package com.kimjinhwan.java.obj;

public class Son extends Father { 
	//extends Father를 하는 순간 Father의 속성이 그대로 생겨남.
	//public String lastname;
	//public String name;
	
	//public int age;
	//public int money;
	//public String house;
	//public String car;
	//public String wife;
	
	public String wife;
	public String girlfriend;
	
	//@override
	public void process9(){
		
	}
	
	/* 오버라이딩
	public void process9(int aaa){
		
	}
	
	public void process9(String a){
		
	}
	
	public void process(int a, String b){
		
	}
	*/
	
	@Override
	public void goDestination() {
		// TODO Auto-generated method stub
		//super.goDestination(); //super는 부모를 호출함.
		
		super.process9(); // 부모의 것 호출.
		process9(); //나의 것 호출.
		System.out.print("PC방에 갑니다.");
	}
	
}
