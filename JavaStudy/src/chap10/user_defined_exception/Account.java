package chap10.user_defined_exception;

/*
 * 사용자 정의 예외 -> 필요에 따라서 예외처리 방법을 이용해서 사용자에게 알릴 수 있다.
 * 브라우저 -서버 간에도 사용할 수 있다.
 * 사용자 정의 예외클래스를 만드는 방법 : Exception 또는 RuntimeException 클래스를 상속
 * default 생성자와 예외 원인을 매개변수로 받는 생성자를 정의한다.
 */

public class  Account {
		private long balance;

		public Account() {
		}

		public long getBalance() {
			return balance;
		}

		public void deposit(int money) {
			balance += money;
		}

		public void withdraw(int money) throws BalanceInsufficientException {
			if (balance < money) {
				throw new BalanceInsufficientException("잔고부족:" + (money - balance) + "모자람");
			}
			balance -= money;
		}
	}
