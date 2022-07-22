package chap06.exam.twenty;

class Exercise6_20 {
	static int[] shuffle(int[] input) {
		if(input==null || input.length==0)
			return input;
		
		
		for(int i=0; i<input.length;i++) {
			int tmp;
			int j = (int)Math.random() * input.length +1;
					
			tmp = input[i];
			input[i] = input[j];
			input[j] = tmp;
		}
		return input;
	}
	

public static void main(String[] args){
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}