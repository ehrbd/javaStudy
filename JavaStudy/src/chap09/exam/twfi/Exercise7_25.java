package chap09.exam.twfi;

class Outer {
	// 인스턴스 멤버 클래스 : Outer 객체가 생성되어야만 존재 -> Outer 객체를 생성해야함
	class Inner {
		// 인스턴스 멤버 필드 -> Inner 객체가 생성되어야만 존재
		int iv = 100;
	}
}

class Exercise7_25 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner ouin = outer.new Inner();
		System.out.println(ouin.iv); 
	}
}
