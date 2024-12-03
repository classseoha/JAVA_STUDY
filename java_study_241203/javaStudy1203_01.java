package java_study_241203;

import java.util.Arrays;

public class javaStudy1203_01 {

	public static void main(String[] args) {
		
		//복습
		//문제1. 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램을 작성하세요.
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}System.out.println();
		
		//반복문 종류 1.for 2.while 3.do-while(거의 안씀)
		//코드가 한줄일 땐, 중괄호 생략 가능
		
		//문제2. 1부터 10까지의 합을 구하시오.
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum += i;
		}System.out.println("합: " + sum);

		//문제3. 배열, apple이 총 몇개인지 출력하기
		String[] arr = {"apple", "apple", "apple", "banana"};
		int count = 0;
		
		for(String i : arr) {
			if (i.equals("apple")){
				count++;
			}
		}System.out.println("apple 개수: " + count);
		
		//문제4. 옷가게 10만원 이상 사면 5%, 30만원 이상 10%, 50만원 이상 20% 할인해줌
		//구매한 옷의 가격이 580000원일 때 지불해야할 금액 출력
		int price = 580000;
		
		if(price >= 500000) {
			price *= 0.8;
		}else if(price >= 300000) {
			price *= 0.9;
		}else if(price >= 100000) {
			price *= 0.95;
		}
		System.out.println("지불 금액: " + price);
		
		//문제5. 문자열에 들어있는 각 문자를 n만큼 반복한 문자열 출력하기
		String my_string = "hello";
		int n = 3;
		String[] arr2 = my_string.split("");
		for(String i : arr2) {
			for(int j = 0; j < n; j++) {
			System.out.print(i);
		}
		}
		System.out.println();
		//repeat : 특정 문자를 반복함
		String s = "Hello";
		System.out.println(s.repeat(3));
		
		for(String i : arr2) {
			System.out.print(i.repeat(n));
		}System.out.println();
		
		//문제6. (배열)짝수, 홀수 개수 구하기
		//정수형 배열 num_list가 주어질 때 num_list의 원소 중 짝수와 홀수의 개수를 담은
		//정수형 배열 answer_list를 완성하기 *결과 [0, 4]
		int[] num_list = {1,3,5,7};
		int[] answer_list = new int[2];
		int cnt01 = 0;
		int cnt02 = 0;
		for(int i : num_list) {
			if(i % 2 == 0) {
				cnt01++;
			}else {
				cnt02++;
			}
		}answer_list[0] = cnt01;
		answer_list[1] = cnt02;
	
		System.out.println(Arrays.toString(answer_list));
		
		//문제7. 상원이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줌
		//양꼬치 1인분에 12000원, 음료수는 2000원
		//양꼬치 n인분, 음료수 k개 먹었다면 총 얼마를 지불해야 하는지 출력
		int yang = 64;
		int drink = 6;
		int service = 10;
		
		int price2 = (12000 * yang) + (2000 * drink);
		if ((yang/10) > 0) {
			price2 -= (2000*(yang/10));
		}System.out.println(price2);
		
		
		
		
		
		
		
		
	}

}
