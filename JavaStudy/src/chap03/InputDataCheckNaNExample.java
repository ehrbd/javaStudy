package chap03;

public class InputDataCheckNaNExample {

	public static void main(String[] args) {
		String userInput = "NaN";					// 문자열로 입력을 받아
		double val = Double.valueOf(userInput);		// 문자열을 double로 변환 (NaN : not a number)
		double currentBalance = 10000.0;
		currentBalance += val;
		System.out.println(currentBalance);			// NaN + 소수 = NaN이 된다. -> 잔고가 무한대가 됨.
	}
	
//	손님 입장에서는 NaN 입력했으므로 성공
//	은행원,개발자 입장에서는 이런 경우를 방지
	
//	NaN 여부 검사하여 처리 필요
	
}
