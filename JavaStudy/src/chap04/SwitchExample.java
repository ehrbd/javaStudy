//	조건문 : swich문
//	정형화 되어 있으므로 if 문보다는 효과적(보기도 좋음) 
//	스위치문의 조건식에는 변수를 사용 : 셀 수 있는 것 (byte, char, int, long)
//	float, double -> 오차가 있으므로 정확한 것을 비교하기 어려움
//	문자열은 가능 -> 비교할 수 있으므로
//	age >= 18 && age <20 : X , 하나의 값만 가능

package chap04;

public class SwitchExample {

	public static void main(String[] args) {
		int menu = 1;		// 키보드로 부터 입력을 받는다
							// 메뉴에 따라 다른 처리를 할 경우 1: 통장 개설. 2: 입금. 3: 출금. 4: 잔고출력 5: 종료
		switch(menu) {
		case 1:{							// 변수의 범위는 중괄호로 정하면 가능
			
			int num1 = 10;
			System.out.println("통장 개설");
			break;								// 실행문을 벗어난다.
		}									// 브레이크문이 없으면 case 2도 실행이 되므로 주의
		case 2:
			int num1;							// 중괄호 없으면 오류 발생
			System.out.println("입금");
			break;
		case 3: 
			System.out.println("출금");
			break;
		case 4:
			System.out.println("잔고");
		case 5:									// 4,5인 경우 실행 (break; 안써서)
			System.out.println("종료");
			break;
		default:
			break;
		}
		
		
	}

}
