package practice08;

public class Audio extends Product {

	public Audio() {
		super(300);
	}
	
	@Override
	public String measureSize() {
		return "200 x 200 x 150";
	}

	@Override
	public String toString() {
		return "오디오";
	}
}
