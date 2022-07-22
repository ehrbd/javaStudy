package chap11.object_hash;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1=new Student(1,"홍길동");
		Student s2=new Student(1,"홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));		//  = s2.hashCode()

		
	}
	
	static class Student {
		// 필드
		int sno;
		String name;
		
		//생성자
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		
		// 논리적 동등비교를 위해 재정의
		@Override
		public int hashCode() {
			
			return Objects.hash(sno, name);		// 필드의 정보를 이용해서 hashCode 를 생성
			// sno , name 이 같으면 같은 hashCode를 갖는다.
		}
	}

}
