package java_study_241220;

//모든 Java 클래스는 Object를 상속받고 있고 기본 생성자를 가지고 있음
class A extends Object {
	//1. 필드변수(전역변수): 모든 메소드에서 접근 가능
	int x;
	
	public A() {
		/*
		 * 생성자 특장
		 * 1. 리턴타입 없음
		 * 2. 메소드 이름과 클래스 이름이 동일함
		 */
	}
	//오버로딩: 메소드 이름은 동일하나 파라미터 값이 다를 때
	public A(int x) { //파라미터 값이 존재하는 생성자
		this.x = x; //this를 이용해서 파라미터 값을 필드변수 'x'에 대입
	}
	public void showMessage() {
		System.out.println("안녕하세요. 저는 A클래스 입니다.");
	}
}
//extends: 상속하다
//Java는 다중상속을 지원하지 않음 > interface 사용해야 함
//implements: 구현하다(B클래스는 C를 구현함)
class B extends A implements C {
	//B클래스는 '자식클래스', A클래스는 '부모클래스'
	/*
	 * A클래스는 B클래스에 선언된 메소드와 필드변수를 사용할 수 있음
	 * 단, 접근지정자가 public 혹은 protected로 되어있어야 함
	 */
	@Override
	public void showMessage() { //부모클래스 메소드 재정의(오버라이딩)
		System.out.println("저는 B클래스 입니다.");
	}

	@Override
	public void showMessage2() {
		//인터페이스에 정의된 메소드를 강제로 구현해야하는 특징을 가짐(계약 관계)
		System.out.println("인터페이스 메소드 재정의하기");
	}
}

interface C {
	//인터페이스는 메소드 선언만 가능, 구현은 불가능
	public void showMessage2();
}

public class 복습 {

	public static void main(String[] args) {
		
		B b = new B(); //B클래스 호출(B클래스 객체 생성)
		//B클래스는 부모의 필드변수와 메소드를 사용할 수 있음
		b.showMessage();
		b.x = 10;
		b.showMessage2();
		
	}

}
