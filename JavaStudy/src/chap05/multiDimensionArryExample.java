package chap05;

public class multiDimensionArryExample {

	public static void main(String[] args) {
		// 이차원 배열
		int[][] scores = new int[3][4];			//3 * 4 배열
		int scores2[][] = new int[4][5];		//4 * 5 배열
		
		for(int i = 0; i < scores.length; i ++ ) { 	// i : 열, 길이 scores.length
			for(int j =0; j < scores[i].length; j++ ){	// j : 행, 길이 : scores[i].length
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		int scores3[][] = {{1, 2, 3},{4 , 5 , 6 , 7}};	// 배열안에 배열이 중첩되어 있음
//		{} : 배열 
//		[] : JSON 배열
//		{} : JSON 객체
		for(int i = 0; i < scores3.length; i++) {
			for(int j = 0; j < scores3[i].length; j++) {
				System.out.print(scores3[i][j]+ " ");
			}
			System.out.println();
		}
		
		int scores4[][] = new int[2][];	// 열을 생성
		scores4[0] = new int[5];		// 열 0의 배열을 생성 - 길이가 5
		scores4[1] = new int[3];		// 열 1의 배열을 생성
		
		System.out.println("------------------------------");
		
		
		String[] strArray = new String[4];
		strArray[0] = "홍길동";
		strArray[1] = "JAVA";
		strArray[2] = "데이터베이스";
		strArray[3] = "HTML";
		
		System.out.println(strArray[0]);
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
		
		System.out.println();
		System.out.println("------------------------------");
		
		
		
		String[][] str = new String[3][4];
		str[1][2] = "아";
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		
		int scores5[][] = new int[4][5];
		scores5[1][0] = 2;
		System.out.println(scores5[1][1]);
		
		System.out.println("------------------------------");
		
		int scores6[][] = {{1, 2, 3},{4 , 5 , 6 , 7}};
		
	}

}
