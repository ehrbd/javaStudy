package chap08.interface_definion;

// InterfaceAimpl : 구현객체
// implements 키워드 사용하고 구현하고자하는 인터페이스명을 붙여준다.
// 여러개 구현할 수 있다. (필요한 기능을 추가한다)
// 추상메소드 재정의해주어야 한다. (구현객체는 구현할 목적으로 implements 하였으므로)
// 추상메소드를 구현하지 않으면 추상메소드가 되고 추상클래스가 된다.
public class interfaceAimpl implements InterfaceA {

	// 추상메소드 -> 재정의
	@Override
	public void method1() {
		System.out.println("추상메소드를 재정의한다.");
	}

}
