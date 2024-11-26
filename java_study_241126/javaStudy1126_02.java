package java_study_241126;

public class javaStudy1126_02 {

	public static void main(String[] args) {
		
		//배열
		//중요도 순서 배열 > for문 > if/else
		
		/*
		 * 배열은 <<같은 타입>>의 데이터들이 순차적으로 저장되는 <<공간>>
		 * 배열은 0부터 시작됩니다.
		 * why? 0부터 시작될까요? >> 미국은 0부터 숫자를 셈
		 */

		int[] arr = {10,20,30,40}; //배열 초기화
		//arr라는 int형 배열에 총 4개의 데이터를 저장함
		
		System.out.println("0번째 배열값: " + arr[0]);
		System.out.println("1번째 배열값: " + arr[1]);
		
		int sum  = arr[1] + arr[3];
		System.out.println("합: " + sum);
		
		//순서 = 인덱스(프로그래밍에서는 순서를 인덱스라고 한다.)
		
		int[] arr2 = {10,20,30,40,10,20,30,40,10,20,30,40};
		//배열에 들어있는 값이 많아질 때는 인덱스 번호를 이용해서 조회하는게 한계가 있음
		//배열 안에 있는 값을 효과적으로 가져오기 위해서는 <<반복문>>을 사용해야 합니다.
		//배열하고 for문은 친구임
		
		//arr2.length : 배열 길이를 나타냄
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}System.out.println();
		System.out.println("배열의 길이: " + arr2.length);
		
		//for문 이용해서 arr3에 있는 값 중 짝수만 출력하기
		int[] arr3 = {2,3,4,5,6};
		
		for(int i = 0; i < arr3.length; i++) {
			if(arr3[i] % 2 == 0) {
				System.out.print(arr3[i] + " ");
			}
		}System.out.println();
		
		//arr3에 있는 값의 총합과 평균값을 구하시오.
		int sum2 = 0;
		for(int i = 0; i < arr3.length; i++) {
			sum2 += arr3[i];
		}System.out.println("총합: " + sum2 + "\n평균값: " + sum2/arr3.length);
		
		//for문을 이용해서 arr4에 있는 3의 배수 총합 출력하기
		int[] arr4 = {1,2,3,4,5,6,7,8,9,10};
		int sum3 = 0;
		
		for(int i = 0; i < arr4.length; i++) {
			if(arr4[i] % 3 == 0) {
				sum3 += arr4[i];
			}
		}System.out.println("3의 배수 총합: " + sum3);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
