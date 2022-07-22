package chap09.nested_interface;

public class ButtonExample {

	public static void main(String[] args) {
		Button btna = new Button();
		btna.setOncLICKListener(new CallListener());
		btna.touch();		// 버튼을 눌러스 내부적으로 처리
		
		btna.setOncLICKListener(new MessageListener());
		btna.touch();

	}

}
