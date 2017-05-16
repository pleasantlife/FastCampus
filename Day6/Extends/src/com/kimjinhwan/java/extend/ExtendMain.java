package com.kimjinhwan.java.extend;

import com.kimjinhwan.java.extend.city.Hospital;
import com.kimjinhwan.java.extend.city.Police;
import com.kimjinhwan.java.extend.city.design.Building;
import com.kimjinhwan.java.extend.city.hospital.Doctor;
import com.kimjinhwan.java.extend.city.hospital.Nurs;
import com.kimjinhwan.java.extend.city.hospital.Patient;
import com.kimjinhwan.java.obj.Father;
import com.kimjinhwan.java.obj.Son;

public class ExtendMain {

	public static void main(String[] args) {
		// 1.병원을 하나 만든다.

		// 2.의사 3명, 간호사 6명, 환자 21명을 만든다.

		// 3. 간호사 6명은 각각 다른 방향으로 한번씩 움직인다.

		// 3. 각 의사가 환자를 7명씩 진찰하는 프로그램을 작성하세요.

		Hospital hospital = new Hospital();
		Patient patient = new Patient();
		Doctor doctor = new Doctor();
		Nurs nurse = new Nurs();

		// 병원 만들기
		System.out.println("-------병원 건물 속성-------");
		System.out.println("병원 출입문 수 : " + hospital.getDoor());
		System.out.println("병원 외부 색상 : " + hospital.getColor());
		System.out.println("병원 층 수 : " + hospital.getFloor());
		System.out.println("병원 면적 : " + hospital.getSize());
		System.out.println("");

		// 의사 생성
		doctor.makeDoc(3, "의사");
		System.out.println("");
		// 간호사 생성
		nurse.makeNurs(6, "간호사");
		System.out.println("");
		// 환자 생성
		patient.makePati(21, "환자");
		System.out.println("");

		// 간호사 생성확인
		System.out.println("");

		/*
		 * 기본 연습 Police police = new Police(); police.color = "파란색";
		 * police.floor = "2F";
		 * 
		 * Father fa = new Father(); fa.process();
		 * 
		 * fa.lastname = "조던"; fa.name = "마이클"; fa.car = "람보르기니"; fa.money =
		 * 1000000000;
		 * 
		 * Son son = new Son();
		 * 
		 * son.lastname = "조던"; son.name = "조던"; son.car = "머스탱"; son.money = 0;
		 * son.wife = "박신혜"; son.girlfriend = "박신혜";
		 * 
		 * son.goDestination();
		 */

	}

	public void process9() {

	}

	public void goDestination() {
		process9();

		System.out.println("9줄의 결과");
	}

}
