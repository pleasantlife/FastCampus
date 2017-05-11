package com.kimjinhwan.fibonacci;

import java.util.ArrayList;

public class FibonacciMain {

	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();// Fibonacci는 클래스 내의 생성자를 호출한 것임.
		//fibo.process(15);
		
		
		
		
		//int array [] = fibo.process(15);
		
		ArrayList<Integer> array = fibo.process(15);
		
		for(int number : array){
			System.out.println(number);
		}
				
	
		
				
	}
	
}


