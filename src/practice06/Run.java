//	[객체]
//	=> 패키지 생성 : practice06
//	=> 실행용 클래스: practice06.Run.java
//	=> 기능제공용 클래스: practice06.ObjectConstructor.java
//	
//	[생성자를 이용한 객체 복사]
//	=> 실행내용:
//	
//	1) 생성자를 이용해 아래 변수를 갖는 객체 생성
//	1.1) int num1=10, double num2=20.5, char ch='T';
//  2) 알맞은 생성자를 작성해 출력 예시와 같이 객체 복사 후 출력
//
//	=> 출력 예시
//	> 객체 oc1생성 후 10, 20.5, 'T'를 변수로 저장
//	> 객체 oc1의 필드멤버를 toString() 메소드로 출력
//	ObjectConstructor [num1=10, num2=20.5, ch=T]
//	> 생성자를 이용해 객체 oc1을 복사한 객체 oc2 생성
//	> 객체 oc2의 필드멤버를 toString() 메소드로 출력
//	ObjectConstructor [num1=10, num2=20.5, ch=T]

package practice06;

public class Run {

	public static void main(String[] args) {

		System.out.println("> 객체 oc1생성 후 10, 20.5, 'T'를 변수로 저장");
		ObjectConstructor oc1 = new ObjectConstructor(10, 20.5, 'T');
		
		System.out.println("> 객체 oc1의 필드멤버를 toString() 메소드로 출력");
		System.out.println(oc1.toString());
		
		System.out.println("> 생성자를 이용해 객체 oc1을 복사한 객체 oc2 생성");
		ObjectConstructor oc2 = new ObjectConstructor(oc1);
		
		System.out.println("> 객체 oc2의 필드멤버를 toString() 메소드로 출력");
		System.out.println(oc2.toString());
	}

}
