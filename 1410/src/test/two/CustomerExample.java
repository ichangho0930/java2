package test.two;

public class CustomerExample {

	public static void main(String[] args) {
		Customer cust1 = new Customer("아메리카노", "010-1234-5678");
		Customer cust2 = new Customer("라떼", "010-2345-6789", 100);
		
		System.out.println(cust1.name + " " + cust1.phone + " " + cust1.point);
		System.out.println(cust2.name + " " + cust2.phone + " " + cust2.point);
		cust2.point = 200;
		System.out.println(cust2.name + " " + cust2.phone + " " + cust2.point);
	}

}
