package chap05;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
//		배열의 단점 : 고정된 크기를 가진다.
		int cart[]  = {10, 20, 30} ;		// length 3인 배열
//		더많은 데이터를 저장하고싶다
		int[] newCart = new int[6];			// 더 큰 배열을 생성
//		기존의 데이터를 옮겨담아야함.
		for(int i = 0; i < cart.length; i++) {
			newCart[i] = cart[i];
		}
		
//		System.arrayCopy() 메소드를 사용 -> 배열을 먼저 만들어야함.
//		System.arrayCopy(Object src , int srcIndex, Object destination, int destIndex, int size)
		System.arraycopy(cart, 0, newCart, 0, cart.length);
		
//		Arrays.copyOf() 메소드 사용 -> 배열을 먼저 만들필요 없음.
		int[] newArr = Arrays.copyOf(cart, 5);		// 반환값 : 생성된 배열의 주소
		for(int i=0; i<newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
		
			
		
		
		
	}

}
