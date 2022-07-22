package chap11.class_function;

// 사용 예 : JSP 를 사용해서 웹 어플리케이션을 만들때
// Controller 에서 사용
// Controller : 브라우저에서 올라오는 url 에 따라서 그 url 을 처리하는 핸들러를 매핑을 시켜준다.
// 핸들러가 interface 를 사용하고 url 에 따라서 그것을 처리하는 구현객체를 매핑을 시켜준다.
// 그 때 구현객체를 생성(NewInstance() 메소드 사용) 을 해서 HashMap에 저장을 합니다.

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
//			Class clazz = Class.forName("chap11.class_function.SendAction");
			Class clazz = Class.forName("chap11.class_function.ReceiveAction");
			// 객체를 생성하는 것과 동일하다. new SendAction();
			// newInstance() 메소드 실행 시, 객체가 default 생성자가 존재해야 한다.
			Action action = (Action)clazz.newInstance();	// 자동 타입 변환
			action.execute();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
