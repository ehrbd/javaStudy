//	논리 연산자 : && , &(AND), ||, |(or), ^(NOR), !(NOT)
package chap03;

public class LogicalOperandExample {

	public static void main(String[] args) {
//		논리곱(AND) : 두가지 조건을 모두 만족해야한다. T(A) T(B) -> T
//		&& : A가 false 면, B가 true 인지 false 인지 판단을 하지 않는다.
//		&  : A가 false 이더라도, B가 true 인지 false 인지 판단을 한다.  
		
		int a = 1; 
		int b = 2;
		
		if((a = 4 + 4) < 0 && (b = 3 + 3) > 0) {
			System.out.println("a=" + a + ", b= " + b); // 어짜피 실행은 안되서 대충해도됨
		}else{ // 실행
			System.out.println("a=" + a + ", b= " + b);
		}
		
		int a2 = 1;
		int b2 = 2;
		
		if((a = 4 + 4) < 0 & (b = 3 + 3) > 0) {
			System.out.println("a=" + a + ", b= " + b); // 어짜피 실행은 안되서 대충해도됨
		}else {
			System.out.println("a=" + a + ", b= " + b);
		}
		
	}

}
