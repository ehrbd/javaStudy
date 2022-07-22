//	삼항식 : 항이 3개 
//	형식 : (조건) ? '참일 때 수행문' : '거짓일 때 수행문'
//	if else문 보다 간결하게 하나의 열로 표현할 수 있다.

package chap03;

public class TriOperandExample {

	public static void main(String[] args) {
		int i1 = (3 > 5) ? 3 : 5;
		System.out.println(i1);
		
//		if else 사용시
		int value = 3;
		if (value>5) {
			i1 = 3;
		}else {
			i1 = 5;
		}
		
//		추가
		int value2 = 10;
		int result = (value >3) ? (value2<10) ? 10 : 20 : -20; // int result = (value >3) ? ((value2<10) ? 10 : 20) : -20;
		
		if(value>3) {
			if(value2<10) {
				result = 10;
			}else {
				result = 20;
			}
			
		}else {
			result = -20;
		}
	
	}

}
