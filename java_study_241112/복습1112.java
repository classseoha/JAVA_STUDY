package java_study_241112;

import java.util.Scanner;

public class 복습1112 {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 20;
		String address = "대전시";
		String hobby = "유튜브 시청";
		String mbti = "ESTJ";
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		System.out.println("취미: " + hobby);
		System.out.println("MBTI: " + mbti);
		
		// name ~ mbti: '변수명'
		// 변수명명 시 대문자x, 소문자로 만들어야 함(개발자끼리 약속)
		
		// 입력받기
		Scanner scan = new Scanner(System.in);
		// 입력 후 ctrl + shift + o 누르기
		
		System.out.print("이름을 입력해주세요. >> ");
		String n = scan.next();
		System.out.println("입력하신 이름은: " + n + " 입니다.");
		
		System.out.print("MBTI를 입력해주세요. >> ");
		String m = scan.next();
		System.out.println("MBTI는 " + m + " 입니다.");
		
		System.out.print("나이를 입력해주세요. >> ");
		int a = scan.nextInt();
		System.out.println("나이는 " + a + " 입니다.");

	}
	

}
