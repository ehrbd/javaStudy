package chap11.object_clone_deep;

import java.util.Arrays;

public class Member implements Cloneable {
	
	//필드 : 참조변수와 배열 -> 깊은 복제
	public String name;
	public int age;
	public int[] scores;		// 배열
	public Car car;				// 객체
	public Member(String name, int age, int[] scores, Car car) {
		
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	// 깊은 복제를 하려면 clone() 를 재정의 해줘야 한다.
	
	//object 클래스가 제공하는 clone() 메소드 -> 얕은복제
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 깊은 복제를 위해서 재정의
		// 배열을 생성, car객체도 생성. 참조변수의 주소를 변경(배열, car)
		Member cloned = (Member)super.clone();	// 얕은 복제한 Member 객체
		
		cloned.scores = Arrays.copyOf(scores, scores.length); // 배열을 생성하고 참조변수를 변경
		cloned.car = new Car(car.model);	// 새로운 Car 객체 생성
		
		return cloned;
		
		
//		return super.clone(); -> 얕은복제
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return cloned;
	
	}
}
