package chap07.field_polymorphism;

public class CarExample {
	//새로 NexenTire 객체를 추가
	// CarExample 클래스를 수정
	// NexenTire 가 추가되어 동작을 한다
	// 다른 클래스는 변경되지 않음
	// 유지보수가 편하다

	public static void main(String[] args) {
		Car car = new Car(new NexenTire("앞왼쪽",6),new HankookTire("앞오른쪽",2),
					new KumhoTire("뒤왼쪽",3),new KumhoTire("뒤오른쪽",4));
				for(int i=1; i<=5; i++){
					int problemLocation = car.run();
					switch(problemLocation){
					case 1:
						System.out.println("앞왼쪽NexenTire로교체");
						car.frontLeftTire=new NexenTire("앞왼쪽",15);
						break;
					case 2:
						System.out.println("앞오른쪽KumhoTire로교체");
						car.frontRightTire=new KumhoTire("앞오른쪽",13);
						break;
					case 3:
						System.out.println("뒤왼쪽HankookTire로교체");
						car.backLeftTire=new HankookTire("뒤왼쪽",14);
						break;
					case 4:
						System.out.println("뒤오른쪽KumhoTire로교체");
						car.backRightTire=new KumhoTire("뒤오른쪽",17);
						break;
					}
				System.out.println("----------------------------------------");
				
				}

	}

}
