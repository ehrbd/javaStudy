package chap11.arrays;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = { { 1, 2 }, { 3, 4 } };
		// 얖은복사후비교
		System.out.println("[얕은복제후비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열번지비교:" + original.equals(cloned1));		// false
		System.out.println("1차배열항목값비교:" + Arrays.equals(original, cloned1));		// true
		System.out.println("중첩배열항목값비교:" + Arrays.deepEquals(original, cloned1));	// true
		// 깊은복사후비교
		System.out.println("\n[깊은복제후비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열번지비교:" + original.equals(cloned2));		// f
		System.out.println("1차배열항목값비교:" + Arrays.equals(original, cloned2));		// f
		System.out.println("중첩배열항목값비교:" + Arrays.deepEquals(original, cloned2));	// t
		
		int [] ori = {1,2};
		int [] clone = Arrays.copyOf(ori, ori.length);
		System.out.println(ori.equals(clone));
		System.out.println(Arrays.equals(ori,clone));

	}

}

// 설명이 잘못된거고 
// equals -> original , cloned 의 주소 비교
// Arrays.equals -> orginal cloned 가 참조하는 주소가 같은지 비교
// Arrays.deepequals -> 참조하는 주소가 달라도 값이 같은지 비교