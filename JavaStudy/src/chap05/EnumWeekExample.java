package chap05;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
//		지금 시각을 가져오기 위해서 Calendar 클래스 -> 추상 클래스 
//		자식 객체를 사용해서 시간정보를 가져올 수 있다.
		Week today = null; // 참조변수
		
		Calendar cal = Calendar.getInstance();			// Calendar 클래스의 자식 클래스를 가져온다.
		int week = cal.get(Calendar.DAY_OF_WEEK);		// 요일 정보를 가져온다. SUNDAY = 1 
		switch(week) {
		case 1: today = Week.SUNDAY;					// 프로그램의 의미를 부여할 수 있음
				break;									// today = 5(?요일) -> FRIDAY
		case 2: today = Week.MONDAY;
				break;
		case 3: today = Week.TUESDAY;
				break;
		case 4: today = Week.WEDNESDAY;
				break;
		case 5: today = Week.THURSDAY;
				break;
		case 6: today = Week.FRIDAY;
				break;
		case 7: today = Week.SATURDAY;
				break;		
		}
		System.out.println("오늘 요일 : " + today);		// today 의 값이 저장될지 모르는 경우에 에러
		if(today == Week.SATURDAY || today == Week.SUNDAY) {
			System.out.println("집에서 쉬면서 자습합니다.");
		}else {
			System.out.println("열심히 자바 공부를 합니다.");
		}

	}

}
