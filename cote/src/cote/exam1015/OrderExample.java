package cote.exam1015;

import java.util.Scanner;

import java.util.Scanner;

public class OrderExample {

	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		menus[0] = new Menu("아메리카노", 3000);
		menus[1] = new Menu("카페라떼", 4000);
		menus[3] = new Menu("카푸치노", 4000);
		
		Scanner sc = new Scanner(System.in);
		int menuIndex = sc.nextInt();
		int quantity = sc.nextInt();
		sc.close();
		
		// 사용자가 입력한 메뉴의 수량에 맞는 총 가격 출력
		if (menuIndex >= 0 && menuIndex < menus.length && quantity > 0) {
			OrderItem o = new OrderItem(menus[menuIndex], quantity);
			System.out.println(o.getPrice());
		}
	}

}
