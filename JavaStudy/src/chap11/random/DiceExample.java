package chap11.random;

import java.util.Random;

public class DiceExample {
	public static void main(String[] args) {
		// 주사위던지기
		Random rand = new Random();
		int dice = 
				rand.nextInt(6)+1
				;
		System.out.println(dice);
	}
}
