package practice08;

public abstract class Product {
	private int price;	// 제품 가격
	
	public Product() {}
	
	public Product(int price) {
		this.price = price;
	}
	
	public abstract String measureSize();

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}
}
