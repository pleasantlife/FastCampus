package javaBasicPractice;

public class ForSwitchIf {

	public static void main(String[] args) {
	
	int forSum = 0;
	//for syntax
	for(int i = 0 ; i <= 10000 ; i++){
		forSum += i ;
		}
		System.out.println(forSum);
		
	//if you using 'array', you can use 'enhanced for syntax'
		
	int a = 15;
	int b = 65;	
		
	//switch syntax
	switch(a){
		case 15 :
			System.out.println("a is 15.");
			break;
			case 16 :
			System.out.println("a is 16.");
			break;
			default :
			System.out.println("I don't know what a is.");
		}	
	
	//if syntax
	//Always need compare part when use if
	
		
	if(a < b){
		System.out.println("a is smaller than b.");		
	}else if(a == b){
		System.out.println("a is equal b.");		
	}else{
		System.out.println("a is bigger than b.");
	}
	//question mark is similar to if, colon is similar to else.
		System.out.println(a > b ? true : false);
	}

}
