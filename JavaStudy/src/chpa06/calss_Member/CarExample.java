package chpa06.calss_Member;	

public class CarExample {			// Car 클래스와 같은 패키지 내에 존재하는 클래스.

	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("회사 : " +  myCar.company);
		System.out.println("모델명 : " +  myCar.model);
		
		Car yourCar = new Car();
		System.out.println("회사 : " + yourCar.company);
		System.out.println("모델명 : " + yourCar.model);
		
		Car hongCar = new Car("그랜져");
		System.out.println("회사 : " + hongCar.company);
		System.out.println("모델명 : " + hongCar.model);
		
//		model = "그랜져"; // -> CarExample 클래스의 필드로 생각한다.
//		어느차의 모델인지 모르므로 직접 model에 접근 불가능
//		다른클래스에서는 참조변수를 사용해서 접근해야 한다. : hongCar.model
	}

}
