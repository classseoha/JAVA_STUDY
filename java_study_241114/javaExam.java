package java_study_241114;

import java.util.Scanner;

public class javaExam {

	public static void main(String[] args) {

		// 문제1. 정수형 변수 age를 선언하고 25를 할당하는 코드를 작성 후 출력하세요
		int age = 25;
		System.out.println(age);

		// 문제2. ○○은 final 키워드를 사용합니다. 실행 중 값 변경이 불가능한 게 특징입니다. 
		// ○○은 무엇일까요? 상수
		
		// 문제3. 문자열 "Hello, Java!"를 출력하는 코드를 작성하세요.
		String s1 = "Hello, Java!";
		System.out.println(s1);
		
		// 문제4. 두 개의 정수 a와 b를 더한 결과를 출력하는 코드를 작성하세요.
		int a = 10;
		int b = 5;
		System.out.println("정수의 합은: " + (a+b));
		
		// 문제5. 실수형 변수 height으로 선언하고 180.5를 할당하는 코드를 작성하세요.
		double height = 180.5;
		
		// 문제6. 사용자로부터 이름과 나이를 입력받아, 
		// "안녕하세요, [이름]님! 당신은 [나이]살입니다."라는 메시지를 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.next();
		System.out.print("나이: ");
		int age2 = scan.nextInt();
		
		System.out.println("안녕하세요, " + name + "님! 당신은 " + age2 + "살입니다.");
		
		// 문제7. 다음 각 데이터 타입에 맞는 변수를 선언하고 적절한 값으로 초기화하세요. 
		// 1. 정수형 (int)
		int i = 10;
		// 2. 실수형 (double)
		double d = 10.55;
		// 3. 문자형 (char)
		char c = 'a';
		// 4. 논리형 (boolean)
		boolean tf = true;
		
		// 문제8. 사용자로부터 두 개의 정수를 입력받아, 그 합을 출력하세요.
		System.out.print("첫번째 정수: ");
		int aa = scan.nextInt();
		System.out.print("두번째 정수: ");
		int bb = scan.nextInt();
		
		System.out.println("두 정수의 합: " + (aa + bb));
		
		// 문제9. 문자형변수 x를 선언하고 “10”을 할당 후 정수형 변수 y를 선언하고
		// x의 값을 y에 할당하세요. 
		
		String x = "10";
		int y = Integer.parseInt(x);
		System.out.println(y);
		
		// 문제10. 다음 중 잘못된 식별자(변수이름)는? 3번(3apple)
		
		// 문제11. 아래와 같이 사용자로부터 3개의 정수를 입력받아 평균을 출력하세요.(소수점 제외)
		System.out.print("숫자1: ");
		int aaa = scan.nextInt();
		System.out.print("숫자2: ");
		int bbb = scan.nextInt();
		System.out.print("숫자3: ");
		int ccc = scan.nextInt();
		
		System.out.println("평균: " + ((aaa + bbb + ccc) / 3));
		
		// 문제12. 아래와 같이 사용자로부터 정수를 입력받고, 해당 정수의 10%는 몇인지 출력하시오.
		System.out.print("숫자를 입력하세요: ");
		int aaaa = scan.nextInt();
		
		System.out.println("해당 값의 10%는? " + (aaaa / 10) );
 
	}

}
