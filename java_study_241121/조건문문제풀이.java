package java_study_241121;

import java.util.Scanner;

public class 조건문문제풀이 {

	public static void main(String[] args) {
		
		//문제1. 3의 배수 판단
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
		
		//if와 else 안에 코드가 한줄이면 중괄호 생략 가능
		//코드가 한줄이어도 중괄호 쓰는 습관 가지는게 좋음
		if (num % 3 ==0) 
			System.out.println(num + "은(는) 3의 배수입니다.");
		else 
			System.out.println(num + "은(는) 3의 배수가 아닙니다.");
		
		
		//문제2. 변수 y가 5의 배수인지 판단하는 프로그램 작성
		System.out.print("숫자 입력: ");
		int y = scan.nextInt();
		
		if (y % 5 == 0) {
			System.out.println(y + "은(는) 5의 배수입니다.");
		}else
			System.out.println(y + "은(는) 5의 배수가 아닙니다."); {
		}
		
			
		//문제3. 두 정수를 입력받아 큰 수 출력하기
		System.out.print("정수 A를 입력하세요.: ");
		int a = scan.nextInt();
		System.out.print("정수 B를 입력하세요.: ");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println(a);
		}else if (a < b) {
			System.out.println(b);
		}else {
			System.out.println("두 수는 같습니다.");
		}
		
		//문제4. 짝수 구하기
		int 짝수 = 4;
		if (짝수 % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		//문제5. 홀수 구하기
		int 홀수 = 9;
		if (홀수 % 2 != 0) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		//문제6. 3과 5의 공배수 판단
		int 공배수 = 15;
		if (공배수 % 3 == 0 && 공배수 % 5 == 0) {
			System.out.println("공배수입니다.");
		}else {
			System.out.println("공배수가 아닙니다.");
		}
		

	}

}
