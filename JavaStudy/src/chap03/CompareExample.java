package chap03;

public class CompareExample {

	public static void main(String[] args) {
//		비교 연산을 할 떄 연산자의 타입이 서로 다른 경우 (부동소수점을 사용하는 경우) 주의
//		float, double -> 오차가 다르다. -> 피연산자를 통일을 하거나 아니면 정수로 변환을 하여 비교를 수행한다.
		int v2 = 1;
		double v3 = 1.0;
		
		System.out.println(v2 == v3);
		
		
		double v4 = 0.1;				// 오차 발생
		float v5 = 0.1f;				// 오차 발생
			
		System.out.println(v4 == v5);	// 오차가 다르다. -> false
		
		
		long l4 = Double.doubleToLongBits(v4);
		System.out.println(Long.toBinaryString(l4));
		
		int i5 = Float.floatToIntBits(v5);
		System.out.println(Integer.toBinaryString(i5));
//		생각했던 결과가 안나온다. -> 오차가 다르기 떄문에 -> float 으로 변환을 해서 하거나, int로 변환
		
		System.out.println((float)v4 == v5);
		System.out.println((int)(v4 * 10) == (int)(v5 * 10));
		
		System.out.println(v4 == (double)v5);	// v4 == v5 와 같을 수 밖에 없음.
		
	
		
		
	}

}
