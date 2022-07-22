package chap06.access_modifier1;

public class ClassA {
//	필드 
	public int field1;
	protected String field2;
	long field3;			 	// 	default : 접근제한자를 적지 않을때
	private double field4;
	
//	생성자
	public ClassA(int field1) {				// 생성자 오버로딩 : 시그니쳐(타입, 개수,순서)
		this.field1 = field1;
	}
	protected ClassA(String field2) {
		this.field2 = field2;
	}
	ClassA(long field3) {
		this.field3 = field3;
	}
	private ClassA(double field4) {
		this.field4 = field4;
	}
	
//	메소드
	public void method1() {
		System.out.println("method1() 실행됨");
	}
	protected void method2() {
		System.out.println("method2() 실행됨");
	}
	void method3() {
		System.out.println("method3() 실행됨");
	}
	private void method4() {
		System.out.println("method4() 실행됨");
	}
	
	
	
	
	void method5() { 		// 같은 클래스에서 접근
		field1 = 10;		
		field2 = "홍길동";
		field3 = 10L;
		field4 = 5.5;
		
		method1 ();
		method2 ();
		method3 ();
		method4 ();
	}
}
