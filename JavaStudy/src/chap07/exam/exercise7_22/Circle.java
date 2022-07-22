package chap07.exam.exercise7_22;

public class Circle extends Shape {
	double r;
	
	// 생성자 원점을 기준으로 하는 원
	Circle(double r) {
		// 부모 생성자를 호출
		this(new Point(0,0),r);
		
	}
	
	// Point p 기준으로 하는 원
	Circle(Point p, double r) {
		super(p);
		this.r = r;
	}
	
	@Override
	double calcArea() {
		
		return r * r * Math.PI;
	}

}
