package cote.exam1105;

public class MemoExample {

	public static void main(String[] args) {
		MemoRepository repository;
		
		repository = new LocalRepository();
		
		repository.addMemo("1", "Hello");
		
		repository = new NetworkRepository();
		
		repository.addMemo("1", "Hello");
	}

}
