package cote.exam1015;

public class PepperoniPizza extends Pizza {	
	public PepperoniPizza() {
		size = "M";
	}
	public PepperoniPizza(String size) {
		this.name = "페퍼로니파자";
		this.size = size;
		this.prices = new int[] {12000, 17000, 27000};
		this.toppings = "pepperoni";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings + "을 추가합니다.");
		super.cook();
	}
}