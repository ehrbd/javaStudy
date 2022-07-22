package chap07.inherit_introduction;

public class Student extends People {	// 부모 클래스인 people을 상속 받음
	// 필드
	public int studentNo; 				// 학번 
	
	// 생성자
	public Student () {					// default 생성자
		super();				// 부모의 default 생성자 호출 -> 부모의 생성자가 없다.
	}
	
	public Student(String name, String ssn) {
		super (name, ssn);		// 부모의 생성자를 호출할 수 있음. -> 부모의 생성자를 호출해야 함.
		// 부모생성자로 default 생성자를 사용하고 싶으면 default 를 추가하시길
	}
		
	public Student(String name, String ssn, int studentNo) {		// 오버로딩
		super (name, ssn);		// 부모의 생성자를 호출할 수 있음.
		this.studentNo = studentNo;
		// super : 부모 클래스를 의미.
		// this : 자기 자신 Student 클래스를 의미
	}
}
