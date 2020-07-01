//	[연산자, if문, for문 연습문제]
//	=> 패키지 생성 : practice03
//	=> 실행용 클래스 & 기능제공용 클래스: practice03.Game369.java
//	
//	[369게임 출력 프로그램]
//	=> 실행내용:
//	
//	1) 1~100 사이 게임 진행 횟수 입력
//	2) 1의 자리가 3,6,9 일때 "짝" 출력
//	3) 10의 자리가 3,6,9 일때 "짝" 출력 (2번과 중복 가능)
//	    예) 33 -> "짝짝" 출력
//	4) 10 단위마다 줄 넘김
//	5) 출력 시 "\t"를 사용해서 아래와 같이 글자 간격 조정
//	
//	
//	=> 출력 예시
//	게임 진행 횟수 입력: 71
//	1	2	짝	4	5	짝	7	8	짝	10	
//	11	12	짝	14	15	짝	17	18	짝	20	
//	21	22	짝	24	25	짝	27	28	짝	짝	
//	짝	짝	짝짝	짝	짝	짝짝	짝	짝	짝짝	40	
//	41	42	짝	44	45	짝	47	48	짝	50	
//	51	52	짝	54	55	짝	57	58	짝	짝	
//	짝	짝	짝짝	짝	짝	짝짝	짝	짝	짝짝	70	
//	71


package practice03;

import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		// 369 게임 출력
		// 입력: 1~100 사이 진행 횟수
		// 출력: 진행된 내용 출력

		int num;
		int check = 0;	// 3,6,9의 조건에 해당여부 기록

		Scanner sc = new Scanner(System.in);
		System.out.print("게임 진행 횟수 입력: ");
		num = sc.nextInt();

		// 1의 자리와 10의 자리 독립적으로 확인
		for (int i = 1; i <= num; i++) {
			if(i%10 != 0 && (i % 10) % 3 ==0) {		// 10의 자리가 3,6,9일 때
				System.out.print("짝");
				check++;
			}

			if(i > 10 && (i / 10) % 3 == 0) {		// 1의 자리가 3,6,9일 때
				System.out.print("짝");
				check++;
			}
			
			if(check == 0) {						// 위 경우가 아닐 때
				System.out.print(i);
			}
			
			System.out.print("\t");					// 숫자 간격 유지

			if (i >= 10 && i % 10 == 0) {
				System.out.println();
			}
			
			check = 0;		// 초기화
		}
	}
}
