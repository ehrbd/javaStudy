//	1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램
//	math.random(); 사용해서 다를수있다.

package chap05.exam;

public class Exercise5_5 {

	public static void main(String[] args) {
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		

		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length); // 랜덤값
			int tmp = 0;
			
//			랜덤값을 생성해서 저장한다가 아니라 원래 있던 값들을 랜덤하게 재정렬한다라고 생각하고 접근
			
			tmp = ballArr[i];					// tmp = 임시저장소 ㅇㅇ
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
				
		}

		System.arraycopy(ballArr, 0, ball3, 0, 3);

		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i] + " ");

		}
	}

}
// tmp = 1 -> ballArr[0] = 랜덤값
//중복안되게  tmp = 
// tmp = 2 -> ballArr[1] = 랜덤값.
