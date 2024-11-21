package java_study_241121;

import java.util.Scanner;

public class javaExam {

	public static void main(String[] args) {
		
		//문제1. if의 설명 중 다른 하나는?
		//3번
		
		//문제2. [객관식] 위 코드를 해석하고 if와 else 둘 중 어느 구문이 실행될까요? 
		//1번
		
		//문제3. 두 정수를 입력받아 큰 수를 출력하는 프로그램을 작성하세요. 
		Scanner scan = new Scanner(System.in);
		System.out.print("A 정수 입력: ");
		int a = scan.nextInt();
		System.out.print("B 정수 입력: ");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println(a);
		}else if (a < b) {
			System.out.println(b);
		}else {
			System.out.println("두 수는 같습니다.");
		}
		
		//문제4. 사용자의 나이를 입력받아 미성년자(19세 미만)인지 성인인지 판별하는 프로그램을 작성하세요.
		System.out.print("나이 입력: ");
		int age = scan.nextInt();
		
		if (age < 19) {
			System.out.println("미성년자입니다.");
		}else {
			System.out.println("성인입니다.");
		}
		
		//문제5. 입력된 수가 5의 배수인지 판별하는 프로그램을 작성해주세요. 
		System.out.print("숫자 입력: ");
		int five = scan.nextInt();
		
		if (five % 5 == 0) {
			System.out.println(five + "은(는) 5의 배수입니다.");
		}else {
			System.out.println(five + "은(는) 5의 배수가 아닙니다.");
		}
		
		//문제6. 숫자를 입력받아 짝수인지 홀수인지 판별하는 프로그램을 작성해주세요.
		System.out.print("숫자 입력: ");
		int holjjak = scan.nextInt();
		
		if (holjjak % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		//문제7. 숫자를 입력받아 3의 배수, 5의 배수, 3과 5의 공배수, 
		//또는 해당 없음을 출력하는 프로그램을 작성하세요.
		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
		
		if (num % 3 == 0 && num % 5 == 0) {
		System.out.println("3과 5의 공배수");
		}else if(num % 3 == 0) {
			System.out.println("3의 배수");
		}else if (num % 5 == 0) {
			System.out.println("5의 배수");
		}else {
			System.out.println("해당없음");
		}
		
		//문제8. 세 과목(국어,수학,영어)의 점수를 입력받아 평균을 계산하고, 
		//평균이 90점 이상이면 "A", 80점 이상이면 "B", 70점 이상이면 "C",
		//60점 이상이면 "D", 그 미만이면 "F"를 출력하는 프로그램을 작성하세요.
		System.out.print("국어 점수 입력: ");
		int score1 = scan.nextInt();
		System.out.print("수학 점수 입력: ");
		int score2 = scan.nextInt();
		System.out.print("영어 점수 입력: ");
		int score3 = scan.nextInt();
		
		int avg = (((score1 + score2 + score3) / 3) / 10);
		
		switch (avg) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
			default : 
				System.out.println("F");
		}
		
		//문제9. 두 정수를 입력받아 둘 중 하나라도 음수이면 "음수가 포함되어 있습니다.",
		//둘 다 양수이면 "모두 양수입니다."를 출력하는 프로그램을 작성하세요.
		System.out.print("첫번째 정수 입력: ");
		int one = scan.nextInt();
		System.out.print("두번째 정수 입력: ");
		int two = scan.nextInt();
		
		if (one < 0 || two < 0) {
			System.out.println("음수가 포함되어 있습니다.");
		}else if (one > 0 && two > 0) {
			System.out.println("모두 양수입니다.");
		}
		
		//문제10. 사용자로부터 1부터 5까지의 숫자를 입력받아 해당하는 과일 이름을 출력하는 프로그램을 작성하세요.
		//(1: 사과, 2: 바나나, 3: 오렌지, 4: 포도, 5: 복숭아) *switch 이용해서 풀 것
		System.out.print("1~5 중 원하는 숫자 입력: ");
		int fruit = scan.nextInt();
		
		switch(fruit) {
		case 1: 
			System.out.println("사과");
			break;
		case 2: 
			System.out.println("바나나");
			break;
		case 3: 
			System.out.println("오렌지");
			break;
		case 4: 
			System.out.println("포도");
			break;
		case 5: 
			System.out.println("복숭아");
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
		
		//문제11. 길동이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 
		//피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각
		//이상 먹기 위해 필요한 피자의 수를 출력하세요.
		System.out.print("사람 수 입력: ");
		int people = scan.nextInt();
		int pizza = 7;
		int pizzaCount = people / pizza;
		if(people % pizza > 0) {
			pizzaCount++;
		}
		System.out.println("필요한 피자 수: " + pizzaCount);
		
		//문제12. 길동이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%,
		//50만 원 이상 사면 20%를 할인해줍니다. 구매한 옷의 가격 price가 주어질 때, 
		//지불해야 할 금액을 출력하세요. 
		System.out.print("옷 가격 입력: ");
		int price = scan.nextInt();
		
		if (price >= 500000) {
			System.out.println("지불해야 할 금액: " + (int)(price * 0.8) + "원");
		}else if (price >= 300000) {
			System.out.println("지불해야 할 금액: " + (int)(price * 0.9) + "원");
		}else if (price >= 100000) {
			System.out.println("지불해야 할 금액: " + (int)(price * 0.95) + "원");
		}else {
			System.out.println("지불해야 할 금액: " + (int)price + "원");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

	}

}
