package com.kimjinhwan.java.string;

public class Word {

	public static void main(String[] args) {
		
		//String을 다룰 수 있는 내장 함수
		
		//1. substring (중요해)
		//글자를 자를 떄 쓴다.
		
		String name = "안녕하세요"; // _안_녕_하_세_요 : 
	    //							0  1  2 3  4
		
		String secondWord = name.substring(1, 2);
		//substring(시작점, 끝점); -> 글자앞뒤로 순번을 매기어 그 사이에 있는 글자를 가져옴. 
		// 예시 : 안녕하세요 에서 요를 가져오려면 substring(4, 5);
		
		System.out.println(secondWord);
		
		//2. Index of
		int 몇번째 = name.indexOf("하세");
		System.out.println(몇번째);
		
		//3. 기타		
		int 문자열길이 = name.length();
		System.out.println(문자열길이);
		
		char 한글자 = name.charAt(0); // String name에 있는 글자의 값을 가져옴.(꽐호 안 숫자는 글자위치)
		System.out.println(한글자);
		
		String 두덩이[] = name.split("하"); // String name에 있는 글자를 쪼개서 보여줌.
		System.out.println(두덩이[0]);
		System.out.println(두덩이[1]);
		
		String 바뀐글 = name.replace("하", "랄라라"); // String name에 있는 글자의 일부 또는 전체를 바꿔줌.
		System.out.println(바뀐글);

	}

}
