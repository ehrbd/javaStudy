package chpa06.sec06.exam01_field_declaration;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();								// 객체를 생성 (실체가 있어야 접근할 수 있다.)
		System.out.println("제작회사 : " + myCar.company);		// 참조 변수를 사용해서 접근
		System.out.println("속도 : " + myCar.speed);			// 0으로 초기화
		myCar.speed = 60;
		System.out.println("변경된 속도 : " + myCar.speed);
		
	}

}
