package chap08.default_extension;

public interface MyNewInterface extends MyInterface {
	// MyInterface : 추상메소드 method1, default method2
	// MyNewInterface를 만들었을 때 기존에 있는 default method인 method2를 다시 변경 할 수가 있음
	// 3가지 방법을 지원 -> default 메소드를 사용하는 이유중의 하나
	// 방법1 : 그대로 사용. 
	// 방법2 : 재정의 
	// 방법3 : 추상메소드로 바꾸기
	
	void method2();
}
