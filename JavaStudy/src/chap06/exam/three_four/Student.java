package chap06.exam.three_four;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
		
	Student () {
		
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		
		return kor + eng + math;
	}
	
	float getAverage() {
		
		return (int)((getTotal() / 3F * 10) + 0.5) / 10F;
		
	}
	
	
	String info() {
		return name + " " + ban +" " + no +" " + kor +" " + eng +" " + math + " " + getTotal() + " " + getAverage();
	}
	
}
