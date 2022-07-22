package chap07.abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("홍길동");
		 sp.turnOn();
		 sp.internetSearch();
		 sp.turnOff();
		 sp.setVolum(50);
		 
		 ktDMBPhone kt = new ktDMBPhone("이선희");
		 kt.setVolum(10);
		 kt.setChannel(4);

	}

}
