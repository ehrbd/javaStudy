package chap02;

public class VariableScope {
	int var0;	// 필드
	
		//↓ var0는 사용할 수 없음 -> 나중에 배운다. (static 메소드내에서는 사용 불가) 
	public static void main(String[] args) {
		
		// 변수의 사용범위 : 블럭의 시작을 나타내는  중괄호 내에서 사용 (클래스 블럭, 메소드 블럭, 정적블럭, 조건문 또는 반복문 블럭)
		// 블럭내에서만 존재한다. 블럭을 벗어날 경우는 사용할 수 없다.
		
		
		
		// 변수는 스택에 저장된다.
		// ex) if문을 벗어나면 스택에서 삭제가 된다.
		
		int var1 = 10; // main 메소드 안에서 선언됨 -> main 메소드 안에서는 어디서든지 사용 가능
		
		if(true) {	
			int var2 = 40;  
			var2 += var1;  // main 메소드 안이므로 var1을 사용 가능
		}
		
		for(int i = 0; i < 10; i++) {
			int var3 = 20;
			//int var4 = var1 + var2;  // var1은 main 메소드 안에 있는 for문 안이므로 사용 가능, var2 는 if안에서 선언되었으므로 사용 불가 
		}
		//int var5 = var1 + var3; 
		
		
		}
	public void method2() {	   // method2는 클래스에 있음.
		int var6 = var0  + 30; // class 범위 내에서 사용 가능하므로 사용할 수 있음.
	} 
}
