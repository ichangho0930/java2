package cote.exam1015;

public class BulgogiPizza extends Pizza {
	public BulgogiPizza() {
		size = "M";
	}
	
	public BulgogiPizza(String size) {
		this.name = "불고기피자";
		this.size = size;
		this.prices = new int[] {11000, 16000, 26000};
		this.toppings = "Bulgogi";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings + "을 추가합니다.");
		super.cook();
	}
}
