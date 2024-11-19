package java_study_241119;

public class 복습1119 {

	public static void main(String[] args) {
		// 자바는 8가지 기본 타입과 레퍼런스 타입까지 총 9가지의 데이터 타입을 가지고 있음
		/*
		 * 가장 많이 사용하는 데이터 타입
		 * 1. int
		 * 2. double
		 * 3. String
		 * 4. boolean
		 */
		int x = 10; // 10이라는 정수를 x라는 변수(식별자)에 대입
		/*
		 * int: 데이터 타입(정수형)
		 * x: 변수 이름(식별자 이름)
		 * =: 대입 연산자
		 * 10: 데이터
		 */
		int y = 20; // 변수 이름은 중복될 수 없음
		y = 10; // 변수는 재활용 가능(값 변경) >> 변수를 재활용할 때는 앞에 데이터 타입 작성 x
		System.out.println(y);
		
		int b = 20; // b라는 변수 생성 >> 선언문(초기화)
		b = 40; // b를 재활용하다.
		
		// 문제11.
		int n1 = 100;
		int n2 = 90;
		int n3 = 70;
		int avg = 0; // 평균을 구할 변수(초기화)
		
		avg = (n1 + n2 + n3) / 3;
		System.out.println("평균: " + avg);
		
		// 문제12.
		int money = 800;
		double percent = money * 0.1;
		System.out.println("800의 10%는 " + percent );
		
		
	}

}
