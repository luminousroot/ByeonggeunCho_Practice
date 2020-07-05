//	[객체]
//	=> 패키지 생성 : practice06
//	=> 실행용 클래스: practice06.Run.java
//	=> 기능제공용 클래스: practice06.ObjectConstructor.java
//	
//	[생성자를 이용한 객체 복사]
//	=> 실행내용:
//	
//	1) 아래 변수를 갖는 객체 ObjectConstructor 생성
//	1.1) int num1, double num2, char ch;
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

public class ObjectConstructor {

	int num1;
	double num2;
	char ch;
	
	public ObjectConstructor() {}
	
	public ObjectConstructor(int num1, double num2, char ch) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.ch = ch;
	}

	public ObjectConstructor(ObjectConstructor lo) {
		this.num1 = lo.num1;
		this.num2 = lo.num2;
		this.ch = lo.ch;		
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	@Override
	public String toString() {
		return "ObjectConstructor [num1=" + num1 + ", num2=" + num2 + ", ch=" + ch + "]";
	}
}
