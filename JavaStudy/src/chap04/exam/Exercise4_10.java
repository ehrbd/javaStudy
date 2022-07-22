package chap04.exam;

public class Exercise4_10 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		do {
			sum += num %10;
			num /= 10;
		}while(num !=0);{
					
		System.out.println("sum="+sum);
		}
		
	}
}

