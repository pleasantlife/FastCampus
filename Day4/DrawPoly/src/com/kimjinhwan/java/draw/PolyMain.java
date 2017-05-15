package com.kimjinhwan.java.draw;

public class PolyMain {

	public static void main(String[] args) {

		PolyMain main = new PolyMain();
		// main.drawRect("A", 5);
		// main.drawTri("A", 5);
		//main.reverseTri("A", 5);
		//main.level3("A", 5);
		main.level4("A", 5);
	}
	/*
	 * // 1. 입력받은 문자 한개를 세로 개수를 지정해서 출력하시오 // 'A', 5
	 * 
	 * AAAAAA 
	 * AAAAAA 
	 * AAAAAA 
	 * AAAAAA 
	 * AAAAAA
	 * 
	 * public void drawRect(String mark, int count) {
	 * 
	 * for (int i = 0; i < count; i++) { for (int j = 0; j < count; j++) {
	 * System.out.print(mark); } System.out.println(); }
	 * 
	 * //2. A AA AAA AAAA AAAAA }
	 * 
	 * public void drawTri(String mark, int count) {
	 * 
	 * for (int i = 0; i < count; i++) { for(int j = 0 ; j <= i; i++) {
	 * System.out.print(mark); } System.out.println(); } }
	 * 
	 

	public void reverseTri(String mark, int count) {
		for (int i = count; i > 0; i--) {
			for (int j = 0; j < count; j++) {
				if (j < i - 1) {
					System.out.print(" ");
				} else {
					System.out.print(mark);
				}
			}
			System.out.println("");
		}
	}

	public void level3(String mark, int count) {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= 2 * i; k++) {
				System.out.print(mark);
			}
			System.out.println(" i= " + i);
		}
		System.out.println("");
	}
*/
	public void level4(String mark, int count) {
		for (int i = 0 ; i < count; i++) {
			for (int k = 0; k <= (i*2); k++){
				if(k == i*2){
					System.out.print("3");
				
				}			
			for (int j = 0; j < count - i ; j++) {
				System.out.print(" ");
			}
				//System.out.print(mark);
			}	
			System.out.println(" i = " + i);
		}
		System.out.println("");
	}
}
