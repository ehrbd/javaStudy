package chap10.user_defined_exception;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException(){}

	public BalanceInsufficientException(String message){		// message : 에러의 원인
	super(message);	// Exception 클래스에게 전달
	}
	

}
