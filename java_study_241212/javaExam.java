package java_study_241212;

class Calculator {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int calculateAverage(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum / arr.length;
	}
	
}

class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class javaExam {

	public static void main(String[] args) {
		
		//문제1. 클래스 내에서 같은 이름의 메소드를 여러 개 정의하는 것을 무엇이라고 하는가? 오버로딩
		
		//문제2. 객체의 필드 값을 반환하는 메소드를 일반적으로 무엇이라고 부르는가? getter
		
		//문제3. Java에서 메소드의 반환 타입을 지정하지 않을 때 사용하는 키워드는? void
		
		//문제4. 다음 중 올바른 메소드 선언은? public void myMethod() { }
		
		//문제5. 메소드 오버로딩(Overloading)에 대한 설명으로 옳은 것은? 같은 이름의 메소드를 여러 개 정의하는 것

		//문제6. 다음 중 메소드의 반환 타입을 올바르게 설명한 것은? 메소드가 반환하는 값의 데이터 타입을 나타낸다.
		
		//문제7. 다음 중 메소드의 매개변수 전달 방식에 대한 설명으로 옳은 것은? 기본 자료형은 값에 의한 전달(Pass by Value)이다
		
		//문제8. Calculator 클래스를 생성 후
		//두 정수를 매개변수로 받아 그 합을 반환하는 메소드 add를 작성하세요.
		
		//문제9. [문제8]에 생성한 클래스에서 정수 배열을 매개변수로 받아 그 배열의 모든 요소의 
		//평균을 계산하여 반환하는 메소드 calculateAverage를 작성하세요.
		
		//문제10. 객체를 생성할 때 사용하는 키워드는? new
		
		//문제11. 클래스의 주요 구성 요소가 아닌 것은? 루프
		
		//문제12. 클래스 내에서 데이터를 저장하는 변수를 무엇이라고 하는가? 필드
		
		//문제13. 클래스의 인스턴스를 생성할 때 자동으로 호출되는 특별한 메소드는? 생성자
		
		//문제14. "Book" 클래스를 정의하고, 제목(title)과 저자(author)를 속성으로 추가한 후,
		//이 클래스의 객체를 생성하는 코드를 작성하세요.
		Book book = new Book("어린왕자", "생택쥐페리");
		System.out.println("책제목: " + book.title + "\n저자: " + book.author);
		
	}

}
