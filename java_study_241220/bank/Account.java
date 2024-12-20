package java_study_241220.bank;
//기능정의서(메소드 정의만 가능)
public interface Account { //계좌의 기본 기능을 정의
	
	 //인터페이스에 작성된 메소드는 무조건 접근지정자가 public임(생략 가능)
	public void deposit(int amount); //입금
	public boolean withDraw(int amount); //출금
	public int getBalance(); //잔액 조회
	public String getAccountNumber(); //계좌번호 조회
	
}
