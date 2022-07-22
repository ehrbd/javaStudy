package chap11.string_method;

public class EtcExample {

	public static void main(String[] args) {
		// toLowerCase() : 소문자로
		// to UpperCase() : 대문자로
		
		String aaa = "Java Programming";
		System.out.println(aaa);
		String bbb = aaa.toLowerCase();
		System.out.println(bbb);
		String ccc = aaa.toUpperCase();
		System.out.println(ccc);
		
		// trim() : 앞뒤 공백을 잘라낸다.
		
		String ddd = "  \t \n   JAVA PROGRAMMING  ";
		String eee = ddd.trim();
		System.out.println(eee);
		
		// valueOf(10), valueOf(5.5) : 기본타입을 문자열로 변환
		String fff = String.valueOf(10); // int -> String
		System.out.println(fff);
		String ggg = String.valueOf(5.5);	// double -> String
		System.out.println(ggg);

	}

}
