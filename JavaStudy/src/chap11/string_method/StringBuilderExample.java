package chap11.string_method;

/*
 * 문자열 연결을 하는  + 연산의 단점으로 메모리의 낭비가 있다 (기존 문자열을 유지하면서 새로운 문자열을 만듦)
 * 문자열을 효과적으로 조작하기 위한 방법이 필요 -> StringBuilder, StringBuffer
 * 무한대로 문자열을 저장할 수 있고 (메모리 자동 추가) , 문자열 조작을 위한 다양한 메소드 제공
 * StringBuffer : 멀티스레드 // StringBuilder : 단일스레드
 *   
 */
public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); 		// 객체 생성 : 일정 크기의 버퍼가 생성됨.
		sb.append("Java ").append("Program Study");	// cascading을 지원
		System.out.println(sb.toString());			// toString() 메소드를 사용해서 문자열로 변환
		
		sb.insert(4, "2");		// 중간에 임의의 위치에 문자열 추가 가능
		System.out.println(sb.toString());
		
		sb.setCharAt(4,'6');
		System.out.println(sb.toString());
		
		sb.replace(6,13,"Book");		// 13은 미포함
		System.out.println(sb.toString());
		
		sb.delete(4,5);					// 5미포함
		System.out.println(sb.toString());
		
		int length=sb.length();
		System.out.println("총문자수:"+length);
		
		String result=sb.toString();
		System.out.println(result);

		

	}

}
