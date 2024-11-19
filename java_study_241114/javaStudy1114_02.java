package java_study_241114;

public class javaStudy1114_02 {

	public static void main(String[] args) {
		
		int number = 10; // 오른쪽에서 왼쪽으로 데이터 대입
		/*
		 * int : 정수형 데이터 타입
		 * number : 식별자(변수명)
		 * = : 대입
		 * 10 : 정수형 데이터
		 * ; : 문단 종료
		 */
		/*
		 * 자바는 기본 데이터 타입 8개와 레퍼런스 타입 1개 해서 총 9개의 데이터 타입을 가지고 있다.
		 * String은 레퍼런스 타입
		 */
		
		int x = 10;
		System.out.println("정수형 데이터 타입: " + x);
		double y = 10.555;
		System.out.println("실수형 데이터 타입: " + y);
		boolean z = true; // true or false만 올 수 있음
		System.out.println("논리형 데이터 타입: " + z);
		char a = 'a'; // 문자 데이터 타입(문자열 x)
		System.out.println("문자 데이터 타입: " + a);
		String s = "Hello World";
		System.out.println("문자열 데이터 타입: " + s);
		/*
		 * 문자는 한 단어만 입력 가능, 문자열은 여러 단어 입력 가능
		 */
		
		final double PI = 3.14; // 원주율(파이)은 3.14 고정된 값이라 상수라고 함 
		// 상수는 데이터 타입 앞에 'final' 이라는 키워드를 작성합니다.
		// 상수의 식별자(변수명)은 대문자로 작성합니다.
		
		//형변환
		int num = 10; // int는 4바이트
		double num2 = num; // double은 8바이트
		// 정수형 변수 num에 10을 대입함
		// 실수형 변수 num2에 num을 대입함
		// 작은 바이트 크기에서 큰 바이트 크기로 대입할 때는 자동 형변환이 됨
		// 즉, int num이 실수 형태로 변환됨
		System.out.println("최종 값: " + num2);
		
		// 큰 바이트 크기에서 작은 바이트 크기로 변환할 때는 개발자가 강제 형변환 해야함
		double num3 = 100.45;
		int num4 = (int)num3; // 정수형 변수 num4에 실수형 변수 num3를 대입
		System.out.println("최종 값: " + num4); // 실수가 정수로 변환됨
		
		// 그 외 변환
		// 1. 문자형을 숫자로 변환
		String s1 = "123";
		int num5 = Integer.parseInt(s1); // 문자 "123"을 숫자 123으로 변환
		System.out.println("최종 값: " + num5);
		
		//2. 숫자를 문자로 변환
		int num6 = 8000;
		String s2 = Integer.toString(num6); // 숫자 8000을 문자 "8000"으로 변환
		/*
		 * 문자 형태인 숫자 "123"과 숫자 123의 차이
		 * 문자 형태는 사칙연산이 불가능
		 */
		
		

	}

}
