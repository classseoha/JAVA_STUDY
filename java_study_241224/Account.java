package java_study_241224;

/*
 * interface or class 명명 규칙 >> 대문자로 시작
 */
public interface Account { //계좌의 기본 기능 정의(선언)
	//첫번째 순서: 인터페이스 만들기
	/*
	 * 인터페이스 특징
	 * 1. 구현 불가능, 선언만 가능
	 * 2. public만 작성할 수 있음
	 */
	void deposit(int amount); //입금
	boolean withdraw(int amount); //출금
	int getBalance(); //잔액조회
	String getAccountNumber(); //계좌번호 조회
}
