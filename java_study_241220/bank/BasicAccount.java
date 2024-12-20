package java_study_241220.bank;

//Account 인터페이스를 구현한 기본 계좌 클래스
public class BasicAccount implements Account {
	
	//잔액, 계좌번호 필드변수
	//private: 접근제한자 중 하나, 클래스 호출 시 직접 접근 불가능
	private String accountNumber;
	private int balance;
	
	public BasicAccount(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	@Override
	public void deposit(int amount) { //amount: 입금할 금액
		if(amount > 0) { //입금 금액이 0원 이상이라면
			balance += amount;
			System.out.println("입금 금액: " + amount + "\n잔액: " + balance);
		}else {
			System.out.println("유효하지 않은 금액입니다.");
		}
	}

	@Override
	public boolean withDraw(int amount) { //amount: 출금할 금액
		if(amount > 0 && amount <= balance) { //잔액이 출금 금액보다 커야 출금 가능
			balance -= amount;
			System.out.println("출금 금액: " + amount + "\n잔액: " + balance);
			return true;
		}else {
			System.out.println("잔액 부족으로 출금이 불가합니다.");
			return false;
		}
	}

	@Override
	public int getBalance() {
		return this.balance; //잔액 리턴
	}

	@Override
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	

}
