package chap11.object_null;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1)); // 홍길동
		try {
			String name = Objects.requireNonNull(str2); // null일 경우 예외
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String name = Objects.requireNonNull(str2, "이름이없습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 이름이없습니다.
		}
		
		//람다식
		try {
			String name = Objects.requireNonNull(str2, () -> "이름이없다니깐요");
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 이름이없다니깐요
		}
	}

}
// 기존 교재안에 있는 실습파일은 MSM949로 인코딩이 되어있으므로 UTF-8로 인코딩을 하는 이클립스환경에서는 깨진 글자처럼 보인다