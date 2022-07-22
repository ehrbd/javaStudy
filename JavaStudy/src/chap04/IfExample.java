package chap04;

public class IfExample {

	public static void main(String[] args) {
		int age = 20;						// 나이  
		boolean gender = true;				// 성별 true = 남자 , false = 여자
		String candidate = "윤석열";			// 지지하는 후보 (이재명, 심상정)
		
//		연령별 , 성별 , 지지하는 후보
		int arr[] = new int[3];				// 계수
		if(age >= 18 && age <20) {			// 10대 - 필수 
//			↑ 조건 만족하면 실행된다.
			if(gender == true) {				// 중첩문 : if문 안에 if문 있을 때	// 남성
				if(candidate.equals("윤석열")) {
					arr[2]++;
				}else if(candidate.equals("이재명")) {
					arr[1]++;	
				}else {		
					arr[3]++;
				}		
			}else{													 		// 여성
				
			}
		}else if(age>=20 && age<30) {		// 20대 - 아래론 선택사항
			
		}else if(age>=30 && age<40) {		// 30대 - 비교조건이 여러개 있으면 여러개 사용
			
		}else if(age>=40 && age<50) {		// 40대
			
		}else if(age>=50 && age<60) {		// 50대
		
		}else if(age>=60 && age<70) {		// 60대
			
		}else {								// 70 이상
			
		}
//		if문의 조건을 만족해서 실행을 한 후 이곳으로 프로그램의 순서가 이동된다.
//		이렇게 사용할 수도 있지만, 효율이 떨어진다. -> 매번 판단을 해야함
		if(age >= 18 && age < 20) {
			
		}
		if(age >= 20 && age < 30) {
			
		}
		if(age >= 30 && age < 40) {
			
		}
//		실행문이 한 줄일 경우 중괄호는 생략할 수 있다.
//		일반적으론 사용하는 것이 좋다.
//		실행문이 한줄 이었는데, 한줄을 더 추가하고 싶을 때,
		if(gender)
//			gender가 true이면, 실행된다.
			System.out.println("남성");
//			System.out.println("한줄 더 추가");
		else
			System.out.println("여성");
	}

}
		