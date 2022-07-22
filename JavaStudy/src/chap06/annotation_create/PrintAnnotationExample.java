package chap06.annotation_create;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// 클래스 Service 의 메소드 정보를 얻음.
		Method[] declaredMethod = Service.class.getDeclaredMethods();
		for(Method method : declaredMethod) {		// 각 메소드별로 
			// method 1, 2 ,3 
			// 어노테이션이 적용된 메소드를 찾는다.
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//메소드에 적용된 어노테이션 정보를 가져온다
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				// 어노테이션을 적용 : value 에 설정된 문자를 number에 설정된 갯수만큼 출력 -> 어노테이션을 구현
				// 메소드 이름을 출력
				System.out.println("[" + method.getName() + "]");
				for(int i = 0;i < printAnnotation.number();i++) {
					System.out.print(printAnnotation.Value());
				}
				System.out.println();
				try {
					method.invoke(new Service());
					
				} catch (Exception e) {}
				System.out.println();
			}
		}
		
	}

}
