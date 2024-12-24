package java_study_241224;

public class 테스트3 {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		//계좌생성
		String 계좌번호1 = "123456";
		bank.createAccount(계좌번호1);

		String 계좌번호2 = "654321";
		bank.createAccount(계좌번호2);
		
		//계좌번호 123456 찾기
		BasicAccount basicAccount = bank.findAccount(계좌번호2);
		basicAccount.deposit(50000);
		
		System.out.println("계좌번호: " + basicAccount.getAccountNumber());
		System.out.println("잔액: " + basicAccount.getBalance());
		
		/*
		 * 최종순서
		 * Account > BasicAccount(입금, 출금, 잔액조회, 계좌조회) > Bank(계좌 찾기, 생성) > Main 메서드로 출력해보기
		 */

	}

}
