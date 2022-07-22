package chap07.exam.exercise7_1;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for(int i = 0; i< cards.length; i++) {
//			i = 0~19 -> i 를 이용해서 num을 만들어야 한다.
			int num = i % 10 + 1;
			boolean isKwang = (i<10 && (num == 1 || num == 3 || num ==8 ));			
			cards[i] = new SutdaCard(num, isKwang);
			
		}
		
		
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

//	default 생성자 : 1K
	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

//	모든 클래스는 object 클래스를 상속
//	object 클래스에는 toString 이라는 메소드가 존재
//	System.out.println(dog); dog.toString() 을 출력한다.
	public String toString() {			//	클래스의 정보 출력하는 메소드
		return num + (isKwang ? "K" : "");
	}
}

class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
	}
}
