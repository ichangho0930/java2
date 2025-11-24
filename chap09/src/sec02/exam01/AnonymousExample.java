package sec02.exam01;

public class AnonymousExample {

	public static void main(String[] args) {
		Anorymous anony = new Anorymous();
		anony.field.wake();
		anony.method1();
		anony.method2 (
				new Parent() {
					void study() {
						System.out.println("공부합니다.");
					}
					@Override
					void wake() {
						System.out.println("8시에 일어납니다.");
						study();
					}
				}
		);
	}

}
