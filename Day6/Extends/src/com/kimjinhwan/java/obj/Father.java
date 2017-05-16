package com.kimjinhwan.java.obj;

public class Father extends Fix implements Cook{ // 여기서 접근제한자 public이 지워지면, 다른 패키지에서는 상속받을 수 없다. 인터페이스는 implements로 상속받을 수 있으며, 다중상속 받을 수 있다.
												 // extends로 구현할 기능을 강제해 줌.
												 // 알고리즘 단위의 코드는 추상 클래스로 작성하여 사용한다.
	public String lastname;
	public String name;
	
	public int age;
	public int money;
	public String house;
	public String car;
	public String wife;
	private String help; // private은 상속되지 않으며, 코드블록 안에서만 호출 가능.
	
	public void goDestination(){
		System.out.println("회사에 출근합니다.");
	}

	@Override
	public void boil() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oven() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void steam() {
		// TODO Auto-generated method stub
		
	}
	
	public void process9(){
		
	}

	@Override
	public void disassemble() {
		System.out.println("분해하였습니다.");
		
	}

	@Override
	public void replacePart() {
		// TODO Auto-generated method stub
		System.out.println("교체하였습니다.");
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("청소하였습니다.");
	}

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		System.out.println("조립완료");
	}
}
