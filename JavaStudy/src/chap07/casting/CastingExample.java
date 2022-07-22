package chap07.casting;

public class CastingExample {

	public static void main(String[] args) {
		// 자동 타입 변환
		Parent parent = new Child();		// 자동 타입 변환 ( 부모타입에 자식타입 대입 )
		
		
		// parent 타입이 접근할 수 있는 범위가 어디까지인가?
		parent.method1();	// Parent 가 정의한 메소드
		parent.method2();	// Child 가 정의한 메소드 -> 다형성
//		parent.method3();
		parent.field1 = 20;	// Parent 가 정의한 필드

		// 원래 내가 생성한 객체는 Child이다. -> Child 가 추가한 필드나 메소드에 접근하고싶다. ( Child 는 존재는 하나 접근을 못하는것 )
		// 이떄 필요한게 강제 타입 변환.	<= 강제 타입 변환이 가능한 이유는 원래 생성된게 Child 이기 떄문
		Child child = (Child)parent;
		child.method3();
		child.field2 = 20;
		// 처음에 생성한 객체가 Child기 때문에 
		
		// 문제는 원래 생성한 객체가 Parent 일 때 		
		Parent parent2 = new Parent();
//		Child child2 = (Child)parent2;		// ok-> 실행시 예외가 발생 -> Parent를 Child 로 변경 불가
		// ClassCastException 발생
		// 강제 타입변환을 할 때, 원래 생성한 객체가 Parent인지, Child 인지 확인할 필요가 있음.		
		
		if(parent2 instanceof Child) {			// 원래 생성한 객체가 Child 인지 물어보는것
			Child child2 = (Child)parent2;		// Child 면 강제타입변환	
		}else {
			System.out.println("변환X");			// Child 가 아니라 강제타입변환 X
		}
	}

}

//	쉽게 생각하면 parent. ~~ -->> parent 클래스에 있는것 전부 사용가능 + Override 한 메소드같은경우 치환돼서 사용
//  new Child -> child 객체를 만들어 parent 에 자동 타입변환되어 저장되었지만, parent 는 parent가 정의한것만 볼수 있다.

// 객체를 child 생성 -> parent 자동변환 -> parent 접근 , child 강제타입변환후 접근 O
// 객체를 parent 생성 -> parent 당연히 접근 , child 접근 불가 (객체 생성X)


