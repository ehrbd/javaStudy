package chap07.inherit_introduction;

public class Computer extends Calculator {		// 자식 클래스
	// 부모의 메소드를 가지고 있다. : areaCircle() 
	// 1. 부모가 정의한 메소드를 그대로 사용
	// 2. 나만의 방법으로 재정의하여 사용
	
	// 재정의: @Override 
	// 특징 : 부모의 반환형, 메소드이름, 매개변수가 동일해야 -> 사실상 첫줄
	// @Override 어노테이션을 사용했기 떄문에 부모의 메소드의 형식을 따르는지를 검사를 한다.
	
	// 오버라이드를 생략하면 아래 2메소드가 오류가 안남 -> 메소드 오버로딩으로 간주하여 새로운 메소드 취급
//	@Override			// 어노테이션 사용 -> 재정의한다 -> 컴파일러에게 알린다.
	double areaCircle(float r) {			
		return super.areaCircle(r);
	}
		
//	double areaCircle(double r) {
//		return super.areaCircle(r);
//	}
	
	@Override // 이 경우는 생략해도 됨. 위의 경우는 float r 이라는 다른 매개를 가진 메소드기 떄문에 오버로딩으로 성립시킨것.
	double areaCircle(double r) {	// 재정의한것과같다 
		System.out.println("Computer 객체의 areCircle() 실행");
		return Math.PI * r *r;	// super : 부모 (Calculator
		// 무보의 메소드를 재정의 하지 않으면 부모의 메소드가 실행됨.
	}
	
	
	
}
