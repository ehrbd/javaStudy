/*math.random() : 0~1사이의 double 값이 발생
 * 0 <= dice < 1소수
 * 1~6 사이의 임의의 정수
 * 6 : 0 <= 6 * dice < 6
 * 6 + 1 : 1 <= 6 * dice + 1 < 7 -> (int) 강제 형변환을 해주면 1~6까지의 정수
 */

package chap04.exam;

public class Exercise4_7 {

	public static void main(String[] args) {
		double d1 = Math.random();
		double d2 = d1 * 6;
		double d3 = d2 + 1;
		
		int value2 = (int) d3;
		int value = (int)(Math.random() * 6 + 1);
		System.out.println("value : " + value);
		System.out.println(Math.random());
		System.out.println("value2 : " + value2);
	}

}
