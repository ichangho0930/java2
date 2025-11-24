package sec02.exam01;

public class Anorymous {
	Parent field = new Parent() {
		void work() {
			System.out.println("출근합니다. ");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	void method1() {
		Parent localVar = new Parent() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
	}
	
	void method2(Parent person) {
		person.wake();
	}
}
