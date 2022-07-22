package chap06.static_member;

public class CalculatorExample {
		public static void main(String[] args) {
			// 정적멤버는 클래스 이름으로 접근가능
			int x = 10;
			int y = 20;
			// 정적메소드는 클래스 이름으로 접근할 수 있다.
			int sum = Calculator.plus(x, y);
			double radius = 5.0;
			// 클래스 이름을 사용해서 접근 - 어디서든지 접근할 수 있다.
			double area = Calculator.pi * radius * radius;
			
			// 인스턴스 멤버 -> 객체가 생성되어야지만 의미
			Calculator myCal = new Calculator();		// 객체 생성
			myCal.value1 = 10;							// 참조변수를 사용해서 접근할 수 있다.
			// 정적필드를 접근 : 참조변수를 사용해서 접근을 할 수 있다. -> Calculator.pi 사용을 권장
			System.out.println("pi = " + myCal.pi);		// 정적 필드는 어떤 인스턴스에만 있는것이 아니므로 myCal.pi로 접근하면 그 객체에만 존재하는것
														// 처럼 착각하고 실수할 수 있기 때문에 Calculator.pi 사용을 하자
			System.out.println("pi = " + Calculator.pi);// 바람직하다.
			
			int result = myCal.plus(10,2); 				// 바람직하지 않다.
		}
}
