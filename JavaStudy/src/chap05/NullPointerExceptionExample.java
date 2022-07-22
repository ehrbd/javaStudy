package chap05;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String name = "홍길동";				// name : 참조 변수 -> String 객체를 참조
		String hobby = null;				// hobby : 참조 변수 -> 참조 하는 문자열이 없다.
//		hobby = getHobby();					// 메소드를 호출해서 취미를 구하는데, 메소드 실행의 결과로 null 이 올 수 있다
//		예외가 발생할 수 있는것을 고려해서 프로그래밍을 해야한다.
		
		System.out.println("name 의 길이 : " + name.length());		// 문자열의 길이 출력
//		System.out.println("hobby 의 길이 : " + hobby.length());	// NullPointerException 발생
//		스택에 저장된 내용을 출력 : stack trace -> 프로그램의 어디서 예외가 발생되었는지를 알려줌
//		프로그램이 종료됨.
//		예외가 발생되어 stack trace 가 출력이 되면, 내가 작성한 프로그램(메소드)을 찾는것이 필요하다.
//		수십라인이 출력이 돼서 잘 못 찾을 때가 있다.
//		에러의 원인 잘 분석할 수 있는 능력을 키워야 된다.
//		영어 실력이 부족해서
		
		

	}

}
