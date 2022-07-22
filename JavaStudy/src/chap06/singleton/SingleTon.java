//	싱글톤 : 어플리케이션 내에서  객체가 하나만 존재하는 것
// 	보통은 공통데이터를 관리(저장, 검색)하거나 시간을 저장
//  여러개의 인스턴스를 만들지 말고 하나에서 관리를 할 때 사용
//	싱글톤을 만드는 방법 : 객체가 하나만 존재
//	다른 클래스에서 객체를 생성할 수 없음 -> 생성자가 private 생성자를 사용

package chap06.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingleTon {
//	생성자 : private 접근제한자를 가진다. -> 다른클래스에서 생성자를 호출할 수 없다.
	private SingleTon() {	}
//	객체의 생성은 자기자신이 한다.
//	정적필드 , 접근제한자 private -> 다른클래스는 접근 불가 ( 수정 불가 )
	private static SingleTon inst = null;	//참조 변수 -> 참조하지않는다.
//	자신이 참조할수 있는 참조변수 만들기 instance => 객체를 만들지않게 static 선언
	
//	객체의 주소를 얻을 수 있는 Getter를 제공
//	 정적메소드 -> 객체의 생성없이 접근할 수 있도록 정적ㅁ ㅔ소드를 만든다
//	 접근제한자 -> public 어느 클래스 든지 접근할수 있도록
	
//	 객체의 생성없이 접근하기위해 static 
	public static SingleTon getInstance() {
		if(inst == null) {
			inst = new SingleTon();			// 객체가 없다면  객체를 생성 => 하나만 존재
									// 객체 Single톤에 접고근 할 수 있는 주소를 반환(제공)
			return inst;
			} return inst;
		
		// 어떤데이터를 저장하거나 
		List<String> list = new ArrayList<String>();}
		
		// 인스턴스 필드
		private int value;
		
		// 인스턴스 메소드 : Getter
		public int getValue() {
			return value;
			
		}
		
		// 인스턴스 메소드 : Setter -> 필드의 값을 매개변수로 주어진 값으로 변경하는 메소드
		public void setValue(int value) {
			this.value = value;
		}
	

	
}
}

