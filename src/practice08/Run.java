//.원본출처: https://developer-ek.tistory.com/13
//.출처 내용 참조 및 변형하여 문제 작성
//
//[상속&다형성]
//=> 패키지 생성 : practice08
//=> 실행용 클래스: practice08.Run.java
//=> 기능제공용 클래스: practice08.Buyer.java
//				practice08.Product.java
//				practice08.Audio.java
//				practice08.Computer.java
//				practice08.Tv.java
//
//=> 실행내용:
//Run // 실행용 클래스
//- Buyer 객체 생성
//- Audio, Computer, Tv 객체 생성 후 구매 (구매내역은 예시 참조)
//- 구매 완료 후 구매목록, 구매금액, 남은금액 출력
//
//Buyer // 구매자
//-money:int	// 보유금액
//-cnt:int	// 저장된 제품 수
//-cart:Product[]	// 물품 저장 카트
//+buy():void		// 구매 메소드
//	1. 잔액 부족 시 "잔액이 부족하여 ...을 살 수 없습니다" 출력
//	2. ... 위치에는 객체.toString()으로 객체 이름 반환
//	3. 잔액 충족 시 보유금액에서 제품 가격 차감
//+add():void		// 카트에 물품 저장
//	1. 카트 용량 부족 시 기존 용량*2로 새로운 카트 생성하여 기존 카트의 물건 복사, 붙여넣기
//	2. 카트 용량 충족 시 저장된 제품 수 증가
//	3. 카트에 제품 저장
//+summary():void	// 구입내역 출력
//	1. instanceof 연산자를 이용해 구입한 물건에 따라 서로 다른 내용의 measureSize() 출력
//	2. 현재까지 구매목록 출력
//	3. 총 구매금액 출력
//	4. 남은 금액 출력
//
//Product <<abstract>>
//-price: int		// 제품가격
//+measureSize(): String {abstract}	// 제품 사이즈 특성
//+toString():String	// 제품명 반환
//
//Audio (Product 상속)
//+Audio()	// 가격(300) 설정
//+measureSize()	// 제품 사이즈 특성(200 x 200 x 150) 설정
//+toString()		// 제품명(오디오) 설정
//
//Computer (Product 상속)
//+Computer()	// 가격(400) 설정
//+measureSize()	// 제품 사이즈 특성(1600 x 900) 설정
//+toString()		// 제품명(컴퓨터) 설정
//
//Audio (Product 상속)
//+Tv()		// 가격(600) 설정
//+measureSize()	// 제품 사이즈 특성(50인치) 설정
//+toString()		// 제품명(텔레비전) 설정
//
//  => 구매시도 내역 예시
//  	Tv Computer Tv Audio Computer Computer Computer Audio
//=> 출력 예시
//잔액이 부족하여 컴퓨터을(를) 살 수 없습니다.
//잔액이 부족하여 컴퓨터을(를) 살 수 없습니다.
//잔액이 부족하여 컴퓨터을(를) 살 수 없습니다.
//잔액이 부족하여 오디오을(를) 살 수 없습니다.
//========================================
//구입한 물건
//========================================
//텔레비전
//화면크기: 50인치
//
//컴퓨터
//해상도: 1600 X 900
//
//텔레비전
//화면크기: 50인치
//
//오디오
//가로 x 세로 x 높이 : 200 x 200 x 150
//
//========================================
//구매목록: 텔레비전 컴퓨터 텔레비전 오디오 
//========================================
//총 구매금액: 1900
//남은 금액: 100


  	
  	package practice08;

public class Run {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}

}
