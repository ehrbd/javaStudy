//	문자열 비교
//	==, 1= : 주소를 비교
//	.equals 메소드를 사용해서 비교 : 내용을 비교

package chap03;

public class StringCompareExample {

	public static void main(String[] args) {
		String str1 = "강낭콩";					// 리터럴 (여러번) 반복되더라도 한번만 저장이 된다.
		String str2 = "강낭콩";
		String str3 = new String("강낭콩");
		
//		주소를 비교
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
//		내용을 비교
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
			
	}

}
