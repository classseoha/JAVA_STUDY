package java_study_241121;

import java.util.Scanner;

public class javaStudy1121_01 {

	public static void main(String[] args) {
		
		//예제1. 시험 점수가 80점이 이상이면 합격 판별을 하는 프로그램을 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시험점수 입력:");
		int score = scan.nextInt();
		
		if (score >= 80) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		//else는 단독적으로 사용할 수 없고, if 다음에만 작성할 수 있음
		
		//중첩 if문: 조건이 여러가지일 때 사용함
		System.out.print("점수 입력: ");
		int score2 = scan.nextInt();
		if (score2 >= 90 && score2 <= 100) {
			System.out.println("A등급");
		}else if (score2 < 90 && score2 >= 80) {
			System.out.println("B등급");
		}else if (score2 < 80 && score2 >= 70) {
			System.out.println("C등급");
		}else {
			System.out.println("F등급");
			
		}
		
			
		

	}

}
