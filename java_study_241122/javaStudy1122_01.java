package java_study_241122;

public class javaStudy1122_01 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			System.out.print(i + " " );			
		}System.out.println();
		
		//"안녕하세요" 20번 출력하기
		for(int j = 0; j < 20; j++) {
			System.out.print("안녕하세요 ");
		}System.out.println();
		
		for(int i = 0; i <9; i++) {
			System.out.print("i:" + i + " ");
		}System.out.println();
		
		/*
		 * fpr문은 이것만 알아두자
		 * 1. for문 실행 순서: 초기식 > 조건식 > 코드실행 > 증감식
		 * 2. 조건식이 만족할 때까지 반복함
		 */
		
		//1~10까지 합계 구하기
		//1+2+3+4+5+6+7+8+9+10=55;
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			if(i == 10) {
				System.out.print(i);
				sum += i;
				break;
			}
			System.out.print(i + " + ");
			sum += i;
		}System.out.print(" = " + sum);
		System.out.println();
		
		//1~20까지의 숫자 중 짝수만 출력하기
		for(int i = 1; i < 21; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}System.out.println();
		
		//1~30까지의 숫자 중 5의 배수만 출력하기
		for(int i = 1; i < 31; i++) {
			if(i % 5 == 0) {
				System.out.print(i + " ");
			}
		}System.out.println();
		
		//break 사용
		for(int i = 1; i <= 5; i++) {
			if(i == 2) {
				System.out.print(i + " ");
				break;
			}System.out.print(i + " ");
		}System.out.println();
		
		int 구구단 = 2;
		for(int i = 1; i <= 9; i++) {
			System.out.print(구구단 + "x" + i + "=" + (구구단*i) + "\t");
			}System.out.println();
		
		//while문은 조건이 참인 동안 코드 블록을 반복적으로 실행하는 반복문
		int i = 1;
		while(i <= 5) {
			System.out.println("while문 i: " + i);
			i++;
		}
		
		//커피 자판기 예제
		int coffee = 10; //커피 10잔
		while(coffee > 0) {
			System.out.println("커피를 판매합니다. 남은 커피: " + coffee);
			coffee--;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
