package java_study_241119;

import java.util.Scanner;

public class javaExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 문제1. [주관식] 최종 용돈의 값은 얼마일까요? 12,000
		int 용돈 = 10000;
		용돈 -= 3000;
		용돈 += 5000;
		System.out.println(용돈);
		
		// 문제2. [주관식] 최종 점수의 값은 얼마일까요? 170
		int 점수 = 80;
		점수 += 5;
		점수 *= 2;
		System.out.println(점수);
		
		// 문제3. [주관식] 운전가능은 true일까요 false일까요? true
		int 나이 = 20;
		boolean 면허증소지 = true;
		boolean 운전가능 = (나이 >= 18) && 면허증소지;
		System.out.println(운전가능);
		
		// 문제4. [주관식] 운전가능은 true일까요 false일까요? false
		boolean 면허증소지2 = true;
		boolean 운전가능2 = !면허증소지2;
		System.out.println(운전가능2);
		
		// 문제5. 정수형 변수 a와 b를 선언하고 a에 10을 b에 5를 할당 후
		// 두 개의 정수 a와 b를 곱한 결과를 출력하는 코드를 작성하세요.
		int a = 10;
		int b = 5;
		System.out.println(a *= b);
		
		// 문제6. boolean p = true와 boolean q = false가 있을 때, 
		// p && q의 결과는 무엇인지 출력하시오.
		boolean p = true;
		boolean q = false;
		System.out.println(p && q);
		
		// 문제7. 원의 반지름이 주어졌을 때, 원의 면적을 계산하는 프로그램을 작성하세요.
		final double PI = 3.14;
		double radius = 5.0;
		System.out.println("원의 면적: " + (PI * (radius *= radius)));
		
		// 문제8. 실수형 변수 weight과 height을 선언하고 weight에 70.5를 할당, 
		// height에는 1.77를할당 후 체질량 지수를 계산하는 프로그램을 작성하세요. 
		double weight = 70.5;
		double height = 1.77;
		int bmi = (int)(weight / (height * height));
		System.out.println(bmi);
		
		// 문제9. [주관식] 최종 대기번호는 몇번일까요? 3
		int 대기번호 = 1;
		System.out.println("다음 번호: " + 대기번호++);
		System.out.println("다음 번호: " + 대기번호++); 
		System.out.println(대기번호);
		
		// 문제10. 2024년 기준 길동이의 나이 age가 주어질 때, 길동이의 출생 연도를 출력하는
		// 프로그램을 작성하시오. (한국 나이)
		int age = 32;
		int year = 2024;
		int result = 0; 
		
		result = year - (age -= 1);
		System.out.println(result);
		
		// 문제11. 주어진 돈을 입력받고 500원,100원 동전으로 거스름돈을 받으려고 한다. 
		// 거스름돈 구하는 프로그램을 작성하시오.
		int obak = 500; //500원
		int bak = 100; //100원
		System.out.print("거스름돈을 입력하세요 : ");
		int myMoney = scan.nextInt();
		int 오백원 = (int)(myMoney / obak);
		System.out.println("오백원: " + 오백원 + "개");
		System.out.println("백원: " + ((myMoney - (오백원*500)) / bak) + "개");


	}

}
