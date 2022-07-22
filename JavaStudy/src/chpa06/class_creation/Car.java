package chpa06.class_creation;

// main() 메소드가 있는 클래스 -> 실행 클래스 -> JVM 이 실행할 수 있다.
// main() 메소드가 없는 클래스 -> 독자적으로 실행 불가. 라이브러리로 사용
// 즉, 다른클래스가 호출해서 사용
public class Car {				// 클래스 : 설계도 / 모든 클래스의 부모 클래스는 Object 클래스 이다.
//	Car 클래스는 Object 클래스를 상속 받은 것이다. (표기를 생략함 -> 명시하지 않아도 )
	int speed;					// 속도 , 모델, 회사
	String model;
	String company;

	public static void main(String[] args) {
		Car myCar = new Car();				// 객체를 생성(new 연산자 사용) -> 구체적인 실체를 만든다.
											// heap 영역에 데이터를 저장할 수 있는 공간이 생긴다.
		myCar.speed = 60;					// 참조변수를 사용해서 속도를 설정
		myCar.model = "소나타";
		myCar.company = "현대";
		
		System.out.println("속도 : " + myCar.speed);
		System.out.println("모델명 : " + myCar.model);	
		System.out.println("제조사 : " + myCar.company);
		
		System.out.println();
		
//		 myCar, brotherCar : 참조변수 -> 객체를 가리키는 변수 -> 참조변수를 통해서만 객체에 접근가능
		
		Car brotherCar = new Car();			// 형제의 차 -> 인스턴스화 ( 하나의 객체 생성 )
		
		brotherCar.speed = 120;
		brotherCar.model = "S100";
		brotherCar.company = "BMW";
		
		System.out.println("속도 : " + brotherCar.speed);
		System.out.println("모델명 : " + brotherCar.model);	
		System.out.println("제조사 : " + brotherCar.company);
		System.out.println(brotherCar); 			// 참조 변수가 가리키는 객체를 출력.
//		참조변수를 출력하면 Object 클래스의 toString() 메소드를 호출 -> 클래스 이름과 주소를 출력
		
		
	}

}
