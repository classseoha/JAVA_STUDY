package java_study_241205;

import java.util.Arrays;

public class 복습 {

	public static void main(String[] args) {
		
		//사칙연산 - 거스름돈 문제
		int money = 74900;
		int oman = money / 50000 ;
		int man = (money - (50000 * oman)) / 10000;
		int chun = (money - (50000 * oman) - (10000 * man)) / 1000;
		int obaek = (money - (50000 * oman) - (10000 * man) - (1000 * chun)) / 500;
		int baek = (money - (50000 * oman) - (10000 * man) - (1000 * chun) - (500 * obaek)) / 100;
		
		System.out.println("오만원: " + oman + "\n만원: " + man + "\n천원: " + chun + "\n오백원: " + obaek + "\n백원: " + baek);
		
		/*
		*그리드(탐욕) 알고리즘 ex)거스름돈
		*선택의 순간마다 당장 눈앞에 보이는 최적의 상황만을 쫓아 최종 답에 도달하는 방법
		*/
		int 오만원 = 50000;
		int 만원 = 10000;
		int 천원 = 1000;
		int 오백원 = 500;
		int 백원 = 100;
		int 오만원개수 = money / 오만원;
		money = money % 오만원;
		int 만원개수 = money / 만원;
	    money = money % 만원;
	    int 천원개수 = money / 천원;
	    money = money % 천원;
	    int 오백원개수 = money / 오백원;
	    money = money % 오백원;
	    int 백원개수 = money / 백원;
	    money = money % 백원;
	    System.out.println("오만원 : "+오만원개수);
	    System.out.println("만원 : "+만원개수);
	    System.out.println("천원 : "+천원개수);
	    System.out.println("오백원 : "+오백원개수);
	    System.out.println("백원 : "+백원개수);

		//상수: 변하지 않는 값
		//프로그래밍에서 상수표현은 데이터타입 앞에 'final' 키워드가 온다.
		//상수를 표현할 땐 변수 이름을 대문자로 적어야 한다.(개발자끼리 약속)
		final double PI = 3.14;
		
		//문제. 원의 반지름이 주어졌을때, 원의 면적을 계산하는 프로그램을 작성하세요.
		//원의 면적은 PI * 반지름 * 반지름
		double radius = 5.0; //원의 반지름
		double a = PI * radius * radius;
		System.out.println(a);
		
		//문제. 직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 C가
		//변수로 주어질 때, 다른 한변의 길이의 제곱, b를 출력하시오.
		int aa = 3;
		int c = 5;
		int b = (c*c) - (aa*aa);
		System.out.println(b);
		
		//문제. 배열
		int[] arr = {1,3,5};
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		
		//문제. 1번 인덱스 값과 2번 인덱스 값 서로 교환하기(swap)
		int temp = 0;
		temp = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		System.out.println(Arrays.toString(arr));	
		
		//배열 문제가 나오면 무조건 for문
		for(int i : arr) { //for-each문(배열 길이만큼 자동으로 반복)
			System.out.println("i: " + i);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
