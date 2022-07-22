package chap11.object_class;


//모든 클래스는 Object 클래스를 상속 받는다.
// Object 클래스의 메소드를 가지고 있다.
// clone(), finalize(), toString(), equals(), hashiCode() 
// equals() : 물리적 동등비교 -> 기본적으로는 주소를 비교 -> 논리적 동등비교 (equals() 메소드를 재정의를 해야한다.)
// hashCode() : 물리적인 id를 반환 -> 물리적으로 다른놈이면 다른 값을 반환 -> 논리적 동등비교를 하려면 물리적으로 다르더라도 같은 hashCode를 가지도록 재정의를 해줘야함.
// toString() : 패키지경로와 클래스의 주소를 출력 -> 주소는 의미없는 값(사용자에게는) -> 클래스의 정보를 출력하도록 재정의를 해줘야함. + 객체를 출력할 때 객체의 toString() 메소드가 호출이 된다.
// clone() : 객체 복제 할 때 사용 -> 얕은복제 : 클래스 내에 참조 변수나 배열이 있을 때, 주소만 복사, 동일한 객체를 가리키게 된다.  / 깊은복제 : 클래스 내에 참조 변수나 배열이 있을 때, 참조 객체&배열의 내용까지 복사
// finalize() : 

public class Member {
	public String id;
	
	public Member(String id) {	// 만든객체의 id
		this.id = id;
	}
	
	// object -> 어떤 객체 라도 가능하다는 의미 겠찌 Member가 들어갔으니까
	@Override
	public boolean equals(Object obj) {	// obj 비교대상
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result = obj1 == obj2;			// false
		boolean result2 = obj1.equals(obj2);	// equals() 메소드는 == 과 같다 false
		
		System.out.println(obj1);				// obj1.toString()을 출력
		System.out.println(obj2);				// obj2.toString()을 출력
		System.out.println(result);
		System.out.println(result2);	
		
		
		
	}
	
}
