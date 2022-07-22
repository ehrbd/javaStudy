package chap02;

public class FloatExample {

		public static void main(String[] args)	{
			float f1 = 9.1234567f; // 소수 - > 32bit : 부호비트 1, 지수 8비트, 가수 23비트
			// 컴퓨터에서 어떻게 저장되어 있는지 출력을 해보자
			int i; // 32bit (같은 비트수를 가진다)
			i = Float.floatToIntBits(f1); // float로 저장된 것을 int 형태로 저장함.
			System.out.printf("%f\n", f1); // system.out.println : '\n'을 붙여서 출력 system.out.printf : 서식형태로 출력할때 printf 메소드를 사용
			System.out.printf("0%s\n", Integer.toBinaryString(i)); // 옆에 있는 0비트를 생략하지 않도록  부호비트 0을 출력하기 위해서 0을 %앞에 써줌.	
					
			float f2 = -9.1234567f;
			int j = Float.floatToIntBits(f2);
			System.out.printf("%f\n", f2);
			System.out.printf("%32s\n", Integer.toBinaryString(j)); // %32s : 문자열 32개를 출력 / s-> String s 32-> 32개
		}
}
