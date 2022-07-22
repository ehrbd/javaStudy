package chap05;

public class AddExample {

	public static void main(String[] args) {
//		AddExample 프로그램 실행할 때 파라미터로 데이터로 입력받을 수 있다. => String [] args -> 배열
//		cmd 창에서 java AddExample 10 20 -> 더한 결과를 출력하는 프로그램
//		cmd 창으로부터 더할 두개의 수를 입력받을수 있음
		if(args.length != 2) {
			System.out.println("Usage: java AddExample 10 20");			// 사용법 안내를 출력
			System.	exit(1);
		}
		System.out.println("args[0] = " + args[0]);
		System.out.println("args[1] = " + args[1]);
		System.out.println();
		int num1 = Integer.parseInt(args[0]) ; 							// 문자열을 int로 변환
		int num2 = Integer.parseInt(args[1]);
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
