 package practice09;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Lotto {

	public int[] makeLotto1() {
		int[] lotto = new int[6];

		// 첫 번째 값은 중복될 가능성이 없음
//		lotto[0] = ((int) (Math.random() * 45)) + 1;
//		
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				
				System.out.print("i: " + i + "   lotto[i]: " + lotto[i]);
				System.out.println("    j: " + j + "   lotto[j]: " + lotto[j]);
				
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		// 오름차순 정렬
		for(int i=1; i<lotto.length; i++) {
			for(int j=0; j<i; j++) {
				if(lotto[i] < lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		return lotto;
	}

	public int[] makeLotto2() {
		int[] lotto = new int[6];
		
		LinkedHashSet<Integer> sLotto = new LinkedHashSet<Integer>();
		
		// 1~45 사이 임의의 숫자 6개 저장
		while(sLotto.size()<6) {
			sLotto.add( (int)(Math.random() * 45) + 1 );
		}

		// Collections.sort() 메소드를 사용하기 위해서는 List 형식으로 저장되어야 하므로
		// sLotto를 LinkedList로 변환한 뒤 메소드 실행
		LinkedList lList = new LinkedList(sLotto);
		
		// 오름차순 정렬 메소드
		Collections.sort(lList);

		for(int i=0; i<lList.size(); i++) {
			lotto[i] = (int)lList.get(i);
		}
		
		return lotto;
	}

	public void showLotto(int[] lotto) {

		System.out.println("이번주 행운의 번호는?");
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "  ");
		}

		System.out.println("입니다!");
		System.out.println("행운을 빕니다!");
		System.out.println();
	}
}
