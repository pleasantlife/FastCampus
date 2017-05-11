package javaBasicPractice;

public class CalcAdv {
	int money = 10000;
	int price = 3750;
	
	
	public void calc(int money, int price){
		
		int charge = money-price;	
		charge = printChange(charge, 5000);
		charge = printChange(charge, 1000);
		charge = printChange(charge, 500);
		charge = printChange(charge, 100);
		charge = printChange(charge, 50);
	}	
	//Make it simple
	public int printChange(int charge, int unit){
		int number = charge/unit;
		charge = charge - (number * unit);
		System.out.println(unit +"원 권 :" + number + "개");
		return charge;
	}
		
		
		
	}
