package chap09.nested_calss;

public class A {	// Outer(외부) 클래스
	// 인스턴스 멤버 클래스 -> 객체 A가 생성되어야 존재함.
	class B {}
	
	// 정적 멤버 클래스
	static class C {} // -> 객체 A의 생성과는 무관하게 존재
	
	// 인스턴스 필드 -> 객체 A가 생성되어야만 의미가 있다. -> 객체 A가 생성됨
	B field1 = new B();	// OK
	C field2 = new C();	// OK
	
	// 인스턴스 메소드
	void method1() { // method1 이 실행되는 시점엔 객체 A가 생성됨.
		B var1 = new B();	// OK
		C var2 = new C();
	}
	
	// 정적 필드 -> 객체 A의 생성과는 무관하게 존재(동작) 
	static B field3 = new B();	// 에러 -> 클래스 는 인스턴스 멤버 클래스 이므로 객체 A가 생성되어야 존재
	static C field4 = new C(); 	// OK -> 클래스 C가 정적 멤버 클래스 이므로 객체 A의 생성과는 무관함
	
	static void method2() {	// 객체 A의 생성과는 무관하게 동작
	// 인스턴스 (X) , 정적(O)
	B var1 = new B();		// 에러
	C var2 = new C();		// OK
	}
	
}
