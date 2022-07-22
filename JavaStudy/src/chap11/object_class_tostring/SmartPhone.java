package chap11.object_class_tostring;

public class SmartPhone {

	// 필드 
	private String company; 
	private String os;
	
	public SmartPhone (String company, String os) {
		this.company = company; 
		this.os = os;
	}

	// 이클립스의 기능을 이용해서 자동으로 재정의
	@Override
	public String toString() {
		return "SmartPhone [company=" + company + ", os=" + os + "]";
	}
	
//	@Override
//	public String toString() {	
//		return "제조회사 : " + company + " / 운영체제 : " +  os;
//		return super.toString();		// object 메소드의 toString() 를 그대로 사용한다. (재정의X)
//	}
	
}
