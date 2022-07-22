package chap11.arrays;
/* 배열에 Member 객체를 저장
 * 배열을 정렬하기 위하여 비교방법이 필요
 * Member 객체에 Comparable 인터페이스를 구현해줘야 함.
 * -> 만약에 Comparable 인터페이스를 구현하지 않으면 Comparator 클래스를 사용 : Student - StudentComparator
 * 
 */

public class Member implements Comparable<Member> {
	// 필드
	String name;	// 이름에 가나다순으로 정렬을 한다.
	
	// 생성자
	Member(String name) {
		this.name = name;
	}
	
	
	// Comparable 인터페이스의 추상메소드 compareTo 를 재정의 해줘야함. (Member 밑에 빨간줄 클릭 -> 재정의)
	@Override
	public int compareTo(Member o) {		// 이름의 가나다순으로 정렬
		return name.compareTo(o.name);
	}

}
