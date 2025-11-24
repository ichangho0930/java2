package test.two;

public class Customer {
	public String name;
	public String phone;
	public int point;
	
	public Customer(String name, String phone) {
		this.name = name;
		this.phone = phone;
		point = 0;
		updatePoint(50);
	}
	public Customer(String name, String phone, int point) {
		this.name = name;
		this.phone = phone;
		this.point = point;
		updatePoint(-50);
	}
	public void updatePoint(int amount) {
		point += amount;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}