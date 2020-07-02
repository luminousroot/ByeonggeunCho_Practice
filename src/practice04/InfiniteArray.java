//	[배열]
//	=> 패키지 생성 : practice04
//	=> 실행용 클래스 & 기능제공용 클래스: practice04.InfiniteArray.java
//	
//	[무한의 방_방 늘리기]
//	=> 실행내용:
//	
//	1) 크기 10의 배열1 선언 후 1~10으로 초기화
//	2) 크기가 2배인 배열2 선언 후 배열1을 이용해 아래 출력 예시와 같이 초기화
//	3) 사용되는 변수:
//		int[] arr1, int[] arr2, int i
//		총 3개로 제한됨
//	
//	=> 출력 예시
//	arr1: 1 2 3 4 5 6 7 8 9 10 
//	arr2: 1 0 2 5 3 10 4 15 5 20 6 25 7 30 8 35 9 40 10 45 








package practice04;

public class InfiniteArray {

	public static void main(String[] args) {

		int[] arr1 = new int[10];
		int[] arr2 = new int[20];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}

		System.out.print("arr1: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		for (int i = 0; i < (arr2.length / 2); i++) {
			arr2[i * 2] = arr1[i];		// arr1의 index에 있는 값을 index*2로 이동
			arr2[(i * 2) + 1] = 5 * i;	// 나머지 자리는 index * 3으로 채워넣음
		}

		System.out.println();

		System.out.print("arr2: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
