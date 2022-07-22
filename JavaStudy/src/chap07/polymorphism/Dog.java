package chap07.polymorphism;

public class Dog extends Animal {			// animal 클래스를 상속받음.
//	부모 클래스에 sound 메소드 존재
//	재정의
	@Override
	void sound() {
	System.out.println("멍멍 소리를 냅니다.");
	
	}
}
