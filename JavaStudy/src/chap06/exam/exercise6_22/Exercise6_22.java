package chap06.exam.exercise6_22;

class Exercise6_22 {


	static boolean isNumber(String str) {
				
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				return true;
			}else {
				return false;
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까 ? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까 ? " + isNumber(str));
	}
}