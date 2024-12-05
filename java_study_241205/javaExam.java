package java_study_241205;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class javaExam {

	public static void main(String[] args) {
		
		//문제1. ○○은 final 키워드를 사용합니다. 실행 중 값 변경이 불가능한 게 특징입니다.
		//○○은 무엇일까요? 상수
		
		//문제2. 문자형변수 x를 선언하고 “10”을 할당 후 정수형 변수 y를 선언하고 x의 값을 y에 대입하세요.
		//문자에서 정수형으로 '형변환' 해야합니다.
		String x = "10";
		int y = Integer.parseInt(x);
		System.out.println(y);
		
		//문제3. 다음 중 잘못된 식별자(변수이름)는? 3apple
		
		//문제4. 1부터 100까지의 숫자 중 짝수인지 홀수인지 판별하는 프로그램을 작성해주세요
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				System.out.println(i + "는(은) 짝수");
			}else {
				System.out.println(i + "는(은) 홀수");
			}
		}
		
		//문제5. boolean 면허증소지 = true;
		//boolean 운전가능 = !면허증소지;
		//최종 운전가능 값은 무엇일까요? false
		
		//문제6. 1부터 100까지의 숫자 중 3의 배수의 합을 구하는 프로그램을 작성하세요.
		int sum = 0;
		
		for(int i = 1; i < 101; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}System.out.println("합: " + sum);
		
		//문제7. 길동이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
		//피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 출력하세요.
		//예) 15명이 최소 한 조각씩 먹기 위해서 최소 3판이 필요합니다. n이 15라고 가정하면 피자는 3판이 필요합니다.
		int n = 15; //사람의 수
		int cut = 7;
		int pizza = 0;
		
		if(n % cut > 0) {
			pizza = (n / cut) + 1;
		}System.out.println("피자: " + pizza);
		
		//문제8. 사용자로부터 정수를 입력받아 팩토리얼을 계산하는 프로그램을 작성하세요.
		//(예: 5! = 5 * 4 * 3 * 2 * 1)
		System.out.print("팩토리얼 할 정수 입력: ");
		Scanner scan = new Scanner(System.in);
		int pack = scan.nextInt();
		System.out.print(pack + "! = ");
		
		for(int i = pack; i > 0; i--) {
			System.out.print(i + " ");
			if(i == 1) {
				break;
			}
			for(int j = 0; j < 1; j++) {
				System.out.print("* ");
			}
		}
		
		//문제9. 2부터 5까지의 구구단을 출력하는 프로그램을 작성하세요.
		for(int i = 2; i < 6; i++) {
			System.out.println();
			for(int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
		}
		
		//문제10. 다음과 같은 패턴을 출력하는 프로그램을 작성하세요.
		for(int i = 0; i < 4; i++) {
			System.out.println();
			for(int j = 4; j > i; j--) {
				System.out.print("*");
			}
		}System.out.println();
		
		//문제11. 사용자로부터 문자열을 입력받아 그 문자열의 길이를 출력하는 프로그램을 작성하세요.
		//단, 길이가 11 이상인 문자열은 “아이디는 10글자 이하로 작성해주세요.” 라고 출력할 것.
		System.out.print("아이디 입력: ");
		String id = scan.next();
		
		if(id.length() <= 10) {
			System.out.println("아이디가 입력되었습니다.");
		}else {
			System.out.println("아이디는 10글자 이하로 작성해주세요.");
		}
		
		//문제12. 배열에 대한 설명 중 다른 것은? 반복문을 이용하여 처리하기에 적합하지 않은 자료구조다.
		
		//문제13. 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
		//배열에서 가장 큰 값을 작성하세요.
		int[] arr = new int[10];
		int max = 0;
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < 10; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}System.out.println("max 값: " + max);
		
		//문제14. 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
		//배열의 모든 요소의 평균과 합산을 출력하는 프로그램을 작성하세요.
		int[] arr2 = new int[10];
		int sum2 = 0;
		
		for(int i = 0; i < 10; i++) {
			arr2[i] = (int)(Math.random()*100) + 1;
		}System.out.println(Arrays.toString(arr2));
		
		for(int i = 0; i < 10; i++) {
			sum2 += arr2[i];
		}
		int avg = (sum2 / 10);
		System.out.println("합: " + sum2 + ", 평균: " + avg);
		
		//문제15. 문자열 "Java Programming"에서 'a'의 개수를 세는 코드를 작성하세요.
		String a = "Java Programming";
		String[] aArr = a.split("");
		int cnt = 0;
		
		for(String i : aArr) {
			if(i.equals("a")) {
				cnt++;
			}
		}System.out.println("a 개수: " + cnt);
		
		//문제16. 아이스 아메리카노는 한잔에 5,500원입니다.
		//money가 변수로 주어질 때, 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 출력하시오.
		//예) 15000원이면 커피 2잔과 4000원이 남습니다.
		int money = 15000;
		int americano = 5500;
		int cnt2 = 0;
		
		while(money >= 5500) {
			money -= americano;
			cnt2++;
		}System.out.println("커피: " + cnt2 + "잔, 잔돈: " + money);
		
		//문제17. 길동는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
		//길동이네 반 친구들의 키가 담긴 정수 배열 array와 길동이의 키 height가
		//변수로 주어질 때, 길동이보다 키 큰 사람 수를 출력하시오.
		//예) 149, 180, 192, 170 중 길동이보다 키가 큰 사람은 180, 192, 170으로 세 명입니다.
		int[] array = {149, 180, 192, 170};
		int height = 167;
		int cnt3 = 0;
		
		for(int i : array) {
			if (height < i) {
				cnt3++;
			}
		}System.out.println("길동이보다 키 큰 사람 수: " + cnt3);
		
		
		//문제18. 군 전략가 길동이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
		//1. 암호화된 문자열 cipher를 주고받습니다.
		//2. 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
		//문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 출력하시오.
		//예) "dfjardstddetckdaccccdegk" 의 4번째, 8번째, 12번째, 16번째, 20번째,
		//24번째 글자를 합친 "attack"을 출력합니다.
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		String[] cipherArr = cipher.split("");
		
		System.out.print("암호: ");
		for(int i = 0; i < cipherArr.length; i++) {
			if((i+1) % 4 ==0) {
				System.out.print(cipherArr[i]);
			}
		}System.out.println();
		
		//문제19. 전화번호 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한
		//나머지 숫자를 전부 *으로 가린 문자열을 출력하는 프로그램을 완성해주세요.
		//예) 027778888은 *****8888 / 01033334444은 *******4444가 나와야 합니다.
		String phone_number = "0171238888";
		String[] phoneArr = phone_number.split("");
		
		for(int i = 0; i < phoneArr.length; i++) {
			if(i < phoneArr.length-4) {
				System.out.print("*");
			}else {
				System.out.print(phoneArr[i]);
			}
		}System.out.println();
		
		//문제20. ○○치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
		//쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다. 
		//시켜먹은 치킨의 수 chicken이 변수로 주어질 때, 받을 수 있는 최대 서비스 치킨의 수를 출력하세요.
		/*예) 
		1. 1081마리를 주문하면 쿠폰이 1081장 발급되므로 서비스 치킨 108마리를
		주문할 수 있습니다. 그리고 쿠폰이 1장 남습니다.
		2. 108마리를 주문하면 쿠폰이 108장 발급되므로 서비스 치킨 10마리를
		주문할 수 있습니다. 그리고 쿠폰이 8장 남습니다.
		3. 10마리를 주문하면 쿠폰이 10장 발급되므로 서비스 치킨 1마리를
		주문할 수 있습니다.
		4. 1마리를 주문하면 쿠폰이 1장 발급됩니다.
		5. 가지고 있는 쿠폰이 총 10장이므로 서비스 치킨 1마리를 추가로
		주문할 수 있습니다.
		6. 따라서 108 + 10 + 1 + 1 = 120 을 출력합니다.
		*/
		int chicken = 100;
		int totalServiceChicken = 0; 
	    int coupon = chicken;  

	    while (coupon >= 10) {
	         int serviceChicken = coupon / 10;  
	         totalServiceChicken += serviceChicken;  
	         coupon = coupon % 10 + serviceChicken;  
	        }
	    System.out.println("받을 수 있는 최대 서비스 치킨의 수: " + totalServiceChicken);
		
		//문제21. 문자열 my_string이 변수로 주어집니다. my_string에서 중복된 문자를 제거하고
		//하나의 문자만 남긴 문자열을 출력하세요.
		//예) "people"에서 중복된 문자 "p"와 "e"을 제거한 "peol"을 출력합니다.
		String my_string = "people";
		String[] myArr = my_string.split("");
		String notOverlap = ""; 
		
		for(int i = 0; i < myArr.length; i++) {
				if(!notOverlap.contains(myArr[i])) {
					notOverlap += myArr[i];
				}
			}
		System.out.println(notOverlap);
		
		/*문제22. 개미 군단이 사냥을 나가려고 합니다. 개미군단은 사냥감의 체력에 딱 맞는
		병력을 데리고 나가려고 합니다. 장군개미는 5의 공격력을, 병정개미는 3의
		공격력을 일개미는 1의 공격력을 가지고 있습니다.
		예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고
		가도 되지만, 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면
		더 적은 병력으로 사냥할 수 있습니다. 사냥감의 체력 hp가 변수로 주어질 때,
		사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가
		필요한지를 출력하시오.
		예)
		1. hp가 24이므로, 장군개미 네마리 병정개미 한마리 일개미 한마리로
		사냥할 수 있습니다. 따라서 6을 출력합니다.
		2. hp가 999이므로, 장군개미 199 마리 병정개미 한마리 일개미 한마리로
		사냥할 수 있습니다. 따라서 201을 출력합니다.
		*/
		int hp = 24;
		int general_p = 5;
		int soldier_p = 3;
		int worker_p = 1;
		
		int general = hp / general_p;
		hp %= general_p;
		int soldier = hp / soldier_p;
		hp %= soldier_p;
		int worker = hp / worker_p;
		
		System.out.println("필요한 최소 개미 수: " + (general + soldier + worker));
		
		
		
	}

}
