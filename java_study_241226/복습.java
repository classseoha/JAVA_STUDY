package java_study_241226;

class Book_ {
	String title;
	int price;
	
	public Book_(String title, int price) { //파라미터에 있는 title과 price도 지역변수
		this.title = title;
		this.price = price;
	}
	
	public void showBook() {
		String author = "작자미상"; //지역변수는 showBook메소드 안에서만 사용 가능
		System.out.println("title: " + title); //메소드 안에서 전역변수 접근 가능
		System.out.println("price: " + price);
	}
	
	public void showAuthor() {
		String author = "작자미상";
		int price = 100; //지역변수 price
		System.out.println("author: " + author);
		System.out.println("price: " + this.price); //전역변수 price
	}
}

public class 복습 {

	public static void main(String[] args) {
		
		//자바는 클래스(객체)도 데이터 타입이다.
		Book_[] bookList = new Book_[2]; //Book 타입을 저장하는 배열
		
		Book_ book1 = new Book_("자바의 정석", 2000);
		bookList[0] = book1; //0번 인덱스에 book1 대입
		bookList[1] = new Book_("파이썬의 정석", 1000); 
		
		for(Book_ b : bookList) { //첫번째 향상된 for문
			b.showBook();
		}
		
		for(int i = 0; i < 2; i++) { //두번째 방법
			bookList[i].showBook();
		}
		System.out.println("==========================");
		//문제1. 책 제목이 자바의 정석인 책의 정보(showBook)를 출력하기
		for(Book_ b : bookList) {
			if(b.title.equals("자바의 정석")) {
				b.showBook();
			}
		}
		//문제2. bookList에 저장된 책의 총 price는 얼마인지 구하기
		int sum = 0;
		for(Book_ b : bookList) {
			sum += b.price;
		}System.out.println("합: " + sum);

	}

}
