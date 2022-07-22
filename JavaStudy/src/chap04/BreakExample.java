package chap04;

public class BreakExample {

	public static void main(String[] args) {
//		Break문 - 반복문(블럭-범위)과 같이 사용
//		범위(시작/끝)를 벗어나고자 할 떄 사용한다.
		
		label: for(int i=2; i<10; i++) { 			// i: 단
			System.out.println(i + "단");
			for(int j= 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
//				n단 -> n*n까지만 출력하고자함.
				if(i == j) {
//					반복문을 벗어나면 됨.
					break label;					// 나를 둘러싼 반복문 하나를 벗어나는것.
											// 밖에 있는 첫 for문까지 벗어나고 싶을때
				}
			}
			System.out.println();
			
		}

	}

}
