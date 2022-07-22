package chap08.interface_usage;

public class MyClass {
	// 필드
	Audio tv;
	
	//생성자
	public MyClass() {
		
	}
	
	// 메소드
	public void method() {
		// Tv를 사용
		tv = new Audio();		
		tv.turnOn();
		tv.listen();			
		tv.turnOff();
	}
	
}
