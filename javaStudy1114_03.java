package java_study_241114;

import java.util.Scanner; // Scanner의 기능을 사용할 때 import 키워드를 사용해서 불러옴

public class javaStudy1114_03 {

	public static void main(String[] args) {
		
		// Scanner를 이용한 키 입력
		Scanner scan = new Scanner(System.in); // 데이터를 입력 받을 때 사용
		// ctrl + shift + o
		
		// 문제1. 두 개의 정수를 입력받아 그 합을 출력하기
		System.out.print("첫번째 정수 입력: ");
		int x = scan.nextInt(); // 정수형 입력 받기
		System.out.print("두번째 정수 입력: ");
		int y= scan.nextInt();
		
		System.out.println("두 정수의 합: " + (x + y));
		System.out.println("두 정수의 곱: " + (x * y));
		System.out.println("두 정수를 나눈 값: " + (x / y));
		
		// 문제2. 실수형 변수 height을 선언하고 180.7을 할당(대입)하는 코드 작성하기
		double height = 180.7;
		
		// 문제3. 입력받은 두 정수형 평균 값 구하기
		System.out.print("a값 입력: ");
		int a = scan.nextInt();
		System.out.print("b값 입력: ");
		int b = scan.nextInt();
		
		// 평균: 총합 / 총 개수
		int avg = (a + b) / 2;
		System.out.println("입력받은 두 정수의 평균은: " + avg + " 입니다.");
		
		// 문제4. 사용자로부터 이름(문자열)과 나이(정수형)을 입력받아
		// "안녕하세요, []님! 당신은 []살 입니다." 라는 메세지를 출력하세요.
		System.out.print("이름: ");
		String name = scan.next();
		System.out.print("나이: ");
		int age = scan.nextInt();
		
		System.out.println("'안녕하세요, " + name + "님! 당신은 " + age + "살 입니다.'");
		
		
	}

}
