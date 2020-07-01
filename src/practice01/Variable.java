/*
 * [변수]
 * ==> 패키지: practice01
 * ==> 실행용 클래스 & 기능제공용 클래스: practice01.Variable.java
 * 
 * [변수출력]
 * ==> 메소드명: main메소드 내 작성
 * ==> 실행내용:
 * 
 * 1) 출력 예시 참조하여 모든 변수명 선언
 * 2) 출력 예시 참조하여 초기화 후 출력
 * 3) result 변수 별도 선언하여 사용
 * 
 * ==> 출력예시:
 * 
 * bv : true
 * byte bnum: 10
 * short snum: 20
 * int inum: 30
 * long lnum: 40
 * float fnum: 50.0
 * double dnum:60.0
 * char ch: a
 * String str: Hello
 * bnum + snum = result: 30
 */



package practice01;

public class Variable {

	public static void main(String[] args) {
		boolean bv = true;
		
		byte bnum = 10;
		short snum = 20;
		int inum = 30;
		long lnum = 40L;
		// 정수형 기본 데이터형은 int이므로 초기화 시 데이터형을 표현하는 L을 붙여준다
		
		float fnum = 50.0f;
		// 정수형 기본 데이터형은 int이므로 초기화 시 데이터형을 표현하는 f를 붙여준다
		double dnum = 60.0;
		
		char ch = 'a';
		
		String str = "Hello";
		
		int result = bnum + snum;
		// byte 타입과 short 타입은 정수형 기본자료형인 int로 자동 형변환 후 연산된다.
		
		System.out.println("bv : " + bv);
		System.out.println("byte bnum: " + bnum);
		System.out.println("short snum: " + snum);
		System.out.println("int inum: " + inum);
		System.out.println("long lnum: " + lnum);
		System.out.println("float fnum: " + fnum);
		System.out.println("double dnum:" + dnum);
		System.out.println("char ch: " + ch);
		System.out.println("String str: " + str);
		
		System.out.println("bnum + snum = result: " + result);
	}
}