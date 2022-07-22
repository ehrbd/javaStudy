package chap11.random;

import java.util.Arrays;
import java.util.Random;

// 난수 발생 : Math.random() : 0.0 <= x < 1 double값
/* Random 클래스 : seed 를 사용 가능
 * Random rand = new Random();
 * 
 */
public class RandomExample {

	public static void main(String[] args) {
		
		Random rand1 = new Random(0L); // seed = 0L , seed값에 따라 값이 달라짐. 아무것도 입력하지 않으면 현재시간을 토대로 난수발생 (타임테이블)
		System.out.println(rand1.nextInt());	
		
		
		// 선택번호
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.print("선택번호:");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		// 당첨번호
		int[] winningNumber = new int[6];
		random = new Random();
		System.out.print("당첨번호:");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();

		// 당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨여부:");
		if (result) {
			System.out.println("1등에당첨되셨습니다.");
		} else {
			System.out.println("당첨되지않았습니다.");
		}
	}

}
