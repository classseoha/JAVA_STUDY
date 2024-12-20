package java_study_241220.bank;

//계좌를 생성하고 관리하는 클래스
public class Bank {
	//계좌를 n개 생성
	private BasicAccount[] accounts; //BasicAccount를 담는 배열(클래스도 데이터 타입임 > 래퍼런스 타입)
	private int accountCount;
	
	public Bank() { //기본생성자로 필드변수 초기화하기
		accounts = new BasicAccount[10]; //최대 10개 계좌 생성 가능
		accountCount = 0;
	}
	
	//계좌생성
	public void createAccount(String accountNumber) {
		
		if(accountCount < accounts.length) {
			//계좌생성 가능
			accounts[accountCount] = new BasicAccount(accountNumber); //클래스 생성 후 배열에 대입
			++accountCount; //계좌 생성 수 증가시키기
			System.out.println("계좌 생성 완료: " + accountNumber);
		}else {
			System.out.println("더이상 계좌를 생성할 수 없습니다.");
		}
	}
	
	//계좌조회
	//클래스도 데이터타입이기 때문에 리턴타입으로 사용 가능
	public BasicAccount findAccount(String accountNumber) {
		for(int i = 0; i < accountCount; i++) {
			//equals: 문자를 비교할 때 사용하는 문자열 메소드
			String myAccountNumber = accounts[i].getAccountNumber();
			if(myAccountNumber.equals(accountNumber)) {
				//accounts[i].getAccountNumber(): i번째에 저장된 BasicAccount의 getAccountNumber() 메소드 호출
				return accounts[i]; //i번째에 있는 원소(BasicAccount) 리턴
			}
		}
		return null;
	}

}
