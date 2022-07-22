package chap11.object_clone;
//객체를 복제하려면 cloneable 인터페이스를 구현해야한다.
public class Member implements Cloneable {
	// 필드
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	
	// 생성자	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	// 복제된 Member 객체를 얻는 메소드 추가
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();	// clone() 메소드는 Object 객체를 반환하므로 Member 객체로 형변환을 한것.
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return cloned;
	}
	
}
