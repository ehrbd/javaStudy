package chap11.string_method;

public class IndexOfExample {
	public static void main(String[] args) {
		
		// indexOf("자바")
		String subject = "자바 프로그래밍은 자바를 프로그램하는 것이다.";
		int index1 = subject.indexOf("자바");
		System.out.println(index1);
		
		int index2 = subject.indexOf("자바", index1 + "자바".length());
		System.out.println(index2);
		
		// lastIndexOf
		int index3 = subject.lastIndexOf("자바");
		System.out.println(index3);
		
		int index4 = subject.lastIndexOf("자바",  5);
		System.out.println(index4);
	}	
}
