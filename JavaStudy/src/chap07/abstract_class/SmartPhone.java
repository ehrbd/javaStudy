package chap07.abstract_class;

// 추상클래스를 상속받아 구체화 한다.

public class SmartPhone extends Phone {
	int volume;
	
	// 생성자
	public SmartPhone(String owner) {
		super(owner);
	}

	// 추상메소드는 반드시 재정의 내려줘야함. ( 안하면 얘도 추상 메소드 됨. ) 
	@Override
	public void setVolum(int volume) {
		this.volume = volume;
		System.out.println("현재볼륨 : " + volume);
	}

	// 자식의 메소드를 추가
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}
