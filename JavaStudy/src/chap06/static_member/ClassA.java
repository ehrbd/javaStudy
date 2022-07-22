package chap06.static_member;

public class ClassA {
	// 인스턴스 필드 -> 객체가 생성 되어야만 존재
	int field1;
	// 인스턴스 메소드 
	void method1() {
		System.out.println("method1() 실행됨");
	}
	
	// 정적 필드와 메소드 -> 객체의 생성 없이 존재한다
	static int field2;
	static void method2() {
		System.out.println("method2() 실행됨");
	}
	// 정적 블럭 -> 객체의 생성없이 존재한다 -> 메소드 영역에 로딩될 때 순서대로 실행된다.
	static {				// 주로 초기화할때 사용
	// 인스턴스 멤버를 사용할 수 있는지?
//		field1 = 10; 		// 에러발생 -> 인스턴스 필드는 사용 불가 -> 객체가 있어야만 사용가능
		field2 = 10;
		
		ClassA ca = new ClassA();	// 객체 생성 
		ca.field1 = 30;				// 객체가 생성되고 나서 참조변수를 통해서 접근 가능 -> 의미없음
		
//		method1();    		// 인스턴스 메소드를 호출할 수 없음
		method2();
	}
	
	// static 블럭과 같은 경우
	static void method3() {
//		field1 = 30; 		// 에러
//		method1(); 			// 에러
		field2 = 30;
		method2();
		
		
	}
	
}
