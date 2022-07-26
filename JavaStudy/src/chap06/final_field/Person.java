package chap06.final_field;

// final : 최종, 초기화가 된 이후에 변경 불가
// 한번 값이 정해지면 변경을 할 수 없도록 하고자 할 때 final 키워드를 붙여준다.
// 초기화 방법 
// 1. 필드 선언 시
// 2. 생성자로 초기화할 떄.

public class Person {
//	상수 : static final 키워드
//	변경 불가능
//	상수 이름은 대문자로 작성
//	두개 이상의 단어를 사용할 경우 _로 연결
//	생성자로 초기화할 수 없음 -> 필드가 아니라 값이니까
//	이름은 의미있는 단어를 사용 -> 이름만 보면 어떤 것인지 알 수 있도록 작명
	
	public static final String KOREA = "Korea";
	public static final String LOGIN_SUCCESS = "login success";
	
	public static final String CITY = "seongnam";
	public static final String ADDRESS;
	static {	// static 블럭을 사용해서 초기화 할 수 있다.
		ADDRESS = KOREA + CITY;
	}
	
//	필드
	final String nation = "Korea";		// 필드 선언과 함께 초기화
	final String ssn; 					// 주민등록 번호 -> 에러 (초기화를 안해서) -> 생성자로 초기화하면 에러가 발생하지 않는다.
	String name;
	
//	생성자를 사용해서 final을 초기화할 수 있다.
	public Person(String ssn, String name) {
		this.ssn = ssn;					// final 필드를 초기화
		this.name = name;
	}
	void method() {
//		nation = "미국"; // 에러발생 -> final 은 변경 불가능
	}
	
}
