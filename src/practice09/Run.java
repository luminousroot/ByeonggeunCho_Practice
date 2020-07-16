//[컬렉션&제네릭스]
//=> 패키지 생성 : practice09
//=> 실행용 클래스: practice09.Run.java
//=> 기능제공용 클래스: practice09.Lotto.java
//
//=> 실행내용:
//1) Lotto.makeLotto1()
//	 : 배열을 이용해 1~45에서 중복되지 않는 로또번호 6개를 선택하여 int[6] 배열에 저장.
//
//2) Lotto.makeLotto2()
//   : LinkedHashSet / LinkedList를 이용해 1~45에서
//	       중복되지 않는 로또번호 6개를 선택하여 int[6] 배열에 저장.
//	   Collections.sort() API에서 검색하여 이용.
//
//3) Lotto.showLotto()
//	 : int[6]배열을 전달받아 선택된 로또번호 출력.
//
//4) 모든 번호는 오름차순으로 정렬.
//
//5) 제네릭스 이용하여 로또번호는 int 형식으로 출력 될 수 있도록 제한한다.
// 
//=> 출력 예시
//이번주 행운의 번호는?
//4  10  21  25  32  38  입니다!
//행운을 빕니다!
//
//이번주 행운의 번호는?
//2  11  15  18  23  30  입니다!
//행운을 빕니다!



package practice09;

public class Run {

	public static void main(String[] args) {
		Lotto l = new Lotto();
		l.showLotto(l.makeLotto1());
		l.showLotto(l.makeLotto2());
	}

}
