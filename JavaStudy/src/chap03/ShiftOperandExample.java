//	비트 이동 연산자 : >> , << , >>>

package chap03;

public class ShiftOperandExample {

	public static void main(String[] args) {
//		>> : 부호비트에 무엇인가 들어와야 한다. 부호비트 자신이 다시 들어온다. -> 부호비트는 유지된다. -> 2로 나눈것과 동일하다.
//		<< : 0번째 비트에 무언가 들어와야 한다. 0이 들어온다 -> 2를 곱한것과 동일하다
//		>>>: 부호비트에 무언가 들어와야 한다. 0이 들어온다. -> 부호비트가 유지가 안되고 양수가 된다.
		
		int i1 = 4;
		int i2 = i1 >> 2;	// 4로 나눈것과 같다 -> i1은 변화 X
		int i3 = i1 << 3;	// 8을 곱한것과 같다 -> i1은 변화 X
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		i1 <<= 3; 			// i1 = i1 << 2;
		System.out.println(i1); 
		
		
	}

	
}
