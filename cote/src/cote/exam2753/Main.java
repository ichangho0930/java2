package cote.exam2753;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		int a = A.nextInt();
		if (a % 4 == 0 && a % 100 != 0) {
	          System.out.println("1");
	    }
	    else if (a % 400 == 0) {
	    	System.out.println("1");
	    }
	    else if (a % 100 == 0 && a % 400 != 0) {
	    	System.out.println("0");
	    }
	    else {
	    	System.out.println("0");
	    }
	}

}
