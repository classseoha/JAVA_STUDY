package java_study_241212;

class 붕어빵기계 {
	
	int 붕어빵가격;
	String 붕어빵종류; //팥, 슈크림
	
	//기본생성자가 설정되어있음
	붕어빵기계(int 붕어빵가격, String 붕어빵종류) { 
		this.붕어빵가격 = 붕어빵가격;
		this.붕어빵종류 = 붕어빵종류;
	}
	
	//리턴타입이 String인 메소드
	public String 붕어빵내용물추가(String 재료1, String 재료2) {
		String 최종재료 = 재료1 + 재료2;
		return 최종재료;
	}
}

public class 붕어빵 {

	public static void main(String[] args) {
		
		붕어빵기계 붕빵1 = new 붕어빵기계(1000, "초코");
		String 최종재료 = 붕빵1.붕어빵내용물추가("팥", "생크림");
		System.out.println("붕어빵 가격: " + 붕빵1.붕어빵가격 + "\n붕어빵 종류: " + 붕빵1.붕어빵종류);
		System.out.println("신제품: " + 최종재료 + " 붕어빵");
		
		붕어빵기계 붕빵2 = new 붕어빵기계(700, "슈크림");
		String 최종재료2 = 붕빵2.붕어빵내용물추가("스위트콘", "치즈");
		붕빵2.붕어빵가격 = 1400;
		붕빵2.붕어빵종류 = 붕빵2.붕어빵종류 + 최종재료2 + "붕어빵";
		System.out.println("붕빵2네 붕어빵가격: " + 붕빵2.붕어빵가격 + "\n붕빵2네 붕어빵종류: " + 붕빵2.붕어빵종류);

	}

}
