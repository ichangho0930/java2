package cote.exam1105;

public class NetworkRepository implements MemoRepository {
	@Override
	public void addMemo(String id, String body) {
		System.out.println("원격 서버에 메모를 추가합니다.");
	}
	
	@Override
	public void getMemo() {
		System.out.println("원격 서버에 메모를 조회합니다.");
	}
	
	@Override
	public void deleteMemo(String id) {
		System.out.println("원격 서버에 메모를 삭제합니다.");
	}
	
	@Override
	public void updateMemo(String id, String body) {
		System.out.println("원격 서버에 메모를 수정합니다.");
	}
}
