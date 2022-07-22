package chap05;

public class StringExample {

	public static void main(String[] args) {
		String name1 = "신용권";				// "신용권" : 문자 리터럴 -> heap영역에 저장
		String name2 = "신용권";				// 위와 동일 -> 위의 문자 리터럴과 같은 문자열 -> 동일한 문자열
		String name3 = new String("신용권");	// new 생성자를 이용해서 생성한 인스턴스 객체
		String name4 = new String("신용권");
		
//		↓ 주소 비교 -> 물리적으로 동일한 문자열(객체)인지 비교
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);			// 물리적으로 다름.
		System.out.println(name3 == name4);
		
//		↓ 내용비교 -> 논리적으로 동일한 문자열(객체)인지 비교 -> 논리적 동등비교 (로그인시 사용자로부터 입력받은 값과 데이터베이스에 저장된 값과 회원정보가 같은지 
		System.out.println(name1.equals(name2));	
		System.out.println(name1.equals(name3));	// 물리적으로 다르지만, 논리적으로 같음.
		System.out.println(name3.equals(name4));
		
//		가비지 컬렉션 : heap 영역에서 사용하지 않는 데이터를 사용할 수 있도록 환수하는 것.(JVM)
		name4 = null;								// new String("신용권") 으로 생성했던 객체에 대한 참조방법이 없어짐 -> 가비지컬렉터가 회수
		System.out.println(name4);					// 새로운 객체를 생성하려는데 메모리가 부족할 때 회수
		

	}

}
