package java_study_241126;

import java.util.Random;

public class javaExam {

	public static void main(String[] args) {
		
		//문제1.  10개의 정수를 저장하는 배열을 선언하고 1부터 10까지의 값으로 초기화한 후,
        //2번째 인덱스와 5번째 인덱스를 곱한 값을 출력하시오.
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}System.out.println("값: " + arr[1] * arr[4]);

		
		//문제2. 1번 문항 이어서 배열에 저장된 값을 모두 더하는 프로그램을 작성하세요.
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}System.out.println("합: " + sum);
		
		//문제3. 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후, 배
        //열의 요소들 중 짝수만 출력하는 프로그램을 작성하세요.
        int[] arr2 = new int[10];
        Random random = new Random(); 
        for(int i = 0; i < arr2.length; i++) {
        	arr2[i] = random.nextInt(100) + 1;
        }System.out.print("랜덤 배열 값: ");
        for(int i = 0; i < arr2.length; i++) {
        	System.out.print(arr2[i] + " ");
        }System.out.println();
        System.out.print("배열 값 중 짝수: ");
        for(int i = 0; i < arr2.length; i++) {
        	if(arr2[i] % 2 == 0) {
        		System.out.print(arr2[i] + " ");
        	}
        }
        System.out.println();
        
        //문제4. 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
        //최댓값을 구하는 프로그램을 작성하세요.
        int[] arr3 = new int[10];
        int max = 0; 
        System.out.print("랜덤 배열 값: ");
        for(int i = 0; i < arr3.length; i++) {
        	arr3[i] = random.nextInt(100) + 1;
        }
        for(int i = 0; i < arr3.length; i++) {
        	System.out.print(arr3[i] + " ");
        }System.out.println();
        
        for(int i = 0; i < arr3.length; i++) {
        	
        	if(max <= arr3[i]) {
        		max = arr3[i];
        	}
        	     		}
        	
        System.out.println("max 값: " + max);
      
		
		
		
		
		
		
	}

}
