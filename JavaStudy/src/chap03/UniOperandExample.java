// 단항 연산자
// 부호 연산자 : +, - 
// 결과는 int 형태가 된다. -> CPU 내에서 레지스터 32비트로 동작하기 때문.
// long -> long 

package chap03;

public class UniOperandExample {
	
	public static void main(String[] args) {
		short s1 = 100;
//		short s2 = -s1; 		// 에러 발생 : -s1 은 int 이다. int -> short 손실이 발생하므로 에러 발생
		int i1 = -s1;			// int에 저장해야 한다.
		short s3 = (short)-s1;	// 강제 타입 변환을 해줘야 한다.
//		short s4 = +s1;			// 에러발생 : +s1도 int 이다. (CPU 내에서 32비트로 동작을 하기 때문)
//		(+) -> 1을 곱한 것과 같다.  (-) -> -1을 곱한것과 같다. (메모리에 있는 데이터를 cpu로 읽어와야한다. 이때 32비트 레지스터에 저장)
		
//		증감 연산자 : ++, --
		int x1 = 10;
		int x2 = 10;
		
		int y1 = x1++ + 10;		// 변수뒤에 증감 연산자를 위치	
		System.out.println("x1=" + x1 + ", y1=" + y1);
//		변수 뒤에 증감 연산자가 있을 경우, 먼저 연산이 이루어지고, 이후에 x1이 증가된다.
		
		int y2 = ++x2 + 10;		// 변수앞에 증감 연산자를 위치
		System.out.println("x2=" + x2 + ", y2=" + y2);
//		변수 앞에 증감 연산자가 있을 경우, 먼저 x1이 증가하고, 이후에 연산이 이루어진다.

		int x3 = 10;
		int x4 = x3;
		
		int y3 = x3-- + 10;
		System.out.println("y3=" + y3 + ", x3=" +x3);
		
		int y4 = --x4 + 10;
		System.out.println("y4=" + y4 + ", x4=" +x4);
		
//		논리 부정 연산자 : !
		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);
		
//		비트 반전 연산자 : ~ 틸트 -> 1의 보수를 구하는 것과 같다.
//		각 비트를 0이면 1로, 1이면 0으로 반전시키는 것.
//		음수 : 양수의 2의 보수 = 1의 보수 + 1 \
		int i100 = 10;				// 00000000 00000000 00000000 00001010
		int inverse = ~i100;		// 11111111 11111111 11111111 11110101
		System.out.println(~i100);	
		
		byte b1 = 10;
//		byte b2 = ~b1;				// 에러 발생 : ~b1은 int
		byte b2 = (byte)~b1;				// 강제 타입변환을 해야한다.
		int i101 = ~b1;
		
		
		
		
	}

}
