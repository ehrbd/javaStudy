package chap11.string_method;

public class Replace {

	public static void main(String[] args) {
		// replace : 문자열을 대체-> 기존 문자열은 그대로 존재하고, 새로운 대체된 문자열이 생성
		String oldStr = "자바 프로그램 자바";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		String newStr2 = oldStr.replaceFirst("자바", "JAVA");
		System.out.println(newStr2);
	}
	

}
