package chap04;

import java.io.IOException;

public class WhileKeyControlExample {
//	규칙 1: 증속, 2: 감속, 3: 중지
//	반복문을 무조건 계속 반복을 하고, 어떤 조건이 되면 반복문을 종료하도록 flag를 선언
	public static void main(String[] args) throws IOException {		// JVM 이 예외처리를 해달라
		boolean run = true;											// 반복 조건에 들어가는 변수
		int speed = 0;												// 자동차의 속도
		int keyCode = 0;											// 사용자로부터 키보드 입력값을 저장
		while(run) {							
//			반복실행하는 실행문 , 현재는 무한 반복 : 곤란 -> 어떤 조건에서 종료되도록 프로그램을 한다. 
//			IO 동작은 키보드로부터 엔터키가 입력이 되어야 입력을 시작 (불필요한 입력이 발생 : 13 ('\r'), 10('\n')
			if(keyCode != 13 && keyCode != 10) {					// 키보드로 입력 받을 때 엔터키를 입력해야 동작
				System.out.println("------------------------");
				System.out.println("1. 증속 ㅣ 2. 감속 ㅣ 3. 중지 ");
				System.out.println("------------------------");
				System.out.print("선택 : ");							// print 메소드를 사용 : 커서를 유지하려고
			}
			keyCode = System.in.read();								// 키보드로 부터 입력 -> IO 동작을 하는 경우는 예외가 발생할 수 있다.
																	// 예외처리를 해주어야 한다.
			if(keyCode == '1') {									// ascii 49 , 50 , 51
				speed++;
				System.out.println("현재속도 = " + speed);
			}else if(keyCode == '2'){
				if(speed ==0) {
					System.out.println("감속할 수 없습니다.");
					continue;										// 밑의 프로그램부분을 실행하지 않고 다음 조건식으로 진행
				}
				speed--;
				System.out.println("현재속도 = " + speed);
			}else if(keyCode == '3'){
//				반복문을 벗어나려면 break문을 써도 되지만, run = false 
				run = false; // -> 반복문을 벗어나게
			}
					
		}
		System.out.println("프로그램 종료");
		
//		do-while문을 사용할 수 있다. -> 무조건 동작을 하려면 키보드로부터 메뉴를 입력 받아야하기 때문
	}

}
