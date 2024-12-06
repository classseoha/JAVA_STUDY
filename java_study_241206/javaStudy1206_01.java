package java_study_241206;

import java.util.Arrays;

public class javaStudy1206_01 {

	public static void main(String[] args) {

		/*
		 * <<정렬 알고리즘>> 버블, 선택, 삽입 세개의 알고리즘이 있음
		 * 
		 * 버블 정렬: 인접한 두 원소를 비교하여 큰 값을 뒤로 보내는 과정을 반복, 만들기가 쉽고 직관적일 뿐이지 알고리즘적 관점에서 보면 대단히
		 * 비효율적인 정렬 방식
		 */

		int[] arr = { 7, 4, 5, 1, 3 };
		int temp = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		// 정렬 문제: 버블 정렬을 이용해서 아래 배열을 오름차순으로 정렬하시오.
		int[] array = { 10, 4, 3, 29, 31 };

		for (int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length -i -1; j++) {
				if(array[j] > array[j+1]) {
					int temp2 = array[j+1];
					array[j+1] = array[j];
					array[j] = temp2;
				}
			}

		}System.out.println(Arrays.toString(array));

	}
}