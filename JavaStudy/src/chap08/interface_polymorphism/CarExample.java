package chap08.interface_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		System.out.println();
		
		car.frontLeftTire = new KumhoTire();
		car.frontRightTire = new KumhoTire();
		
		car.run();
		

	}

}
/*
 * 필요에 따라서 타이어를 교체 -> 교체 타이어가 동작 -> 다형성
 * 다형성 전제조건
 * 1. 자동타입변환 : 인터페이스 = 구현객체를 대입
 * 2. 추상메소드를 재정의 : 인터페이스의 메소드를 구현객체에서 재정의
 * 인터페이스에 어떤 구현객체를 대입했느냐에 따라서 그 구현객체의 특성이 나타난다.
 * 
 *넥센 타이어를 구현해서 대입을 하면 동작 : 확장성이 뛰어나다
 *Car 클래스는 변경되는것이 없다.
 * 
*/
