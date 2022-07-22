package chap11.object_deep_equals;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		Integer o1 = 1000; // Wrapper 클래스 -> 필드로 1000을 가지고 , 여러가지 메소드를 제공
		Integer o2 = 1000;
							
		System.out.println(Objects.equals(o1,o2)); //true
		System.out.println(Objects.equals(o1,null)); //false
		System.out.println(Objects.equals(null,o2)); //false
		System.out.println(Objects.equals(null,null)); //true
		System.out.println(Objects.deepEquals(o1,o2)+"\n"); //true
		Integer[]arr1={1,2};
		Integer[]arr2={1,2};
		System.out.println(Objects.equals(arr1,arr2)); //false(주소)
		System.out.println(Objects.deepEquals(arr1,arr2)); //true
		System.out.println(Arrays.deepEquals(arr1,arr2)); //true
		System.out.println(Objects.deepEquals(null,arr2)); //false
		System.out.println(Objects.deepEquals(arr1,null)); //false
		System.out.println(Objects.deepEquals(null,null)); //true
		
	}

}
