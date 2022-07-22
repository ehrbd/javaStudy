package chap08.default_extension;

public class MyClassA implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassA-method1() 실행됨");

	}
	// 새로운 기능을 추가를 해서 새로운 제품을 만들었는데 
	// 기존제품을 유지보수할 수가 없음 -> 에러발생
	// 새로운 추가된 추상 메소드를 재정의하라고 한다.
	// 기존 제품은 소스코드를 유지해야 한다. -> 수정 불가
}
