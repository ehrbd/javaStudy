//주민등록번호를 숫자로 저장하고자 한다 이 값을 저장하기 위해서는 어떤 자료형 .
//(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
//초기화 하는 한 줄의 코드를 적으시오.
//13자리를 저장할 수 있는 데이터 타입이 무엇인가?

package chap02.exam;

public class problem2_2 {

	public static void main(String[] args) {
		System.out.println("int로 출력할 수 있는 가장 큰 수 : " + Integer.MAX_VALUE);
		System.out.println("long으로 출력할 수 있는 가장 큰 수 : " + Long.MAX_VALUE);
		
		long regNo = 1111112222222L;
		System.out.println(regNo);
	}

}
