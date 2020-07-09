package practice08;

public class Computer extends Product {

	public Computer() {
		super(400);
	}
	
	@Override
	public String measureSize() {
		return "1600 X 900";
	}

	@Override
	public String toString() {
		return "컴퓨터";
	}
}
