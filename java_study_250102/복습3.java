package java_study_250102;

import java.util.HashMap;

public class 복습3 {
	
	public static void main(String[] args) {
		
	
	/*
	 * HashMap은 자바에서 가장 많이 사용되는 자료구조 중 하나
	 * 키(key)와 값(value)의 쌍으로 데이터를 저장하는 동적배열
	 * 
	 * HashMap은 키(key)로 값을 검색하는 사전과 같음
	 * HashMap은 단어(key)로 그에 해당하는 뜻(value)를 찾을 수 있는 사전같은 느낌
	 */

	//HashMap 생성(String 타입의 키와 값을 저장할 수 있는 사전)
	HashMap<String, String> dictionary = new HashMap<>(); //사전 생성
	
	//사전에 단어와 뜻 추가
	dictionary.put("성심당", "성심당은 대전광역시의 베이커리 전문점");
	dictionary.put("엑스포", "엑스포는 1993년 세계 박람회");
	dictionary.put("오월드", "오월드는 대전 중구에 위치한 종합 테마 공원");
	
	//사전에 등록된 모든 단어와 뜻 출력
	System.out.println("사전 내용: " + dictionary);
	//특정 단어의 뜻 찾기(get 안에 키값 넣어주기)
	System.out.println("성심당: " + dictionary.get("성심당"));
	
	//사전에 등록된 단어 개수 확인
	System.out.println("등록된 단어 수: " + dictionary.size());
	
	//특정 단어가 있는지 확인
	if(dictionary.containsKey("엑스포")) {
		System.out.println("사전에 있음");
	}else {
		System.out.println("사전에 없음");
	}
	
	//특정 단어 삭제
	dictionary.remove("오월드");
	//최종 사전 내용 출력
	System.out.println("사전 내용: " + dictionary);
	
	
	
	}
}