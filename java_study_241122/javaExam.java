package java_study_241122;

import java.util.Scanner;

public class javaExam {

	public static void main(String[] args) {
		
		//문제 1. 1부터 10까지의 숫자를 출력하는 프로그램을 작성하세요.
		for(int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}System.out.println();

		//문제2. 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램을 작성하세요. 
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}System.out.println();
		
		//문제3. 1부터 100까지의 숫자 중 짝수 개수를 구하는 프로그램을 작성하세요.
		int count = 0;
		for(int i = 1; i < 101; i ++) {
			if(i % 2 == 0) {
				count += 1;
			}
		}System.out.println("짝수 개수: " + count);
		
		//문제4. 사용자로부터 입력받은 숫자의 구구단을 출력하는 프로그램을 작성하세요. 
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.print(num + "x" + i + "=" + (num*i) + "\t");
		}System.out.println();
		
		//문제5. 1부터 100까지의 숫자 중 3의 배수의 합을 구하는 프로그램을 작성하세요. 
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}System.out.println("3의 배수의 합: " + sum);
		
		//문제6. 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램을 작성하세요.
		int mul = 1;
		System.out.print("숫자 입력: ");
		int num2 = scan.nextInt();
		for(int i = num2; i > 0; i--) {
			 mul *= i;
		}System.out.println(mul);
		
		//문제7. 1부터 100까지의 숫자 중 3의 배수는 "Fizz", 5의 배수는 "Buzz",
		//3과 5의 공배수는 "FizzBuzz"를 출력하고, 나머지 숫자는 그대로
		//출력하는 프로그램을 작성하세요.
		for(int i = 1; i < 101; i++) {
			
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print("FizzBuzz ");
			}else if(i % 3 == 0) {
				System.out.print("Fizz ");
			}else if(i % 5 == 0) {
				System.out.print("Buzz ");
			}else {
				System.out.print(i + " ");
			}
		}System.out.println();
		
		//문제8. 1부터 10까지의 합을 구하는 프로그램 작성하기
		int sum2 = 0;
		for(int i = 1; i < 11; i++) {
			sum2 += i; 
		}System.out.println("합: " + sum2);
		
		//문제11. 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 
		//처음 세균의 마리수 n과 경과한 시간 t가 변수로 주어질 때 t시간 후 세균의 수를 출력하세요.
		int n = 2;
		int t = 10;
		
		for(int i = t; i > 0; i--) {
			n *= 2;
		}System.out.println("세균의 수: " + n + "마리");
		
		//문제12. 1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될 때까지
		//다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다. 
		//1-1. 입력된 수가 짝수라면 2로 나눕니다. 
		//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
		//2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다. 
		//주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 
		//1이 됩니다. 위 작업을 몇 번이나 반복해야 출력하시오.
		int n2 = 6; //주어진 수
		int count2 = 0;
		while(n2 != 1) {
			if(n2 % 2 == 0) {
				n2 /= 2;
				count2 += 1;
			}else {
				n2 = (n2 * 3) + 1;
				count2 += 1;
			}
		}System.out.println("반복 횟수: " + count2);
		
				
		
		
		
		
		
		
	}

}
