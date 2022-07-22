package chap10.exercise8_10;

class Exercise8_10 {
	public static void main(String[] args) {
		try {
			method1();
			System.out.println(6);
		} catch (Exception e) {
			System.out.println(7);
		}
	}

	static void method1() {
		try {
			method2();
			System.out.println(1);
		} catch (NullPointerException e) {
			System.out.println(2);
			throw e;
		} catch (Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		System.out.println(5);
	} // method1()

	static void method2() {
		throw new NullPointerException();
	}
}

/*
 * throws 없을시 : 2 -> 다시 발생 -> 4 -> 7
 * 
 * throws 있을시 : 2 -> 다시 발생 -> 4 -> 7
 */  
