package javaBasicPractice;

public class CalcArray {
	
	public void calc(int money, int price){
	int[] arrays = {5000, 1000, 500, 100, 50, 10};
	int charge = money - price;
	
	for(int a : arrays){
		charge = printChange(charge, a);
		}
	}
	
	public int printChange(int charge, int unit){
		int number = charge/unit;
		charge = charge - (number * unit);
		System.out.println(unit +"원 권 :" + number + "개");
		return charge;	
	}
}
