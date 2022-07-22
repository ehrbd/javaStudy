package chap10.try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[]args){
		String data1=null;
		String data2=null;
		try{
			data1=args[0];
			data2=args[1];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("실행매개값의수가부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("javaTryCatchFinallyRuntimeExceptionExample num1 num2");
			return;		// 프로그램 종료
		}
		try{
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			int result=value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(NumberFormatException e){
			System.out.println("숫자로변환할수없습니다.");
		}finally{
			System.out.println("다시실행하세요.");
		}
	}
}
