package com.kimjinhwan.java.extend.city.hospital;

import com.kimjinhwan.java.extend.city.design.People;

public class Doctor extends People {
	
	Patient pt = new Patient();
	
	public void makeDoc(int n, String name){
		String array[] = new String[n];		
		for(int i = 0 ; i < n; i++){
			array[i] = i+1+"번째 "+name+" ";
		}
		System.out.println("-------"+name+" "+n+"명 생성"+"-------");
		for(int i = 0; i < n; i++){
			System.out.print(array[i]);
		}
		
		System.out.println("");
	}
}
