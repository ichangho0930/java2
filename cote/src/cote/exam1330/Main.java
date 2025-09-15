package cote.exam1330;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		int num = A.nextInt();
		int num2 = A.nextInt();
		if (num > num2) {
			System.out.println(">");
		}
		else if (num < num2) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
	}

}
