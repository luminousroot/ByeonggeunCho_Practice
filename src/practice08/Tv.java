package practice08;

public class Tv extends Product {
	
	public Tv () {
		super(600);
	}
	
	@Override
	public String measureSize() {
		return "50인치";
	}

	@Override
	public String toString() {
		return "텔레비전";
	}
}
