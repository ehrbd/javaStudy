package chap07.inherit_introduction;

public class People {		// 부모 클래스
	// 필드 
	public String name;		// 이름	
	public String ssn;		// 주민등록번호
	
	public People() {
		
	}
	//생성자 :매개변수가 있는 생성자 -> dafault 생성자를 만들지 않은
	public People(String name, String ssn)	{
		this.name = name;
		this.ssn = ssn;
	}
}
