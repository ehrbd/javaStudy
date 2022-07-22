package chap11.arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		// int 타입의 배열
		int[] scores = { 99, 97, 98 };
		// 정렬
		Arrays.sort(scores); // 기본 데이터 타입을 저장하는 배열을 정렬 -> 오름차순

		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println();
		
		// 문자열배열
		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]=" + names[i]);
		}
		System.out.println();
		
		// Member 객체를 저장하는 배열 -> Member 객체가 Comparable 인터페이스를 구현해야한다.
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = {m1, m2, m3 };
		Arrays.sort(members);
//		Arrays.sort(members, /*Comparator 구현객체를 사용*/);
// 		Comparable 인터페이스를 구현하지 않은 객체를 정렬할때 -> Comparator 구현객체를 사용 -> Member 객체 안에 재정의된 comparable 인터페이스의 메소드 compareto 가 (Arrays.sort 에 의해 실행되면서 정렬되는 듯? 내생각)
		for (int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name=" + members[i].name);
		}

	}
}
