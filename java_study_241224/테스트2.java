package java_study_241224;

class Book {
	private String title; //제목
	private int price; //가격

	public Book(String title, int price) { //생성자로 필드변수 초기화
		this.title = title;
		this.price = price;
	}
	public void showBook() {
		System.out.println(this.title + "의 가격은 " + this.price + "원입니다.");
	}
	public int getPrice() {
		return this.price;
	}
	public String getTitle() {
		return this.title;
	}
}

public class 테스트2 {

	public static void main(String[] args) {
		
		//객체 배열(동일한 데이터 타입을 저장하는 공간 or 자료구조)
		//자바는 객체도 데이터타입(자바는 일반 데이터타입(int, double, boolean...) + 객체(클래스, 래퍼런스)
		int[] arr = new int[10]; //저장 공간이 10개인 int형 배열
		String[] strArr = new String[10]; //저장 공간이 10개인 String형 배열
		
		Book[] bookArr = new Book[10]; //저장 공간이 10개인 Book 타입 배열 
		//배열에 데이터 넣기
		Book book1 = new Book("자바의 정석", 30000);
		Book book2 = new Book("파이썬 기초", 25000);
		Book book3 = new Book("알고리즘 입문", 40000);
		
		bookArr[0] = book1; 
		bookArr[1] = book2; 
		bookArr[2] = book3; 
		bookArr[0].showBook(); 
		bookArr[1].showBook(); 
		bookArr[2].showBook(); 
		System.out.println("=========================================");
		
		for(int i = 0; i < 3; i++) {
			bookArr[i].showBook();
		}
		System.out.println("=========================================");
		
		for(int i = 0; i < 3; i++) {
			if(bookArr[i].getPrice() >= 30000) {
				bookArr[i].showBook();
			}
		}
		System.out.println("=========================================");
		
		for(int i = 0; i < 3; i++) {
			if(bookArr[i].getTitle().equals("파이썬 기초")) {
				bookArr[i].showBook();
			}
		}
		
		Object[] bookArr2 = new Object[10]; //Object 배열에 Book 대입 가능
		
		bookArr2[0] = book1;
		
	}
}
