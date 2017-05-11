package javaBasicPractice;

public class Add1to100 {

	public static void main(String[] args) {
		
		//Add 1 to 100
		//Solution 1
		int sum = 0;
		
		for(int i = 0 ; i <= 100; i++){
			sum += i;
		}
		//print result of Solution 1
		System.out.println(sum);
		
		//Solution 2 (Enhanced algorithm)
		int n = 100;
		int m = n/2;
		
		//print result of Solution 2
		System.out.println((n+1)*m);
		
		
	}
	}


