//	[2차원 배열]
//	=> 패키지 생성 : practice05
//	=> 실행용 클래스 & 기능제공용 클래스: practice05.matrix.java
//	
//	[규칙성 찾기]
//	=> 실행내용:
//	
//	1) 10 x 10 행렬 선언
//  2) 중첩 반복문만을 이용하여 아래와 같이 초기화	
//
//	=> 출력 예시
//	0	1	2	3	4	5	6	7	8	9	
//	1	2	3	4	5	6	7	8	9	10	
//	2	3	4	5	6	7	8	9	10	11	
//	3	4	5	6	7	8	9	10	11	12	
//	4	5	6	7	8	9	10	11	12	13	
//	5	6	7	8	9	10	11	12	13	14	
//	6	7	8	9	10	11	12	13	14	15	
//	7	8	9	10	11	12	13	14	15	16	
//	8	9	10	11	12	13	14	15	16	17	
//	9	10	11	12	13	14	15	16	17	18	

package practice05;

public class Matrix {
	public static void main(String[] args) {
		
		int[][] matrix1 = new int[10][10];

		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix1[i].length; j++) {
				matrix1[i][j] = (i+j);		// 대칭성 부여
			}
		}
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + "\t");
			}
			System.out.println();
		}
	}
}



















