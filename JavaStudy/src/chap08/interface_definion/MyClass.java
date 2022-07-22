package chap08.interface_definion;

//인터페이스를 사용하는 방법 (종류)
// 필드로 사용
// 생성자에서 사용
// 메소드의 로컬변수 
// 메소드의 매개변수

public class MyClass {
	//필드
	RemoteControl rc = new Television();
	//생성자
	MyClass() {
		
	}
	// 생성자의매개변수
	MyClass(RemoteControl rc) {
		this.rc = rc;
	}

	
//	void method1() {
//		RemoteControl rc = new Audio();
//		
//	}
//	
//	// 메소드
//	void method2(RemoteControl rc) {
//		rc.turnOn();
//		rc.turnOff();
//	}
	
	void method3() {
		// 필드로 정의된 것을 이용해서 작업을 할 수 있다.
		rc.turnOn();
		rc.turnOff();
	}
}
