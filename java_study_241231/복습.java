package java_study_241231;

import java.util.Scanner;

class A { //A클래스 선언
	private int x; //전역변수 선언
	private int y;
	public int getX() { //get: 전역변수 리턴
		return x;
	}
	public void setX(int x) { //set: 전역변수 값 초기화
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}

public class 복습 {

	public static void main(String[] args) {
	
		//flag(깃발) 값 = true or false
		boolean isFlag = true;
		
		String inputWord = "사과"; //입력받은 문자(가정)
		
		if(inputWord.equals("사과")) { //inputWord가 사과라면
			isFlag = true;
		}
		if(isFlag) {
			//플래그 값을 이용해서 특정 코드를 실행할 수 있음
			System.out.println("플래그 값 변경");
		}
		
		//예시
		boolean isFlag2 = false;
		String book[] = {"책1","책2","책3"}; //배열 선언
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을 책을 입력하세요: ");
		String search = scan.next();
		
		for(String s : book) {
			if(s.equals(search)) { //배열 안에 있는 값과 입력한 값이 동일하다면
				isFlag2 = true;
			}
		}
		if(!isFlag2) { //isFlag2가 false일 때 실행되는 if 코드
			System.out.println("입력한 도서는 해당 도서관에 없습니다.");
		}
		
		A a = new A(); //A클래스 호출
		a.setX(10); //전역변수 x를 10으로 초기화
		System.out.println(a.getX()); //전역변수 x 출력
		
		A[] arr = new A[3]; //객체 배열
		arr[0] = a; //0번째 인덱스에 a 대입
		
		arr[0].getX(); //0번째에 들어간 A클래스 get함수 사용 가능
		
		A b = new A();
		b.setX(20);
		arr[1] = b;
		
		A c = new A();
		c.setX(30);
		arr[2] = c;
		
		int sum = 0;
		for(A i : arr) {
			sum += i.getX();
		}
		System.out.println("총합: " + sum);
		
				
}
	
}
