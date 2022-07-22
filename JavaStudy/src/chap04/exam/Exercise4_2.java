// 1부터 20까지의 정수 중에서2 또는3 의 배수가 아닌 수의 총합을 구하
package chap04.exam;

public class Exercise4_2 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			if (!(i % 2 == 0 || i % 3 == 0)) {
				sum += i;
			}
		
		}
		System.out.println("합 : " + sum);
	}

}

	