package chap06.sec12.exam01_package_compile;

import java.util.ArrayList;
import java.util.List;	// 어느 패키지에 있는 클래스를 사용할 것인지 지정해준다.

//	cmd창을 이용해서 빌드(컴파일)을 하고 실행을 
//	차이점 : package명이 있을 경우 
//	컴파일 : class 파일이 생성되는 폴더를 지정을 해준다.
//	가정 : Application.java 파일이 c:\Temp 폴더에 존재한다.
//	컴파일 절차 -> c:\Temp> javac -d . Application.java -encoding  " UTP-8 "
//	실행 절차 -> c:\Temp> java chap06.sec12.exam01_Package_compile.Application
// . : 현재 디렉토리
// .. : 상위 디렉토리를 의미

public class Application {

	public static void main(String[] args) {
		System.out.println("애플리케이션을 실행합니다.");
		
//		import 문은 내 클래스에서 정의되지 않은 다른 클래스를 사용할 때 그 클래스가 어디에 있는지를 알려주어야한다
//		그 때 import 문을 사용해서 어느 패키지 밑에 있는지 알려준다.
		List<String> list = new ArrayList<String>();
//		이클립스가 제공하는 import 단축키 : ctrl + shift+ o -> import 단축키

	}

}
