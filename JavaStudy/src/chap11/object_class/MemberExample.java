package chap11.object_class;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1 == obj2) {			// 물리적으로 같은 객체 인지 비교
			System.out.println("물리적으로 같은 객체 입니다.");
			
		} else {
			System.out.println("물리적으로 다른 객체 입니다.");
		}
		if(obj1.equals(obj2)) {		// 논리적으로 같은 객체 인지 비교
			System.out.println("물리적으로 같은 객체 입니다.");
			
		} else {
			System.out.println("물리적으로 다른 객체 입니다.");
		}
		if(obj1 == obj3) {			// 물리적으로 같은 객체 인지 비교
			System.out.println("물리적으로 같은 객체 입니다.");
			
		} else {
			System.out.println("물리적으로 다른 객체 입니다.");
		}
		if(obj1.equals(obj3)) {		// 논리적으로 같은 객체 인지 비교
			System.out.println("물리적으로 같은 객체 입니다.");
			
		} else {
			System.out.println("물리적으로 다른 객체 입니다.");
		}

	}

}
