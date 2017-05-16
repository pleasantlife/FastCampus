package com.kimjinhwan.java.polymorphism;

public class PolyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father son = new Son(); // 상속받은 클래스로 해도 OK!
		son.setName("쥬니어");
		System.out.println(son.getName());
		son.setAge(17);
		System.out.println(son.getAge());
		
		Father daughter = new Daughter();
		System.out.println(daughter.getName());
		
	}

}
