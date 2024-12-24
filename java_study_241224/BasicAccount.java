package java_study_241224;

/*
 * 인터페이스를 구현한 클래스는 재정의를 무조건 해야함
 * 실무에서 extends보다 implements를 더 많이 사용함
 */
public class BasicAccount implements Account { //인터페이스를 구현(implements)한 기본 계좌 클래서
	//두번째 순서: 클래스 만들기
	
	//필드변수에는 접근제한자 사용가능
	private String accountNumber; //계좌번호
	private int balance; //잔액
	
	/*
	 * 생성자 주요 특징
	 * 1. 생성자 이름과 클래스 이름은 동일해야함
	 * 2. 생성자는 리턴타입이 없음
	 */
	public BasicAccount(String accountNumber) { //생성자 == 초기화 함수
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	@Override
	public void deposit(int amount) { //입금
		if(amount > 0) {
			this.balance += amount;
			System.out.println("입금완료: " + amount);
		}else {
			System.out.println("유효하지 않은 금액");
		}
	}

	@Override
	public boolean withdraw(int amount) { //출금
		if(amount > 0 && balance >= amount) {
			this.balance -= amount;
			System.out.println("출금완료: " + amount);
			 return true;
		}else {
			System.out.println("출금실패: 잔액 부족 or 유효하지 않은 금액");
			return false;
		}
	}

	@Override
	public int getBalance() { //필드변수가 private이기 때문에 메소드로 필드변수를 호출함
		return this.balance;
	}

	@Override
	public String getAccountNumber() { //필드변수가 private이기 때문에 메소드로 필드변수를 호출함
		return accountNumber;
	} 
	
	

}
