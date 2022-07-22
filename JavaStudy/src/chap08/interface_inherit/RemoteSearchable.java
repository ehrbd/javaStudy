package chap08.interface_inherit;

// 인터페이스 상속 : 여러개를 상속 받을 수 있다.
// extends 키워드를 사용
// 상속받는 인터페이스를 나열 
// 
public interface RemoteSearchable extends RemoteControl, Searchable {
	// 구현해야될 추상메소드 : RemoteControl + Searchable 인터페이스의 추상메소드를 가지고 있다.
}
