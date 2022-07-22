package chap07.exam.exercise7_22;

public class Rectangle extends Shape {

	// 멤버 변수
	double width;
	double height;
	
	// 생성자
	Rectangle(double width, double height) {
		this(new Point(0,0), width, height);
	}
	
	Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	
	boolean isSquare() {
		// 정의
		if(width == height) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	double calcArea() {
		return width * height;
	
	}

}
