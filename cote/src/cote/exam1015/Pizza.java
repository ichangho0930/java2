package cote.exam1015;

public abstract class Pizza {
	public String name;
	public int[] prices;
	public String size;
	public String toppings;
	
	/*public Pizza() {}
	public Pizza(String name, int[] prices, String size, String toppings) {
		this.name = name;
		this.prices = prices;
		this.size = size;
		this.toppings = toppings;
	}*/
	
	public void cook() {
		System.out.println(name + size + "을 조리합니다.");
		System.out.println(name + size + "이 완성되었습니다.");
	}
	
	public void serve() {
		int price;
		switch(size) {
			case "S": price = prices[0]; break;
			case "M": price = prices[1]; break;
			default: price = prices [2];
		}
		System.out.println(name + size + "입니다. 가격:" + price);
	}
}