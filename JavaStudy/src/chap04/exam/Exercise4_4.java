// 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100이 되는지 구하시오


package chap04.exam;

public class Exercise4_4 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
//		false => 밖으로 나오고 true면 반복하고 
		for(i = 1;;i++) {
			if (i % 2 == 0) {
				sum += -i;
			}else if (i % 2 == 1) {
				sum += i;
			}
			if(sum == 100) {
				break;
			}
		}
		System.out.println("합 = " + sum + ", i = " + i);	
	}

}