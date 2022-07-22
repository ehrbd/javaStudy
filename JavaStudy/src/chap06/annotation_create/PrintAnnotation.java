package chap06.annotation_create;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})			// 어노테이션이 적용되는 범위 : Method
@Retention(RetentionPolicy.RUNTIME)		// 어노테이션이 유지되는 기간 : Runtime
public @interface PrintAnnotation {
	String Value() default "-"; 		// 기본엘리먼트선언 + 디폴트값 -> default 로 "-"를 출력
	int number() default 15;			// 주의 : 필드명에 ()를 사용 -> " 15 " 를 출
	
}
