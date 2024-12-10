package java_study_241210;

//클래스 이름: javaStudy1210_01
public class javaStudy1210_01 {
	
	int x = 10;  //필드변수(전역변수)
	
	public javaStudy1210_01() { //생성자
	
	}
	public int getX() { //메소드
		return x;
	}

	public static void main(String[] args) {
		
		//붕어빵 클래스 호출하기
		//new: 클래스 호출
		//x: 붕어빵 클래스 변수명
		붕어빵 x = new 붕어빵();
		x.붕어빵종류 = "슈크림"; //붕어빵 클래스에 있는 붕어빵종류 변수 사용
		x.붕어빵가격 = 500; //붕어빵 클래스에 있는 붕어빵가격 변수 사용
		//.: 접근하다
		System.out.println("붕어빵 종류: " + x.붕어빵종류);
		System.out.println("붕어빵 가격: " + x.붕어빵가격);
		
		/*
		 * 메소드 안에 작성된 변수는 '지역변수'라고 함
		 * 지역변수는 선언과 동시에 값을 초기화 해야합니다.
		 */
		int num = 0; //0값 초기화
		System.out.println(num); //에러 발생!
		
		붕어빵 y = new 붕어빵(); //붕어빵 클래스 재호출(새롭게 호출)
		//값을 대입한적이 없는데 값이 출력됨 즉, 필드변수는 자동으로 초기화가 된다.
		System.out.println("붕어빵 종류: " + y.붕어빵종류);
		System.out.println("붕어빵 가격: " + y.붕어빵가격);
		
		//필드변수(전역변수): 초기화 옵션
		//메소드 안의 변수(지역변수): 초기화 필수
		
		
		
	}

}
