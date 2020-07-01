// [연산자]
// ==> 패키지 생성: practice02
// ==> 실행용 클래스 & 기능제공용 클래스: practice02.Operator.java
//
// [연산자 비교]
// ==> 메소드명: main 메소드 내 작성
// ==> 실행내용:
//
// 1) 사용자로부터 값을 입력받아 성별에 따라 다른 결과 출력
// 2) 남자->영어점수 출력, 여자->수학점수 출력
// 3) printLn() 함수 1번, 삼항연산자 1번만 사용하여 출력
//
// ==> 출력예시
//
// 이름: 아이유
// 남자인가?(true/fals): false
// 영어 성적(정수): 87
// 수학 성적(실수): 91.2
// 이름: 아이유 수학점수: 91.2


package practice02;

public class Operator {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("남자인가?(true/fals): ");
		boolean isMale = sc.nextBoolean();
		
		System.out.print("영어 성적(정수): ");
		int eng = sc.nextInt();
		
		System.out.print("수학 성적(실수): ");
		double math = sc.nextDouble();
	
		System.out.println("이름: " + name + (isMale?" 영어점수: " + eng:" 수학점수: " + math));
	}
}