package chap11.object_class_hashcode;

public class Key {		// HashMap 컬렉션의 키로 사용되는 객체
	// 유일하게 구별할 수 있는 값을 사용 : number 가 같으면 동일하다.
	public int number;
	public Key(int number) {
		this.number=number;
	}
	
//	논리적 동등 비교를 위해서는 equals() 메소드와 hashCode() 메소드를 재정의가 필요함. 
// equals 메소드 재정의
	@Override
		public boolean equals(Object obj) {
			if(obj instanceof Key) {	// obj가 Key 객체이면
				Key key = (Key)obj;		// 강제 타입 변환
				if(number == key.number) { // 같으면 true가 반환, 다르면 false가 반환 -> 객체는 이미 같다고 판단 후, 입력된 number가 같은지 보는것 
					return true;
				}
			}
			return false;	// 객체가 다르다고 판단하여 , number가 같은지도 판단 X
		}
	
//	hashCode() 메소드를 재정의
	@Override
		public int hashCode() {
		
			return number;	// number가 같으면 hashCode값이 같다.
		}
	
}
