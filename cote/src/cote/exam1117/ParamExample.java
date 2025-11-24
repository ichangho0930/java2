package cote.exam1117;

public class ParamExample {

	public static void main(String[] args) {
		int[] array = {0, 1, 2};
		
		printInfo(array);
		System.out.println("in main " + array[2]);
	}
	
	public static void printInfo(int[] values) {
		System.out.println(values[2]);
		values[2] += 10;
		System.out.println(values[2]);
	}
}
