package com.kimjinhwan.java.collection;

import java.util.ArrayList;
import java.util.HashMap;

import com.kimjinhwan.java.collection.dummy.Student;

public class CollectionMain {

	public static void main(String[] args) {
		
		// 1. List 계열
		// 내부적으로 값이 입력되면 값과 함께 순서가 저장된다.		
		// .add(값) : 값을 입력
		// .get(순서) : 값을 출력		
		
		// 제네릭이 왜 중요한지 사례를 통해 확인해보자.
		ArrayList<Student> list = new ArrayList<>(); //Student 클래스만 들어올 수 있음.
		
		Student a1 = new Student();
		a1.name = "홍길동";
		a1.age = 500;
		
		Student a2 = new Student();
		a2.name = "이순신";
		a2.age = 1000;
		
		list.add(a1);
		list.add(a2);
		
		for( Student people : list){
			System.out.println(people.name+people.age);
		}
		//제네릭이 빠지면?(ArrayList list = new ArrayList();)
		/* for(Object people : list){
		 * 	String stu = (Student) people;
		 *  System.out.println(stu.name + std.age)
		 */
		
		//위 코드에서 제네릭이 빠지는 순간 매우 불편해집니다.
		//(향상된 for문 사용 불가. for문 내에서 Student를 Object로 변경.)
		
		
		//ArrayList 생성자
		/*ArrayList<Integer> list = new ArrayList<>();
		int a = 33;
		
		list.add(457); //기본형과 객체형간의 전환이 자동으로 이루어짐. 괄호안은 객체가 됨.
		list.add(1234); // 제네릭을 사용하지 않는 컬렉션은 입력되는 값을 Object로 Casting 한다. 
		*/
		// list.add("안녕하세요"); // ArrayLIst<Integer> list = new ArrayList<>(); 로 적용하면 에러가 난다.
		// list.add("abcde"); // ArrayLIst<Integer> list = new ArrayList<>(); 로 적용하면 에러가 난다.
		
		/*스트링 첫 번째 글자 출력하기
		System.out.println("안녕하세요".substring(0, 1)); //string.substring
		*/
		
		//일반 for문을 쓸 때
		/*
		int list_length = list.size(); //list의 개수 알아내기
		
		for(int i = 0; i < list_length ; i++){//배열, 클래스 계열은 index가 0부터 시작함.
		 System.out.println(list.get(i)); //list.get 으로 i번째에 있는 값을 알아냄.
		}
		*/
		
		//향상된 for문을 쓸 때 (훨씬 많이 씀)
		/*
		for( Object item : list ){ // 제네릭이 적용되지 않은 콜렉션이므로 'Object'를 통해 추출함.
			System.out.println(item);
		}
		*/
		 
		//향상된 for문에서 스트링 첫 번째 글자 출력하기
		/*
		for (Object item : list){
			String string = item + "";
			System.out.println(string.substring(0, 1));
		}
		*/
		
		//향상된 for문에서 변환하기
		/*
		for (Object item : list){
			String string = item + "";
			int number = Integer.parseInt(string);
			System.out.println(string.substring(0, 1));
		}
		*/
		
		//향상된 for문에서 제네릭을 지정했을 때(integer)
		/*for (int item : list){
			System.out.println(item + 3);
		}
		*/
		
		
		// 2. Map 계열
		// 키 : 값, 키 : 값의 형태로 저장된다.
		// 개인정보 등에서 사용합니다.
		HashMap<String,String> map = new HashMap<>(); 
		// Map도 import 해줘야 함. 제약 안하면 object로. 키와 값의 제네릭은 달라도 됨.
		map.put("key1", "홍길동");
		map.put("key2", "이순신");
		
		System.out.println(map.get("key1"));
		
		//순차적으로 접근해서 가져올 수는 없음.
		
		// 3. Set 계열
		// 리스트와 동작 방식이 유사하나, 중복값을 허용하지 않는다.
		
		
	}

}
