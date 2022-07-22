package chap03;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";					
		double val = Double.valueOf(userInput);		
		double currentBalance = 10000.0;
		if(Double.isNaN(val)) {					// 고객이 입금한 돈이 NaN 인지를 확인하는 절차 추가
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;							// NaN이 입력되더라도 영향이 없도록 입력값을 0.0으로 설정			
		}	
		currentBalance += val;
		System.out.println(currentBalance);		
	}
	
	

}
