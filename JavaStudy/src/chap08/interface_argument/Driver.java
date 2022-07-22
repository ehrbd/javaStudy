package chap08.interface_argument;

public class Driver {
	public void	drive (Vehicle vehicle) {		// Bus -> 요금, Taxi 
		// 인터페이스 = 구현객체
		// 인터페이스로 접근할 수 있는 메소드 : 인터페이스가 정의한 메소드
		// 버스면 요금 
		// 대입된 구현객체가 무엇인지 검사
		// 대입받은 구현객체가 다른 것으로 타입변환을하면 ClassCastException 이 발생 : Taxi -> Bus
		
		if (vehicle instanceof Bus) {
			// 버스가 정의한 메소드에 접근하기 위해서 강제 타입변환을 한다.
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
		System.out.println();
	}
}
