package chap11.etc;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; // (서울지번/010 - 3자리,4자리 - 4자리)
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println(" 정규식과 일치 합니다. ");
		} else {
			System.out.println(" 정규식과 일치 하지 않습니다. ");
		}
		
		// 정규표현식 -> 정해진 샘플이 많이 있으므로 나에게 맞는것이 어떤 것인지 검색을 통해 찾는다
		// 어떤 형식으로 만들것인가 
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println(" 정규식과 일치합니다. ");
		} else {
			System.out.println(" 정규식과 일치하지 않습니다. ");
		}

	}
}
