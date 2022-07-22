package chap08.default_extension;

public interface MyInterface {
	void method1();
	
	//기능 추가하려고 함
	// 추상 메소드로 만들지말고 디폴트 메소드로 만들면 됨.
//	void method2();
	
	default void method2() {	// 기본 기능이 있어야 하므로 기능 추가
		System.out.println("MyInterface-method2");
	}
	
	// 새로운 기능을 MyInterface에 default 메소드로 추가하면 MyClassA가 수정하지 않아도 된다.
	// method2()는 존재 
}
