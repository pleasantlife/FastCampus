package com.kimjinhwan.java.array;

public class ArrayMain {

	public static void main(String[] args) {
		
		// 배열(array) 만드는 방법
		int arr[] = new int[10];
		
		int arr2[] = {1,2,3,4,5};
		
		for(int a1 : arr){
			System.out.println(a1);
		}	
		for(int a2 : arr2){
			System.out.println(a2);
		}
		
		//다른 클래스에 배열 만들기
		ArraySub subs[] = new ArraySub[10]; // 10칸짜리 공간만 만들어둠
		
		//20번째줄을 풀어서 쓰면?
		subs[0] = new ArraySub(); // 한 번 할때마다 한 칸 씩 생김.
		subs[1] = new ArraySub();
		subs[2] = new ArraySub();
		subs[3] = new ArraySub();
		subs[4] = new ArraySub();
		subs[5] = new ArraySub();
		subs[6] = new ArraySub();
		subs[7] = new ArraySub();
		subs[8] = new ArraySub();
		subs[9] = new ArraySub();
				
		
		for (ArraySub sub : subs){
			System.out.println(sub.a);
		}
		
		}
	}


