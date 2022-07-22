package chap02;

public class PromotionExample {

	public static void main(String[] args) {
		// 타입변환 : 데이터타입을 다른 타입으로 변환하는 것
		// 자동 타입 변환 (묵시적) : Promotion 
		// 강제 타입 변환 (명시적) : Casting
		// 정수 : byte, short, int, long, char(문자)
	
		
		int i1;			// 4바이트 (32비트)
		byte b1 = 10;	// 1바이트 (8비트)
		
		// 자동타입변환 발생하는 경우 : 작은타입의 데이터를 큰 타입에 대입하는 경우 -> 손실없이 데이터 저장 가능
		i1 = b1; 		// 왼쪽 int(+-20억) = 오른쪽 byte(-128~127)
		
		// 어떤 경우에 자동타입 변환이 가능한가? byte -> short -> int -> long -> float -> double but, char = byte(X) -> char 음수X 
		
		// 강제타입변환 : 데이터의 손실이 발생할 수 있다. (큰 데이터 타입의 데이터를 작은 데이터 타입의 데이터에 대입하는 경우)
		// 손실이 발생하더라도 내가 어떻게 발생하는지 알기 때문에 알고서 사용할 경우는 강제로 타입 변환을 사용한다.
		
		int i2 = 0x12345678; 
		byte b2;
		
		//자동타입변환
		//byte b2 = i2;		// 에러 발생 (32bit -> 8bit) 자동타입변환 불가
		
		// 강제 타입 변환
		b2 = (byte)i2;	
		// 에러가 발생하지 않음 -> 솔실이 발생한다. 손실이 발생하는 것을 알고 사용해야
		// ex)알고보니 데이터가 하위 7비트만 쓰더라, 그러니 손실이 발생되지 않음...
		// ex)32bit 데이터 중에 하위 8비트만 알고 싶은 경우
		
		
	}

}
