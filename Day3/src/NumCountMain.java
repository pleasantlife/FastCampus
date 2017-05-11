package com.kimjinhwan.java.numbercount;

public class NumCountMain {

	public static void main(String[] args) {
		// 		
		NumCountMain main = new NumCountMain();
		System.out.println("10,000까지 8의 개수는 = " + main.count(10000,8));
	}
	
	public int count(int limit, int target){ //메소드 생성.
		int result = 0;
		String unit = target + ""; // 문자 8이 이미 입력되어 있음.
		
		for(int i = 0; i <=limit ; i++){ // 만약 1828번 째 라면?
			String temp = i + "";
			String array[] = temp.split(""); // split 후 ""사이에 공백을 두면 한글자단위로 분해해서 배열로 반환함.
			//위 구문을 실행하고 나면 array[] = {1,8,2,8}이 된 상황.
			for(String item : array){
				if(item.equals(unit)){
					result = result + 1;
				}
			}
			
			/*길게 하는 방법
			String temp = i + ""; // "1828"로 바뀜.
			
			int temp_length = temp.length(); //길이는 4
			
			for(int j= 0 ; j < temp_length; j++){ //반복문은 총 네바퀴를 돕니다.
				
				String one = temp.charAt(j) + ""; // j = 0일 경우 one = "1"
												  // j = 1일 경우 one = "8"
 				if( unit.equals(one) ){ // unit과 one을 비교. 모든 객체는 equals로 비교.
					result = result + 1;
					
				}
			}
			*/
		}
		return result;
	}
}