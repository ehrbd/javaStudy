package chap09.anonymous_class;

public class Gildong extends Person {		// 부모 클래스 Person 상속
	// 부모의 메소드를 재정의
	
	@Override
	void wake() {
		System.out.println("8시에 일어납니다.");
		gotoInstitute();
	}
	
	// 자식클래스의 메소드를 추가
	private void gotoInstitute() {
		System.out.println("학원에 갑니다");
	}
	
}
