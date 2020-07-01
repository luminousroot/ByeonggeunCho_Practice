// [연산자, 제어문]
// ==> 패키지 생성: practice03
// ==> 실행용 클래스 & 기능제공용 클래스: practice03.ControlStatement.java
//
// [이진탐색]
// ==> 메소드명: main 메소드 내 작성
// ==> 실행내용:
//
// 1) 1~100 사이의 정수를 사용자로부터 입력받아 탐색을 통해 그 수를 맞춘다.
// 2) 아래 출력과 같이 입력받은 값과 중간값을 비교하며 예측값의 범위를 좁혀간다.
//
// ==> 출력예시:
//
// 1~100 사이의 수 입력: 24
// 1회차 예측값: 50
// 2회차 예측값: 25
// 3회차 예측값: 13
// 4회차 예측값: 19
// 5회차 예측값: 22
// 6회차 예측값: 23
// 최종 예측값: 24

package practice03;

public class ControlStatement {
	// 제어문과 반복문을 이용해 이진탐색

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int MAX = 100;
		int num;
		int low = 1;
		int high = MAX;
		int mid = 0;
		int cnt = 0;

		System.out.print("1~100 사이의 수 입력: ");
		num = sc.nextInt();

		while (low <= high) {		// 더이상 범위를 좁힐 수 없을 때까지 반복
			
			mid = (low + high)/2;	// 범위의 절반값
			
			if(num == mid) {
				cnt++;
				break;				// 맞출 시 반복문 탈출
			}else if(num >= mid) {
				low = mid;			// 최소범위를 절반값으로 상향이동
			} else {
				high = mid;			// 최대범위를 절반값으로 하향이동
			}
			
			cnt++;
			System.out.println(cnt + "회차 예측값: " + mid);
		}
		System.out.println("최종 예측값: " + mid);
	}
}
