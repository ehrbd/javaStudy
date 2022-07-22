//연산을 할때 Overflow 가 발생활 수 있다.


package chap03;

public class CheckOverflowExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int result = x * y;													// 12자리
		System.out.println("int로 출력할 수 있는 최대값: " + Integer.MAX_VALUE);	// 10자리 
		System.out.println("result: " + result);							// 원하는 결과 도출 X
		
//		프로그램은 직접 계산을 할 수도 있지만, 값의 범위를 판단하거나 메소드를 사용하서 처리 -> 메소드 내에서는 여러가지 프로그램으로 검사를 할 수가 있다.
		
		
//		↓ try=catch 문에서 예외 처리를 함.
		try {
			int result2 = safeAdd(200000000, 2000000000);
			System.out.println(result2);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산 할 수 없음.");
		}
		
	}

	public static int safeAdd(int left, int right) {
//		Integer.Min_VALUE <= left + right <= Integer.Max_VALUE -> OK 정상
//		위의 경우가 아니면 에러가 발생
//		left = Integer.MAX+VALUE - right
//		left = Integer.MIN_VALUE - right
		
		if(right>0) { 		// right 양수
			if(left>(Integer.MAX_VALUE - right)) {					// left > Integer.MAX_VALUE - right -> left + right > Integer.MAX_VALUE
				throw new ArithmeticException("오버플로우 발생");		// ↑ IF문에 직접 넣으면 오류 남. 이유) left + right가 맥스값 초과시 (-)값이 나올수 있기때문.
//				throw : 예외처리를 safeAdd 메소드를 호출한 곳에서 처리를 하도록 던져버림 (요청함)
			}
		}else{				// right 음수 or 0
			if (left<(Integer.MIN_VALUE - right)) {					// left < Integer.MIN_VALUE - right -> left + right < Integer.MIN_VALUE
				throw new ArithmeticException("오버플로우 발생");  
			}
			
		
		}
		return left+right;
	}

}