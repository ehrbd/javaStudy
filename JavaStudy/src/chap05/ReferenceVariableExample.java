package chap05;

public class ReferenceVariableExample {
					// ↓ main 쓰레드
	public static void main(String[] args) {
		int age = 20;								//
		double price = 10.5;
		String name = "홍길동";
		String hobby = "독서";
		
		printPrimitiveVariable(age, price);
		System.out.println("이름: "+ name);
		System.out.println("취미: "+ hobby);
	}

	private static void printPrimitiveVariable(int age, double price) {
		System.out.println("나이: " + age);
		System.out.println("가격: " + price);
		
	}

}

/*	method 영역
 *  
 * 	stack 영역
 * 	(1) main 메소드 호출
 * 	(2) age, price 변수 생성, 값 저장
 *  (4) name, hobby의 주소를 저장 (4byte)
 *  (6) 메소드 호출 및 이하 실행
 *  
 * 	stack 영역2
 * 	(5) printPrimitiveVariable 메소드 생성
 *  
 * 	heap 영역
 * 	(3) String 홍길동, 독서 객체 생성 및 값 저장
 * 
 */
