package chap08.interface_definion;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl.changeBattery();		// 인터페이스 이름을 사용해서 접근 ( 정적메소드 )
		RemoteControl rc = new Television();	// 자동타입변환 인터페이스 = 구현객체
		// 구현객체가 인터페이스를 구현했으므로 대입이 가능
		
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
	
/*
 * 익명 구현 객체
 * - 이름이 없는 구현객체
 * - class 파일 작성 하지 않음.
 * - 구현객체 이름으로 생성자를 사용할 수 없다. -> 인터페이스 이름으로 생성자를 대입
 * - 구현객체가 필요한 곳에 구현객체를 정의해준다
 * - .class 파일 생성됨. -> RemoteControlExample$n.class n(몇번쨰 익명개체이냐에따라 숫자) 
 */
		
		RemoteControl rc2 = new RemoteControl() {		// Television
			// 익명구현객체의 정의 부가 된다 -> Television.class 과 같은 정의부분이 된다.
			int volume;
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
				
			}

			@Override
			public void setVolume(int volume) {
				if(volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				}else if(volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				}else {
					this.volume = volume;
				}
				System.out.println("현재 TV볼륨 : " + volume);
				
			}		// 익명구현객체의 정의블럭
			
		};
		System.out.println();
		rc2.turnOn();
		rc2.setVolume(5);
		rc2.setMute(true);
		rc2.setMute(false);
		rc2.turnOff();
		
//		rc2.volume = 10; // 익명구현객체가 추가한 필드나 메소드에 접근할 수 없다.
//		인터페이스에 정의된것만 접근할 수 있음.
//		강제 타입변환을 할 수 없다. : 클래스 이름이 없기 떄문에
		

	}

}
