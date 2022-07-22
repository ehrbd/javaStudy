package chap06.access_modifier2;

import chap06.access_modifier1.ClassA;

public class ClassC extends ClassA {		// extends ClassA : ClassA를 상속한다.

	public ClassC(int field1) {				// 자식 ClassC의 생성자
		super(field1);						// 부모 생성자를 호출 : public 호출
	}
	public ClassC(String field2) {			
		super(field2);						// 부모 생성자를 호출 : protected 호출
	}
//	public ClassC(long field3) {				
//		super(field3);						// 에러발생	
//	}
//	public ClassC(double field4) {				
//		super(field4);						// 에러발생		
//	}
	
	void method() {							//상속을 했으므로 부모의 필드를 가지고 있다.
		field1 = 10;						// public : ok
		field2 = "홍길동";					// protected : ok (상속을 받았으므로 접근 가능)
//		field3 = 20L;						// default : 접근 불가능 -> 같은 패키지 내에서만 가능
//		field4 = 4.4						// private : 접근 불가능 -> 같은 클래스 내에서만 가능
		
		method1();
		method2();
//		method3();
//		method4();
		
//		생성자

		
	}
	
	
	
}
