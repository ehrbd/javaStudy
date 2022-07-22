package chap07.abstract_class;

public abstract class DmbPhone extends Phone {

	public DmbPhone(String owner) {
		super(owner);
	}

	// 추상 메소드는 재정의를 해줘야 한다.
	// 재정의하지 않으면 추상메소드가 된다. -> abstract 키워드를 메소드에 붙여줘야함.
	// 추상메소드가 있는 클래스는 추상클래스이다. -> abstract 키워드를 클래스에 붙여준다.
	
	@Override
	public abstract void setVolum(int volume);
}
