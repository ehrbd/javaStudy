package chap07.casting;

public class Child extends Parent {
	// 필드
	int field2;
	
	// 메소드
	@Override
	public void method2() {
		System.out.println("Child:method2()실행");
	}
	
	// 자식이 추가한 메소드
	void method3() {
		System.out.println("Child:method3()실행");
	}
}
