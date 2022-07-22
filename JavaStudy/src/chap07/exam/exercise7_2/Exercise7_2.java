package chap07.exam.exercise7_2;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10 && (num == 1 || num == 3 || num == 8));
			cards[i] = new SutdaCard(num, isKwang);
		}

	}
	
	void shuffle() {
		for(int i=0; i<20; i++) {
			int j = (int)(Math.random() * cards.length);
			SutdaCard tmp = cards[i];
			cards[i] = cards[j]; 
			cards[j] = tmp;		
		}
		
	}
	
	SutdaCard pick(int index) {
		if(index <0 || index >= CARD_NUM) {
			return null;
		}else
			return cards[index];
	}
	
	SutdaCard pick() {
		
		return cards[(int)(Math.random() * cards.length)];
	}
	
		
	
	
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() { // 클래스의 정보 출력하는 메소드
		return num + (isKwang ? "K" : "");
	}
}

class Exercise7_2 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
