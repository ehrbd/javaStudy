package chap06.access_modifier1;

public class classB {
	void method() {
		ClassA ca = new ClassA(10); 		// public
		ca.field1 = 10;						// public
		ca.field2 = "홍길동";					// protected
		ca.field3 = 20L;
//		ca.field4 = 4.4;					// private : 접근 불가능 (다른 클래스)
		
		ca.method1();
		ca.method2();
		ca.method3();
//		ca.method4();						// 접근 불가능 private (다른 클래스)
		
//		생성자
		ClassA capro = new ClassA("홍길동");	// protected
		ClassA cadef = new ClassA(20L);		// default : OK
//		ClassA capri = new ClassA(3.3);		// private : 접근 불가능-> 다른 클래스
		
	}

}
