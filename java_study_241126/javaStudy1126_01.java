package java_study_241126;

public class javaStudy1126_01 {

	public static void main(String[] args) {
		
		//이중 for문(중첩 반복)
		//반복문이 다른 반복문을 내포하는 구조
		//이론적으로 2중, 3중, 4중.... n중까지 가능하나, 너무 많은 중첩은 프로그램 구조를
		//복잡하게 한다. 그래서 2중 중첩이 적당하다.
		
		for(int i = 0; i < 3; i++) { //아우터 for문
			//System.out.println("아우터 for문");
			for(int j = 0; j < 3; j++) { //이너 for문
				//System.out.println("이너 for문");
			}
		}
		//아우터 for문이 먼저 실행 >> 이너 for문 모두 실행 >> 아우터 for문 실행....순
		
		//구구단 출력
		for(int i = 2; i < 10; i++) {
			System.out.println("= " + i + "단 =");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}System.out.println();
		
		//직사각형 출력
		int a = 5; //가로 길이
		int b = 3; //세로 길이

		for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();		
		}
		System.out.println();	
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();		
		}
		
		
		System.out.println();	
		
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();		
		}
		
		

	}

}
