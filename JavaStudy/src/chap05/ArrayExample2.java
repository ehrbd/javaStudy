package chap05;

public class ArrayExample2 {

	public static void main(String[] args) {
		boolean[] bArr = new boolean[3];		// boolean 데이터 타입의 배열 -> false로 초기화
		byte[] byteArr = new byte[5];			// 초기값 0 : 정수는 0
		float[] fArr = new float[4];			// 초기값 0.0f double은 0.0
				
		
//		enhanced for문
//		for(데이터타입 변수이름 : 배열 / collection) {}
		for (boolean flag : bArr) {					// 배열의 길이 만큼 반복실행 
//			실행문에서는 기본데이터타입 flag로 접근
			System.out.println(flag);
			
		}
		
		int[] scores = { 100,200,300,400,500};
		
		int sum = 0;
		for (int score : scores) {
			sum += score;
			System.out.println(sum);
		}

	}

}
