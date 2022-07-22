package chap06.exam.one_two;
class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){
		num = 1;
		isKwang = true;
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
		
	}
	
	String info() {
		if((num <= 10 && num >= 1) && isKwang == true) {
			return num + "K";
			
		}else if((num <= 10 && num >= 1) && isKwang == false){
			return num + "";
	
		}else
			return "잘못 입력된 값";
		
	}
		
}
