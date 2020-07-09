package practice08;

public class Buyer {
	private int money = 2000;		// 잔액
	private int cnt = 0;			// 저장된 제품 수
	
	private Product[] cart = new Product[3];	// 물품 저장 카트
	
	public void buy(Product p) {
		if(money < p.getPrice()) {
			System.out.println("잔액이 부족하여 " + p.toString() + "을(를) 살 수 없습니다.");
			return;
		} else {
			money -= p.getPrice();
			this.add(p);
		}
	}
	
	public void add(Product p) {
		Product[] newCart = null;
		
		if(cnt >= cart.length) {
			newCart = new Product[cart.length*2];
			
			for(int i=0; i<cart.length; i++) {
				newCart[i] = cart[i];
			}
			cart = newCart;
		}
		cart[cnt++] = p;
	}
	
	public void summary() {
		int sum=0;
		String buyList = "";
		System.out.println("========================================");
		System.out.println("구입한 물건");
		System.out.println("========================================");
		
		for(int i=0; i<cnt; i++) {
			buyList += cart[i].toString() + " ";
			System.out.println(cart[i].toString());
			
			if(cart[i] instanceof Audio) {
				System.out.println("가로 x 세로 x 높이 : " + cart[i].measureSize());
			} else if(cart[i] instanceof Tv) {
				System.out.println("화면크기: " + cart[i].measureSize());
			} else if(cart[i] instanceof Computer) {
				System.out.println("해상도: " + cart[i].measureSize());
			}
			System.out.println();
			sum += cart[i].getPrice();
		}
		
		System.out.println("========================================");
		System.out.println("구매목록: " + buyList);
		System.out.println("========================================");
		System.out.println("총 구매금액: " + sum);
		System.out.println("남은 금액: " + money);
	}
}


















