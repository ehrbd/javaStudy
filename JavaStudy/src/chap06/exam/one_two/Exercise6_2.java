package chap06.exam.one_two;

public class Exercise6_2 {
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		SutdaCard card3 = new SutdaCard(20, false);
		System.out.println(card1.info());
		System.out.println(card2.info());
		System.out.println(card3.info());
	}
}