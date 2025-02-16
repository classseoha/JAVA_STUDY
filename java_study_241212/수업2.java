package java_study_241212;

class Person {
	
	//필드변수
	String name;
	int age;
	
	Person(String name, int age) { //생성자: 클래스가 생성될 때(new로 불러올 때) 초기화를 위해 실행되는 특별한 메소드
		/*
		 * 생성자 특징
		 * 1. 생성자 이름과 클래스 이름은 동일해야 함
		 * 2. 생성자는 리턴타입이 없는 "메소드"
		 * 3. 생성자는 파라미터 타입만 있고, 기본(default) 생성자는 아무것도 받지 않는다.
		 * 
		 * 생성자 파라미터의 역할
		 * >> 받은 값을 필드변수에 대입함
		 */
		
		this.name = name; //변수 앞에 this를 쓰면 필드변수를 의미함
		this.age = age;
	}
	
	//void: 리턴타입이 없는 메소드 생성
	public void celebrateBirthday(String name) {
		age++;
		//메소드에서 필드변수 접근 가능
	}
	
}

public class 수업2 {

	public static void main(String[] args) {
		
		Person p = new Person("김철수", 20); //Person 클래스 객체화
		p.name = "김철수";
		p.age = 20;
		System.out.println("제 이름은 " + p.name + "이고, 나이는 " + p.age + "입니다.");
		p.celebrateBirthday("김철수"); //메소드 호출
		//파라미터에 값이 있다면, 메소드를 호출할 때 값을 무조건 넣어줘야 함
		System.out.println("현재 나이: " + p.age);
		
		Person p2 = new Person("김영희", 20);  //생성자로 필드변수 초기화하기
		System.out.println("이름: " + p2.name);  //필드변수 출력
		System.out.println("나이: " + p2.age);
		

	}

}
