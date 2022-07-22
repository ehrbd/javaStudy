package chap10.try_with_resource;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (		// 자원을 얻는 부분을 프로그램 한다. -> finally가 작성할 필요없다.
				FileInputStream fis = new FileInputStream("file.txt");
				)
		{	// 예외가 발생할 수 있는 코드를 작성
			fis.read(); 
			throw new Exception(); 	// 예외 강제로 발생
		}catch(Exception e) {		// 예외처리
			// closeable() 메소드가 실행이 되었음 -> 자원 반납
			// 예외가 발생되면 자동으로 closeable 메소드가 실행
			System.out.println("예외처리코드가 실행되었습니다.");
		}
	}

}
