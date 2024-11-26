package java_study_241126;

import java.util.Scanner;

public class 예습 {

	public static void main(String[] args) {
		
		//양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 화면에 출력하는 프
		//로그램을 작성하시오.
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		
		System.out.println("양수 5개 입력: ");
		for(int i = 0; i < 5; i++) {
			intArray[i] = scan.nextInt();
			if(intArray[i] > max) {
				max = intArray[i];
						
			}
		}System.out.println("입력된 수 중 가장 큰 수는 " + max + " 입니다.");
		
		
		//배열의 length 필드를 이용하여 배열 크기만큼 키보드에서 정수를 입력 받
		//고 평균을 구하는 프로그램을 작성하시오.
		int[] intArray2 = new int[5];
		int sum = 0;
		System.out.println("양수 5개 입력: ");
		for(int i = 0; i < intArray2.length; i++) {
			intArray2[i] = scan.nextInt();
		}
		for(int i = 0; i < intArray2.length; i++) {
			sum += intArray2[i];
		}
		System.out.println("배열 원소의 평균은 " + sum / intArray2.length + " 입니다.");
			
		
		//배열이나 나열(enumeration)의 각 원소를 순차적으로 접근하는데 유용한 for 문
		 int[] num = {1,2,3,4,5};
		 int sum2 = 0;
		 
		 for(int i : num) {
			 sum2 += i;
		 }System.out.println(sum2);
		 
		 
		 //한 회사의 지난 3년간 분기별 매출의 총액과 연평균 매출을 구하는 프로그
		 //램을 작성하시오.
		int arr[][] = {{90,90,110,110}, {120,110,100,110}, {120,140,130,150}};
		int sum3 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum3 += arr[i][j];
			}
		} System.out.println("3년간 매출 총액: " + sum3 + "\n연평균 매출: " + sum3/arr.length);
	}

}
