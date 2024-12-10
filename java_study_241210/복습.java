package java_study_241210;

import java.util.Arrays;

public class 복습 {

	public static void main(String[] args) {
		
		//연산자
		/*
		 * 가장 많이 사용하는 연산자
		 * 1. 대입연산자
		 * 2. 사칙연산자(+, -, /, %)
		 */

		int x = 10; //초기 선언식
		x = 30;
		System.out.println("x의 최종 값: " + x);
		
		String s = "123";
		String s2 = "456";
		
		String result = s + s2;  //문자가 합쳐짐
		System.out.println("결과: " + result);
		
		int num = Integer.parseInt(result);  //문자가 숫자로 변환
		System.out.println("결과: " + num);
		
		int count = 0;
		count++;
		count++;
		count++;
		System.out.println(count);
		
		//제어문
		/*
		 * if문: 95% 사용
		 * switch문: 5% 정도 사용
		 * 조건문: 특정 조건을 평가하여 그 결과에 따른 다른 코드를 실행한다.
		 * 
		 * if(조건식){
		 *		//코드 작성(조건이 참(true)일 때 실행할 코드
		 *}
		 *
		 *if-else문: 조건이 참일 때와 거짓일 때 각각 다른 코드를 실행
		 *
		 *if(조건식){
		 *
		 *}else{
		 *		//조건이 거짓(false)일 때 실행할 코드
		 *}
		 *
		 *else-if문: 여러개의 조건을 평가
		 *
		 *if(조건식1){
		 *		조건식1이 참일 때 실행
		 *}else if(조건식2){
		 *		조건식2가 참일 때 실행
		 *}
		 */
		
		//무엇이 출력되고 그 이유는 무엇인지 작성하기
		//답: 출력 A
		boolean isData = false;  //bool타입 변수는 앞에 is 먼저 시작함(규칙)
		if(!isData) {
			System.out.println("출력 A");
		}else {
			System.out.println("출력 B");
		}
		
		//두 비밀번호 비교하기
		String password = "123";  //비밀번호
		String rePassword = "456";  //비밀번호 재입력
		
		//'==' : 비교연산자
		//자바에서는 문자를 비교할때 비교연산자가 아니라 equals(문자열 함수)를 사용함
		if(password.equals(rePassword)) { 
			System.out.println("비밀번호가 일치합니다.");
		}
		if(!password.equals(rePassword)) { 
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		
		
		//반복문 복습
		/*
		 * 반복문: 특정 블록의 코드를 여러번 반복해서 실행
		 * for: 반복 횟수가 정해져 있을 때 사용
		 * while: 조건이 참인 동안 반복 실행(반복횟수 모를 때)
		 * 
		 * for(초기화; 조건식; 증감식){
		 *		//반복할 코드
		 *}
		 *
		 * while(조건식){
		 * 		//반복할 코드
		 * }
		 * 
		 * 
		 */
		
		//1부터 10까지의 숫자를 출력하고자 함
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}System.out.println();
		
		//배열: 동일한 데이터 타입의 여러 데이터를 하나의 변수로 관리할 수 있게 해주는 자료 구조
		
		//배열 선언 및 초기화
		int[] arr = {1,2,3,4}; //첫번째 방법
		int[] arr2 = new int[4]; //두번째 방법
		//2. 배열 요소(아이템) 접근 및 조작
		System.out.println("0번 index: " + arr[0] + "요소(아이템)");
		System.out.println("0번 index: " + arr[1] + "요소(아이템)");
		System.out.println("0번 index: " + arr[2] + "요소(아이템)");
		System.out.println("0번 index: " + arr[3] + "요소(아이템)");
		//인덱스 번호로 배열 요소 출력(사용) 가능
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = i + 1;
		}System.out.println(Arrays.toString(arr2));
		
		//배열 요소 값 변경하기
		arr[2] = 50; //2번째 요소에 50 대입(기존 값 변경)
		System.out.println("0번 index: " + arr[2] + "요소(아이템)");
		
		
		//1. score보다 점수 높은 사람 카운트하기
		int[] score = {50,80,100,100,90}; //점수 배열
		int myScore = 77;
		int count2 = 0;
		for(int i : score) {
			if(myScore < i) {
				count2++;
			}
		}System.out.println("High Score: " + count2);
		
		//2. 배열에서 최대값 찾기
		int[] numbers = {12,45,7,23,56,89,34}; //89가 최대값
		int max = 0;
		for(int i : numbers) {
			if (i > max) {
				max = i;
			}
		}System.out.println("최대값: " + max);
		
		//3. 닉네임 중복체크하기
		String[] nickNames = {"사과", "바나나", "오렌지", "포도", "키위"};
		String userNickName = "사과";
		
		for(String i : nickNames) {
			if(i.equals(userNickName)) {
				System.out.println("닉네임이 중복됩니다.");
			}else {
				System.out.println("닉네임이 생성되었습니다.");
			}
		}
		
		boolean isFlag = false;
		for(int i = 0; i < nickNames.length; i++) { //플래그(flag, 깃발)값 (0 아니면 1 의미)
			String temp = nickNames[i];
			if(temp.equals(userNickName)) {
				isFlag = true;
			}
		}
		if(isFlag) {
			System.out.println("닉네임이 중복됩니다.");
		}
		
		//4. 배열의 모든 요소의 합 구하기(for-each로 풀기)
		int[] numbers2 = {5,10,15,20,25};
		int sum = 0;
		
		for(int i : numbers2) {
			sum += i;
		}System.out.println("배열의 합: " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
