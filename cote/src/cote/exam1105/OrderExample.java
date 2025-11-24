package cote.exam1105;

import java.util.Scanner;

public class OrderExample {

	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		menus[0] = new Menu("아메리카노", 3000);
		menus[1] = new Menu("카페라떼", 4000);
		menus[2] = new Menu("카푸치노", 4000);
		
		Scanner sc = new Scanner(System.in);
		int menuIndex = sc.nextInt();
		int quantity = sc.nextInt();
		sc.close();
		
		if (menuIndex >= 0 && menuIndex < menus.length && quantity > 0) {
			OrderItem o = new OrderItem(menus[menuIndex], quantity);
			System.out.println(o.getPrice());
		}
	}
}