package chap09.nested_calss;

public class NestedExample {

	public static void main(String[] args) {
		// 인스턴스 멤버 : 객체가 생성되어야만 존재
		// 정적 멤버 : 객체의 생성 없이도 접근 가능
		// Inner Class 접근 방법
		// 정적 멤버 클래스에 접근하는 방법 
		Outer.InnerB ib = new Outer.InnerB();	// Outer 클래스의 생성없이 InnerB를 생성 가능
		ib.field3 = 20;	// 인스턴스 멤버 필드
		ib.method3(); // 인스턴스 멤버 메소드
		// 정적필드는 객체의 생성 없이 접근 가능
		Outer.InnerB.str3 = "홍길동";
		
		
		// Inner Class 중 인스턴스 클래스에 접근
		Outer outer = new Outer();
		Outer.InnerA ia = outer.new InnerA();	// 인스턴스 멤버 클래스 접근하는 방법
		ia.field1 = 20;
		ia.iMethod1();
		outer.method();		// 로컬 클래스가 동작한다.
		// 로컬 클래스는 메소드가 실행 될 때만 일시적으로 사용되는 클래스이다.
		

	}

}
