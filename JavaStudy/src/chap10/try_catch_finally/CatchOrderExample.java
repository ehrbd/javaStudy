package chap10.try_catch_finally;

// 예외처리 순서 : 범위가 작은것으로 먼저 캐치, 그후에 큰것들 RuntimeException(실행예외) -> Exception(모든예외)
// 그 다음에 더 넓은 범위의 예외를 catch 하는 것을 사용

public class CatchOrderExample {
	public static void main(String[]args){
		String data1=null;
		String data2=null;
		try{
			data1=args[0];
			data2=args[1];						// ArrayIndexOutOfBoundException
			
			int value1=Integer.parseInt(data1);	// NumberFormatException 발생 가능
			int value2=Integer.parseInt(data2);
			int result=value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("실행매개값의수가부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("javaTryCatchFinallyRuntimeExceptionExample num1 num2");
//			return;								// 프로그램 종료 -> 리턴문이 있다고 바로 프로그램이 종료가 되는것이 아니고, finally 가 실행되고 난 후에 다시 리턴문으로 돌아와 종료한다.
		}catch(RuntimeException e){					// 앞보다 큰거로
			System.out.println("숫자로변환할수없습니다.");
		}finally{
			System.out.println("다시실행하세요.");
		}
	}
}