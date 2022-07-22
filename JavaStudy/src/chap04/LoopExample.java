/*
 * 반복실행
 * for문, while문, do-while문
 * for문 : 정해진 일정 횟수를 반복 실행할 때 많이 사용
 * while문 : 무한반복하고 특정 조건에서 종료하고자 할 때
 * do-while문 : 무조건 한번은 실행문을 실행할 때 
 */

package chap04;

public class LoopExample {
//	1~100까지의 합을 구한다.
	public static void main(String[] args) {
		int sum = 0;							// 합을 저장하기 위한 변수를 선언하고 0으로 초기화 , 곱하기 계속할때는 1로 ㅇㅇ
		for(int i = 1; i <= 100; i++) {			// int i = 1: 초기치를 설정
//			1) 인덱스 (i, j, k, l, ,m, n..-> 관습)
//			2) i =< 100 : 조건식 (반복여부를 결정) -> 조건식을 만족하면 실행믄을 수행 만족하지않으면 반복문 종료
//			3) 실행문 작성
//			4) i++는 증감식이라 하고 반복 수행문을 실행한 다음에 수행이 된다. -> 2번으로 다시 반복적으로 수행
			
			sum += i;
		}
		
		System.out.println("1~100까지의 합 : " + sum);
				
//		while문 사용할 경우
		
		sum = 0;
		int j = 1;
		while (j <= 100) {
			sum += j;
			j++;
		}
		
		System.out.println("1~100까지의 합 : " + sum);
			
	}

}
