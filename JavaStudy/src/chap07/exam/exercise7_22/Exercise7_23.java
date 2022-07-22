package chap07.exam.exercise7_22;

public class Exercise7_23 {

	static double sumArea(Shape[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {		// Shape s : arr
			sum += arr[i].calcArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합 :" + sumArea(arr));
	}

}

//	double sumArea(Shape[] arr) {
//		double sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i].calcArea();
//		}
//		return sum;
//	}
//
//	public static void main(String[] args) {
//		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
//		Exercise7_23 abc = new Exercise7_23();
//		System.out.println("면적의 합 :" + abc.sumArea(arr));
//	}
//
//}