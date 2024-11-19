package java_study_241119;

public class javaStudy1119_01 {

	public static void main(String[] args) {
		// 비교연산자: 비교연산자 결과는 true(참) 혹은 false(거짓)으로 표기
		boolean 비교 = 3 < 5;
		System.out.println(비교);
		boolean 비교2 = 4 > 10;
		System.out.println(비교2);
		boolean 비교3 = 5 == 5;
		System.out.println(비교3);
		boolean 비교4 = 3 != 5;  // 느낌표는 부정을 의미
		System.out.println(비교4);
		
		// 논리연산자
		// AND 연산자 (두 조건이 모두 참일 때 전체가 참)
		boolean 배가고프다 = true;
		boolean 돈이있다 = true;
		boolean 식당에갈수있다 = 배가고프다 && 돈이있다;
		System.out.println(식당에갈수있다);
		
		// OR 연산자 (두 조건 중 하나만 참이면 전체가 참)
		boolean 비가온다 = true;
		boolean 우산이있다 = false;
		boolean 외출가능 = 비가온다 || 우산이있다;
		System.out.println(외출가능);
		
		// NOT 연산자 (조건의 결과를 뒤집음)
		boolean 햇빛이쨍쨍 = true;
		boolean 흐린날씨 = !햇빛이쨍쨍; // 변수명 앞에 느낌표
		System.out.println(흐린날씨);
		
		// 복합대입연산자
		int a = 10;
		int b = 20;
		
//		a = a + b;
		a += b; // 위랑 동일 코드
		System.out.println(a);
		
		int c  = 5;
		int d = 6;
		c *= d;
		System.out.println(c);
		
		// 증감연산자
		// 변수의 값을 1 증가 혹은 1 감소시키는 연산자입니다.
		int 증감 = 0;
		증감++;
		System.out.println(증감);
		
		증감--;
		System.out.println(증감);

		// 증감연산자는 전위 연산자와 후위 연산자로 나뉨
		// 전위 연산자(변수명 앞에 ++ or --가 온다.)
		int 사과 = 100;
		System.out.println(++사과);
		System.out.println(사과);
		
		// 후위 연산자(변수명 뒤에 ++ or --가 온다.)
		int 포도 = 100;
		System.out.println(포도++);
		System.out.println(포도);
		
		// 삼항연산자
		// 세 개의 피연산자로 구성된 연산자입니다.
		int num = 3;
		int num2 = 5;
		int 결과 = num > num2 ? num - num2 : num + num2;
		
		
		// 문제1.
		int 용돈 = 5000;
		용돈 -= 3000;
		System.out.println(용돈);
		용돈 += 3000;
		System.out.println(용돈);
		
		// 문제2
		double weight = 70.5;
		double height = 1.77;
		double bmi = weight / (height * height);
		System.out.println(bmi);
				
	}

}
