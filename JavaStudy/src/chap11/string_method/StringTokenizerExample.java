package chap11.string_method;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// 문자열을 분리하는 방법 : 딜리미터를 사용
		// (1) String split() 메소드 사용.
		// (2) StringTokenizer를 사용하는 방법.
		
		String text = "홍길동&이수홍,박연수,김자바-최명호";	// 문자열은 딜리미터로 구분된다.
		// 엑셀테이블의 데이터를 파일로 저장할 때 -> 셀에 있는 데이터를 구분해서 저장할 떄 (일반적으로 ,를 사용)
		String[] names = text.split("&|,|-");
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
		}
		
		// StringTokenizer 를 사용 하는 방법
		String text2 = "홍길동/이수홍/박연수";	// 디리미터
		StringTokenizer st = new StringTokenizer(text2, "/");
		while(st.hasMoreElements()) {
			String token = st.nextToken();	// 문자열
			System.out.println(token);
		}
		
		// 토큰의 갯수를 나타내는 countToken() 	
		StringTokenizer st2 = new StringTokenizer(text2, "/");
		int countTokens = st2.countTokens();		// 토큰의 개수
		for(int i = 0; i < countTokens;  i ++ ) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		
		
	}	

}
