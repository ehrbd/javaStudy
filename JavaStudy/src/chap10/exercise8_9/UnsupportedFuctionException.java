package chap10.exercise8_9;

public class UnsupportedFuctionException extends RuntimeException {
	final private int ERR_CODE;
	
	//생성자 
	public UnsupportedFuctionException() {
		ERR_CODE = 0;
	}
	
	public UnsupportedFuctionException(String msg ,int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	

	public int getErrCode() {
		return ERR_CODE;
	}
	
	// e.getMessage -> 재정의해서 쓰는것
	public String getMessage() {
		return "["+getErrCode()+"]" + super.getMessage();
	}
	
}


//2 4
//1
//1345