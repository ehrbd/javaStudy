//		continue문 : 반복문과 같이 사용된다.
//		반복문(조건식) {
//			실행문1;
//			if(조건) {
//				실행문2는 생략하고 계속 반복문 실행하고싶음
//				continue문을 사용
//			}
//			실행문2
//		}

package chap04;

public class ContinueExample {

	public static void main(String[] args) {
		int i;
		for (i = 2; i < 10; i++) {
			if (i % 2 == 0) {				// 짝수단
				continue;
			}
			System.out.println(i + "단");
			int j;
			for (j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		
//		반복문이 종료되고 나서 변수 i를 사용하고 싶을 때
		System.out.println("\ni = " + i);
		
	}

}
