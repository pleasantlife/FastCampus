package javaBasicPractice;

public class TypeChange {
	
	public static void main(String[] args){
		
		int number = 12345;
		String num = "12345";
		
		//change : character to numberic
		double dbl = Double.parseDouble(num);
		int num_int = Integer.parseInt(num);
		
		//print result
		System.out.println(num_int);
		System.out.println(dbl + number);
	}
	}


