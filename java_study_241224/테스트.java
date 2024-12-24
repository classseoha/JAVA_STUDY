package java_study_241224;

public class 테스트 {

	public static void main(String[] args) {
		//입금, 출금 테스트하기
		
		String 계좌번호 = "123456"; //지역변수(접근제한자 선언 불가)
		BasicAccount account1 = new BasicAccount(계좌번호);
		
		//private 필드변수를 호출하는 메소드를 'getter' 함수라고 함
		int 잔액 = account1.getBalance();
		String 계좌번호출력 = account1.getAccountNumber();
		System.out.println();
		
		System.out.println("잔액: " + 잔액);
		System.out.println("계좌번호: " + 계좌번호출력);
		
		account1.deposit(5000); //5000원 입금
		잔액 = account1.getBalance(); //잔액 getter 메소드 재호출
		System.out.println("잔액: " + 잔액);
		
		account1.withdraw(2000);
		잔액 = account1.getBalance(); 
		System.out.println("잔액: " + 잔액);
		
		String 계좌번호2 = "654321";
		BasicAccount account2 = new BasicAccount(계좌번호2);
		
		account2.deposit(10000);
		account2.withdraw(3000);
		System.err.println("잔액: " + account2.getBalance());
		//account1과 account2는 동일한 BasicAccount를 호출했지만 각각 다른 값을 가진 객체이다.

	}

}
