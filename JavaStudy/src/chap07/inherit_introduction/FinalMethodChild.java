package chap07.inherit_introduction;

// final 필드 : 수정 불가능

public class FinalMethodChild extends FinalMethod {
	//재정의
	@Override
	void method1() {
		System.out.println("재정의를 합니다");
	}
	
	@Override
	public void method2() {				// 에러발생 : final 메소드는 재정의불가
		// -> 자식 객체가 재정의하지 못하게 하려면, 부모 메소드를 final 키워드를 붙여준다


	}
}
