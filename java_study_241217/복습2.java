package java_study_241217;

class 베이커리 {
	String 베이커리이름;
	String 베이커리종류;
	
	public 베이커리() { //디폴트 생성자	
	}
	/*
	 * 오버로딩(Overloading)
	 * >>메소드(or 생성자) 이름이 동일해도 파라미터 타입만 다르면 메소드 이름을 중복해서 사용할 수 있음 
	 */
	public 베이커리(String 베이커리이름, String 베이커리종류) {
		//this.변수명: 필드변수를 가르킴
		this.베이커리이름 = 베이커리이름;
		this.베이커리종류 = 베이커리종류;
	}
	//출력용 메소드 만들어보기
	public void 출력하다() {
		//void: 리턴 x
		System.out.println("베이커리 이름: " + this.베이커리이름);
		System.out.println("베이커리 종류: " + this.베이커리종류);
	}
}
public class 복습2 {

	public static void main(String[] args) {
		
		베이커리 a = new 베이커리(); //기본생성자 선택
		a.베이커리이름 = "성심당";
		a.베이커리종류 = "소금빵";
//		System.out.println(a.베이커리이름);
//		System.out.println(a.베이커리종류);
		a.출력하다(); //메소드를 이용해서 코드량 줄이기
		/*
		 * 메소드
		 * 1. 코드량 줄이기 가능
		 * 2. 코드 재사용성 증가
		 * 3. 코드 유지보수 & 협업 능률 증가
		 */

		베이커리 b = new 베이커리("파리바게트", "뀐아망"); //파라미터가 있는 생성자 선택
//		System.out.println(b.베이커리이름);
//		System.out.println(b.베이커리종류);
		b.출력하다();
	}
}