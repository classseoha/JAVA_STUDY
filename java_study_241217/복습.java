package java_study_241217;

//클래스는 필드변수(전역변수), 메소드, 생성자(리턴타입이 없는 메소드)로 구성됨
class 자동차 {
	/* 
	 * 필드변수
	 * 1. default 초기값이 존재(ex. String은 null 값이 자동으로 대입, int는 0 값이 자동으로 대입)
	 * 2. 모든 메소드에서 필드변수를 사용할 수 있음
	 * 3. 실무에서는 필드변수보다 속성(attribute)이라고 부름 (ex. 저 클래스의 어트리븃 값 확인했어?)
	 */
	String 브랜드명;
	String 자동차타입;
	
	public 자동차() { //기본(default) 생성자
		/*
		 * 기본생성자 특징
		 * 1. 메소드 이름이 클래스 이름과 동일
		 * 2. 리턴타입이 없음
		 * 3. 필드변수 값을 초기화하기 위해 사용
		 */
	}
	/*
	 * public: 접근지정자(*public, *private, protected, default)
	 * int: 리턴 데이터 타입
	 * getNumber: 메소드 이름(동사)
	 * (int x, int y): 파라미터 or 인자 or 인수
	 */
	public int getNumber(int x, int y) {
		int result = x + y;
		return result;
	}
	/*
	 * 구매한 옷의 가격 int price가 파라미터로 주어졌을 때
	 * 지불해야 할 금액을 return 하도록 getMoney 함수(메소드) 로직 완성하기
	 */
	public int getMoney(int price) {
		if(price >= 500000) {
			price *= 0.8;
		}else if(price >= 300000) {
			price *= 0.9;
		}else if(price >= 100000) {
			price *= 0.95;
		}else {
			return price;
		}
		return price;
	}
	
	//정수를 담고 있는 배열 arr가 파라미터로 주어졌을 때, arr의 평균값을 리턴하는 함수 getAvg를 완성해보세요.
	public int getAvg(int[] arr) {
		int result = 0; //메소드 안에 있는 변수 = 지역변수(지역변수는 초기화 해줘야 함)
		for(int i : arr) {
			result += i;
		}
		return result / arr.length;
	}
	
	//정수를 담고 있는 배열 arr가 파라미터로 주어졌을 때, 배열 값 중 원소가 짝수면 해당 원소를 2로 나누고 다시 배열에 대입하여 최종 배열 arr2를 리턴하시오.
	public int[] getArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				arr[i] = arr[i] / 2;
			}
		}
		return arr;
	}
	
	//정수를 담고 있는 배열 arr가 파라미터로 주어졌을 때, 배열 arr에 총합을 return하는 getArrSum을 만들어보시오.
	public int getArrSum(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
}
public class 복습 {

	public static void main(String[] args) {
		
		자동차 car1 = new 자동차(); 
		//new: 클래스를 호출(인스턴스화)
		//자동차(): default 생성자
		
		int 리턴값 = car1.getNumber(10, 20);
		System.out.println("리턴 결과: " + 리턴값);
		
		int price = car1.getMoney(550000);
		System.out.println("금액: " + price);
		
		int[] arr = {1,2,3,4,5};
		int Avg = car1.getAvg(arr);
		System.out.println("리스트 평균값: " + Avg);
		
		int arrSum = car1.getArrSum(arr);
		System.out.println("리스트 총합: " + arrSum);
		}
	}