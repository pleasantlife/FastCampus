package com.kimjinhwan.java.obj;

public abstract class Fix {
	//추상 클래스(abstract)의 특징
	//1. 인터페이스와 동일하나
	//2. 인터페이스 + 코드
	
	public void process(){
		disassemble();
		for (int i = 0 ; i<3; i++){
		replacePart(); // 항상 세 번씩 교체
		}
		runLogic();
		clean();
		assemble();
	}
	
	private void runLogic(){  //바뀌면 안되고, 내부적으로만 써야하는 로직의 경우 접근제한자를 private으로 설정.
		
	}
	
	public abstract void disassemble();
	
	public abstract void replacePart();
	
	public abstract void clean();
	
	public abstract void assemble();
	
}

