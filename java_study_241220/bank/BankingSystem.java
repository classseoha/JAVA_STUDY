package java_study_241220.bank;

import java.util.Scanner;

//메인클래스(console 출력 확인)
public class BankingSystem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Bank bank = new Bank(); //Bank 클래스 호출(생성)
		
		while(true) { //은행 업무 선택
			System.out.println("안녕하세요. 길동은행입니다. 무엇을 도와드릴까요?");
			System.out.println("[1]계좌생성 [2]입금 [3]출금 [4]잔액조회 [5]종료");
			
			System.out.print("업무 선택: ");
			int choice = scan.nextInt(); //스캐너로 업무 입력받기
			scan.nextLine(); //버퍼 지우기
			
			switch(choice) {
			case 1: 
				System.out.print("새 계좌번호: ");
				String newAccountNumber = scan.next();
				bank.createAccount(newAccountNumber); //Bank 클래스에 정의된 메소드 호출
				break;
			case 2: 
				System.out.print("입금 계좌번호 입력: ");
				String depositAccount = scan.next(); //입금할 계좌번호 입력받기
				System.out.print("입금액: ");
				int depositAmount = scan.nextInt(); //입금액 입력받기
				//입금할 계좌가 없다면
				//Bank 클래스에 정의된 findAccount 메소드 호출
				BasicAccount account = bank.findAccount(depositAccount); //계좌조회
				if(account != null) { //값이 없다면
					account.deposit(depositAmount); //입력받은 금액 입금 완료
				}else {
					System.out.println("계좌를 찾을 수 없습니다.");
				}
				break;
			case 3: 
				System.out.print("출금 계좌번호 입력: ");
				String withdrawAccount = scan.next(); //출금할 계좌 입력
				System.out.print("출금액: ");
				int withdrawAmount = scan.nextInt(); //출금액 입력받기
				BasicAccount wAccount = bank.findAccount(withdrawAccount); 
				if(wAccount != null) { 
					//BasicAccount 클래스에 정의된 withdraw 메소드 호출
					wAccount.withDraw(withdrawAmount); //출금
				}else {
					System.out.println("계좌를 찾을 수 없습니다.");
				}
				break;
			case 4: //잔액 조회
				System.out.print("계좌번호 입력: ");
				String balanceAccount = scan.next(); //잔액조회 계좌번호 입력
				BasicAccount bAccount = bank.findAccount(balanceAccount); //계좌조회
				if(bAccount != null) {
					System.out.println("계좌잔액: " + bAccount.getBalance());
				}else {
					System.out.println("계좌를 찾을 수 없습니다.");
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				scan.close(); //스캐너 종료
				System.exit(0); //시스템 강제 종료
				break;
			default: //1~5번 외에 다른 번호를 입력한다면
				System.out.println("번호를 잘못 입력하셨습니다.");
			}
		}

	}

}
