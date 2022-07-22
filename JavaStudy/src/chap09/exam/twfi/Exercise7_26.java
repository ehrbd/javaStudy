package chap09.exam.twfi;

class Outer2 {
	static class Inner {
		int iv = 200;
	}
}

class Exercise7_26 {
	public static void main(String[] args) {
		Outer2.Inner ouin = new Outer2.Inner();
		System.out.println(ouin.iv);
	}
}
