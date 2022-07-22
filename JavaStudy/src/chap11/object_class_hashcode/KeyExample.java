package chap11.object_class_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// HashMap 컬렉션을 이용해서 사람이름을 저장. (Key, String) 쌍으로 데이터를 저장한다.
		// HashMap 객체를 생성
		HashMap<Key,String> hashMap = new HashMap<Key, String>();
		// 홍길동을 저장 : 저장할때 put 메소드를 사용
		// Key = new Key(1) , 클래스만든거 , 값 = 홍길동
		hashMap.put(new Key(1), "홍길동");
		// hashMap 에서 데이터를 꺼내올 떄 get 메소드를 사용하고 Key 값을 매개변수로 준다
		String value = hashMap.get(new Key(1));
		System.out.println(value); // -> null -> 키값을 못찾음 -> 키값이 다르다.
		// 논리적 동등비교를 하는 방법 
		// 두객체(new Key(1)의 hashCode()가 같고, equals() 가 같아야 논리적으로 동등한것
		// 논리적으로 동등한 값을 만들기 위해 hashCode 와 equals 메소드를 재정의해야함.
		
	}

}
