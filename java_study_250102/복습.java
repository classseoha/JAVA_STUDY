package java_study_250102;

import java.util.ArrayList;

public class 복습 {
	
	public static void main(String[] args) {
		
		/*
		 * ArrayList는 자바에서 가장 많이 사용되는 자료구조 중 하나
		 * 일반 배열과 비슷하지만 크기가 유동적으로 변할 수 있는 동적 배열이라고 생각하면 됨
		 * 
		 * 일반 배열은 크기가 고정된 장바구니라면
		 * ArrayList는 필요에 따라 크기가 늘어나는 장바구니
		 * 
		 * ArrayList의 주요 특징
		 * 1. 일반 배열과 다르게 사이즈를 선언할 필요 없음
		 * 2. 클래스 타입(래퍼런스 타입)만 추가할 수 있음(int, double, boolean 같은 거 안됨)
		 */
		
		//Integer: wrapper 클래스
		ArrayList<String> shoppingList = new ArrayList<>();
		//ArrayList 생성(String 타입의 항목을 저장할 수 있는 리스트)
		shoppingList.add("우유"); //항목추가, 장바구니에 물건 넣는 것과 비슷
		shoppingList.add("계란"); //항목추가, 장바구니에 물건 넣는 것과 비슷
		shoppingList.add("빵"); //항목추가, 장바구니에 물건 넣는 것과 비슷
		
		//장바구니에 있는 모든 항목 출력
		System.out.println("장바구니 내용: " + shoppingList);
		
		//장바구니에 있는 항목 하나씩 출력하기
		for(String s : shoppingList) {
			System.out.println("장바구니 내용: " + s);
		}
		
		//특정 위치에 항목 추가
		shoppingList.add(1, "치즈");
		//수정된 장바구니 내용 출력
		System.out.println("장바구니 내용: " + shoppingList);
		
		//항목 개수 확인
		System.out.println("장바구니에 담긴 항목 수: " + shoppingList.size());
		
		//특정 항목이 있는지 확인
		if(shoppingList.contains("빵")) {
			System.out.println("빵 있음");
		}else {
			System.out.println("빵 없음");
		}
		
		//특정 항목 제거
		shoppingList.remove("계란"); //장바구니에서 특정 물건을 꺼내는 것과 같음
		//최종 장바구니 내용 출력
		System.out.println("최종 장바구니: " + shoppingList);
		
		
	}

}
