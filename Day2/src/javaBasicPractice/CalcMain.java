package javaBasicPractice;

public class CalcMain {

	public static void main(String[] args) {
		int money = 10000;
		int price = 3750;		
		
		int charge = money-price;
		System.out.println("총 거스름돈 : " + charge + " 원");
		
		//prepare for advanced solution
		CalcAdv ca = new CalcAdv();
		
		ca.calc(10000, 3750);
		
		
		//Lowest level solution
/*		int c5000 = charge/5000;
		System.out.println("5000원권 : " + c5000 + " 개");
		
		int c1000 = (charge-c5000*5000)/1000;
		System.out.println("1000원권 : " + c1000 + "개" );
		
		int c500 = (charge-((c5000*5000)+(c1000*1000)))/500;
		System.out.println("500원권 : " + c500 + "개");
		
		int c100 = (charge-((c5000*5000)+(c1000*1000)+(c500*500)))/100;
		System.out.println("100원권 : " + c100 + "개");
		
		int c50 = (charge-((c5000*5000)+(c1000*1000)+(c500*500)+(c100*100)))/50;
		System.out.println("50원권 : " + c50 + "개");
		
		int c10 = (charge-((c5000*5000)+(c1000*1000)+(c500*500)+(c100*100)+(c50*50)))/10;
		System.out.println("10원권 : " + c10 + "개");
*/
	
		 
	}
}
