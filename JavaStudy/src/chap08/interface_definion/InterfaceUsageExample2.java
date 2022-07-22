package chap08.interface_definion;

public class InterfaceUsageExample2 {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.method3();
		
		mc = new MyClass(new Audio());
		mc.method3();

	}

}
