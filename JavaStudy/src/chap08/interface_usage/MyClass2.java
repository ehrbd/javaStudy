package chap08.interface_usage;

// MyClass와 Television , Audio 가 의존성이 심화.
// Television -> Audio 변경시 수정해야할게 많음.
public class MyClass2 {
	// 필드
	Television tv;
	
	//생성자
	public MyClass2() {
		
	}
	
	// 메소드
	public void method() {
		// Tv를 사용
		tv = new Television();		
		tv.turnOn();
		tv.watch();			
		tv.turnOff();
	}
	
}
