package com.kimjinhwan.fibonacci;

import java.util.ArrayList;

public class Fibonacci {
	
	public Fibonacci(){ //생성자 호출(클래스와 이름이 동일). 생성자 호출 시 반환 값 없음. 리턴 타입이 없음.
	
	}
	
	/*반환타입이 없는 함수 구현
	 * public void functionNoReturn(){
	 * }
	 */
	
	/*반환타입이 있는 함수 구현
	 * public int functionWithReturn(){
	 * 	int result = 0;
	 * 
	 *  // TODO
	 *  
	 *  return result;
	 */
	
	/* public int[] process(int n){
				
		int result[] = new int[100]; //반환값 선언
		
		
		//피보나치 수열을 실행하려면 기본적으로 두 개의 값이 제공되어야 함.		
		int a = 0;
		result[0] = a;
		int b = 1;
		result[1] = b;
		
		int result_index = 2;
		
		while( a+b <= n){
			int c = a+b;
			//System.out.println(c);
			result[result_index] = c;
			result_index = result_index+1;
			a = b;
			b = c;			
		}
		
		return result;
		*/
	
	/*
	public void process(int n){
		
		//피보나치 수열을 실행하려면 기본적으로 두 개의 값이 제공되어야 함.
		int a = 0;
		System.out.println(a);
		int b = 1;
		System.out.println(b);
		
		//제공된 두 개의 값을 통해 반복
		//for안에서 증감식을 삭제할 수도 있음. int i=0 같은 초기 값이 없어도 됨.
		//증감이 불규칙한 경우 가급적 for보다는 while을 사용할 것.
		for(int c=a+b ; c <= n ;){
			System.out.println(c);
			c = a+b;
			a = b;
			b = c;
		}
		//while문(권장하는 방식)
		while( a+b <= n){
			int c = a+b;
			System.out.println(c);
			a = b;
			b = c;			
		}
		*/
		
	public ArrayList<Integer> process(int n){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int a = 0;
		result.add(a);
		int b = 1;
		result.add(b);
		
		while( a+b <= n){
			int c = a+b;
			result.add(c);
			a = b;
			b = c;
		}
		return result;
	}
	
}
