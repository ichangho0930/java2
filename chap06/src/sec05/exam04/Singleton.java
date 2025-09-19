package sec05.exam04;

public class Singleton {
	/*private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}*/
	
	private static Singleton singleton = null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (singleton == null)
			singleton = new Singleton();
		return singleton;
	}
}
