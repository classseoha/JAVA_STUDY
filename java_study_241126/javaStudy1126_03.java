package java_study_241126;

import java.util.Random;

public class javaStudy1126_03 {

	public static void main(String[] args) {
		
		//자바에서 배열을 만드는 방법은 총 2가지
		//첫번째
		int[] arr = {2,3}; //값이 처음부터 들어있음
		//두번째
		int[] arr2 = new int[2]; //길이만 생성, 안에 값 x
	
		//값 넣기
		arr2[0] = 10;
		arr2[1] = 20; //정해둔 배열의 공간을 초과하여 값을 부여하면 에러가 남
		
		//배열에 1~100까지 중 랜덤한 값 넣기
		int[] numbers = new int[10];
		Random random = new Random();
		numbers[0] = random.nextInt(100) + 1; //1~100까지의 랜덤값을 0번째 인덱스에 대입함
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100) + 1;
		}
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		

	}

}
