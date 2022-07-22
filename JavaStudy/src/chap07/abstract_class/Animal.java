package chap07.abstract_class;

public abstract class Animal {
	public String kind;					// 종류 : 포유류 , 양서류 ~
	
	// 상속받은 여러 클래스에서 공통으로 사용할 수가 있다. -> 재정의 없이 사용할 수 있다.
	public void breath() {				// 기본동작을 정의 -> 상속 받은 클래스에서 재정의 없이 사용 가능.
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();		// 소리를 낸다
	// 소리를 내는 것을 추상클래스에서 구체적으로 정의하기가 어려울 떄, 자식클래스에 짬처리
}
