package chap11.random;

import java.util.Random;

public class RandomExample2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int dice = rand.nextInt(11)+10;	// rand.nextInt(11) -> ( 0 ~ 10 ) 양쪽에 + 10 -> 10 ~ 20
		System.out.println(dice);

	}

}
