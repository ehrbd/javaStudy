//	두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
package chap04.exam;

public class Exercise4_6 {

	public static void main(String[] args) {
		int a;
		int b;
		for (a = 1; a <=6 ; a++) {
			for (b =1; b<=6; b++) {
				if(a+b==6) {
					System.out.println(a + ", " + b);
				}
				
			}
		
			
		}
			
		
	}

}
