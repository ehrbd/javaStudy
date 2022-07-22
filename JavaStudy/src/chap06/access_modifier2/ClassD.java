package chap06.access_modifier2;

import chap06.access_modifier1.ClassA;

public class ClassD {
	void method() {
		ClassA ca = new ClassA(10);
		ca.field1 = 10;
//		ca.field2 = "홍길동";
//		ca.field3 = 20L;
//		ca.field4 = 4.4;
		
		ca.method1();
//		ca.method2();
//		ca.method3();
//		ca.method4();
		
//		ClassA capro = new ClassA("홍길동");
//		ClassA cadef = new ClassA(20L);
//		ClassA capri = new ClassA(4.4);
		
	}
}
