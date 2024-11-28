package java_study_241128;

import java.util.Arrays;

public class javaStudy1128_01 {

	public static void main(String[] args) {
		
		//1차원 배열
		int[] arr = {1,2,3}; //배열 선언과 동시에 값 초기화
		
		//2차원 배열
		int[][] arr2 = {{1,2,3},{1,2,3},{1,2,3}};
		
		//2차원 배열 출력해보기
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.println("2차원 배열 출력: " + arr2[i][j]);
			}
		}
		
		//배열 형변환
		int[] arr3 = new int[3]; //정수형 배열
		String[] arr4 = new String[4]; //문자열 배열
		
		arr3[0] = 3;
		arr4[0] = "apple";
		
		//arr4 첫번째 인덱스에 3 넣기
		//arr4[1] = 3; //arr4는 문자열 배열이기 떄문에 숫자 대입 불가능
		arr4[1] = Integer.toString(arr3[0]);
		
		System.out.println(Arrays.toString(arr4));
		
		

	}

}
