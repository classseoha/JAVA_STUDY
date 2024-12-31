package java_study_241231;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 수업 {
	
	public static void main(String[] args) {
		
		//제네릭과 컬렉션즈
		//배열기초 > 객체배열 > 제네릭과 컬렉션즈(공부 순서)
		
		/*
		 * 제네릭과 컬렉션즈란?
		 * 1. 배열처럼 데이터를 저장함
		 * 2. 빠른 접근 속도와 동적 크기 조절이 가능함
		 */
		
		int[] arr = new int[6]; //배열은 저장 공간을 미리 지정해줘야 함
		arr[0] = 10;
		arr[1] = 10;
		arr[2] = 10;
		arr[3] = 10;
		arr[4] = 10;
		arr[5] = 10;
		//배열의 가장 큰 단점은 삭제 기능이 없음
		arr[2] = 0; //나름 삭제..?
		
		//ArrayList 컬렉션
		ArrayList<Integer> list = new ArrayList<Integer>(); //ctrl + shift + o로 임포트하기
		
		/*
		 * 제네릭(<>) 특징
		 * 1. 클래스 타입만 넣을 수 있음, int형을 담고 싶으면 int에 클래스 타입인 Integer를 작성
		 */
		list.add(10); //0번째에 10 추가
		list.add(5); //1번째에 5 추가
		list.add(34); //2번째에 34 추가
		
		int num1 = list.get(0); //0번째 값 가져오기
		System.out.println("조회: " + num1);
		System.out.println("조회: " + list.get(1));
		System.out.println("조회: " + list.get(2));
		
		//list 사이즈 조회
		System.err.println("사이즈 조회: " + list.size());
		list.add(3);
		System.err.println("사이즈 조회: " + list.size()); //사이즈가 동적으로 변경됨
		
		//제거
		list.remove(0); //0번째 저장된 값 삭제
		System.out.println("0번째 요소 조회: " + list.get(0)); //10은 삭제되고 5가 출력
		
		//수정
		list.set(0, 100); //0번째 요소 값 100으로 수정
		System.out.println("0번째 요소 조회: " + list.get(0)); 
	
	
		//전체 출력
		for(int i : list) {
			System.out.println("저장된 값: " + i);
		}
		
		//list에 저장된 총합과 평균 구하기
		list.add(40);
		int sum = 0;
		int avg = 0;
		for(int i : list) {
			sum += i;
		}System.out.println("합: " + sum + ", 평균: " + sum/list.size());
		
		//HashSet 컬렉션즈
		/*
		 * HashSet : 중복 제거가 필요하거나 집합 연산을 수행해야 할 때 유용하게 사용됨
		 * 1. 중복을 허용하지 않고 고유한 요소만 저장
		 */
		
		HashSet<Integer> set = new HashSet<Integer>(); //ctrl + shift + o로 임포트하기
		
		set.add(10); 
		set.add(20); 
		set.add(10); //중복된 값은 무시됨
		System.out.println("set 크기: " + set.size());
		
		//HashSet은 특정요소 조회 불가능(get이 없음)
		//HashSet 요소 값 검색
		set.contains(10); //10이 set에 저장되어 있으면 true, 아니면 false
		//내부에 값이 존재하는지만 판단할 수 있음
		
		//삭제
		set.remove(20);
		//HashSet은 추가와 삭제만 가능함
		System.out.println("set 크기: " + set.size());
		
		//HashMap 컬렉션즈
		/*
		 * HashMap은 마치 사전과 같음
		 * 사전에서 단어(키)를 찾으면 그에 해당하는 뜻(값)이 나오는 것처럼
		 * 키를 사용해 값을 저장하고 검색하는 자료구조
		 */
		
		HashMap<String, Integer> map = new HashMap<>();
		//<String(key), Integer(value)>
		/*
		 * 1. 데이터는 항상 키와 값의 쌍으로 저장됨
		 * 2. 각 키는 중복될 수 없지만, 값은 중복될 수 있음
		 * 3. 키를 사용해 값을 조회함
		 * 4. HashMap은 데이터의 순서를 보장하지 않음
		 */
		
		//데이터 추가
		map.put("사과", 500);
		map.put("포도", 800);
		
		//데이터 조회
		int price = map.get("포도"); //키를 이용해서 값을 조회함
		System.out.println("포도 값은: " + price);
		
		//데이터 수정
		map.put("포도", 2000); //값을 2000으로 수정
		
		//데이터 조회
		price = map.get("포도"); //키를 이용해서 값을 조회함
		System.out.println("포도 값은: " + price);
		
		//데이터 삭제
		map.remove("사과"); //키를 입력해서 삭제
		
		//데이터 존재 확인
		boolean hasBanana = map.containsKey("바나나"); //키 이름에 바나나 있는지 확인
		System.out.println("바나나 있어? " + hasBanana);
		
		//전체 출력
		//keySet으로 모든 키를 가져온 후, 각 키에 해당하는 get() 메소드로 값을 얻을 수 있음
		for(String key : map.keySet()) {
			System.out.println("키: " + key);
			System.out.println("값: " + map.get(key));
		}
		
		
	}
}
