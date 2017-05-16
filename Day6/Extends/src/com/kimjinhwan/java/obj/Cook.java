package com.kimjinhwan.java.obj;

public interface Cook { //인터페이스의 카테고리. 인터페이스에 정의된 기능은 상속받는 순간 반드시 구현해야 한다. 기능만 정의할 수 있음. 객체지향 설계를 위한 가장 중요한 도구.

	
	public abstract void boil();
	public void grill();			//인터페이스에서는 abstract 추상 예약어를 생략할 수 있다.
	public void fry();
	public void oven();
	public void steam();
}
