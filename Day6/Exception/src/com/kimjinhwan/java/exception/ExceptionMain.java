package com.kimjinhwan.java.exception;

public class ExceptionMain {

	public static void main(String[] args) {

		try {
			int array[] = new int[6];

			array[5] = 10;
			array[6] = 11;

			String s = "a";
			int a = Integer.parseInt(s);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			
			System.out.println("시스템이 완료되었습니다.");
		}
	}
}
