package chap07.abstract_class;

public class ktDMBPhone extends DmbPhone {
	int channel;
	
	public ktDMBPhone(String owner) {
		super(owner);
	}

	@Override
	public void setVolum(int volume) {
		System.out.println("현재 볼륨 : " + volume);
	}
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + " 채널로 이동합니다.");
	}
}
