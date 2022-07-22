package chap09.nested_calss;

public class Outer {
	// 멤버 : 필드, 생성자, 메소드 , 상수 , 
	// 인스턴스 멤버 클래스 : Outer 클래스 내에서만 사용 -> 객체가 생성되어야만 존재
	public class InnerA {
		// 생성자
		InnerA() {
			
		}
		// 멤버 : 인스턴스(O) , 정적멤버 (X)
		int field1;
//		static String str1;	// 사용 불가능
		void iMethod1() {
			
		}
//		static void sMethod1() {	// 사용 불가능
//			
//		}
	}
	
	// 정적 멤버 클래스 : 객체의 생성없이 접근이 가능 -> 클래스의 이름으로 접근 -> 객체의 생성과 무관하게 존재
	public static class InnerB {
		// 멤버 : 인스턴스 (O) , 정적멤버 (O)
		int field3;
		static String str3;
		void method3() {
			
		}
		static void method4() {
			
		}
		
	}
	
	// 메소드
	public void method() {
		// 로컬 클래스 : 메소드 내에서만 사용 -> 클래스를 정의
		class CommThread extends Thread {		// 서버와 통신을 하는 스레드 클래스
			@Override
			public void run() {
				// 서버와 통신을 한다 -> 예) 파일 다운로드
				System.out.println("스레드가 동작함");
				try {
					sleep(1000);					//잠자기
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		CommThread com = new CommThread();		// 객체 생성
		com.start();		// 스레드를 시작
	}
}

// Outer 클래스와 동등한 레벨
class Bus {
	
}