package chap11.arrays;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		// 기본타입값검색
		int[] scores = { 99, 97, 98 ,99 };
		Arrays.sort(scores);
		
		// binarySearch 메소드를 사용하기 전에 배열이 먼저 정렬이 되어야함. -> 정렬해야 앞에서부터해서 검색되는듯? -> 정렬안하면 전체 검색후 색출하는거같기도하고.. 찾긴함.
		int index = Arrays.binarySearch(scores, 99);
		int index2 = Arrays.binarySearch(scores, 3, scores.length, 99);			// -> 이것도 한개만찾음. 어디부터 어디까지중 찾는
		System.out.println("찾은인덱스:" + index);
		System.out.println(index2);
		
		// 문자열검색
		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은인덱스:" + index);
		
		// 객체검색
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은인덱스:" + index);

	}

}
