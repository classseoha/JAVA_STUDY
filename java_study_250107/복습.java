package java_study_250107;

import java.util.ArrayList;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
}
public class 복습 {
	
	public static void main(String[] args) {
		/*
		 * 제네릭과 컬렉션즈
		 * ArrayList, HashMap만 제대로 알면 됨(HashSet도 가끔 쓰긴하는데 코딩테스트할 때 조금 사용하는 정도)
		 */
		// <>: 제네릭
		ArrayList<Book> bookList = new ArrayList<>(); 
		
		//Book 추가하기
		bookList.add(new Book("A도서", "홍길동")); //new로 추가(변수 생성없이)
		
		Book book = new Book("B도서", "홍길순");
		bookList.add(book); //Book 변수 생성 후 추가
		
		//Book 조회하기
		for(Book b : bookList) {
			System.out.println("제목: " + b.getTitle() + ", 저자: " + b.getAuthor());
		}
		
		//특정 Book 조회
		Book book1 = bookList.get(1); //첫번쨰 저장된 Book 가져오기
		System.out.println("제목: " + book1.getTitle() + ", 저자: " + book1.getAuthor());
		
		//List 사이즈 조회
		System.out.println("개수: " + bookList.size());
	}

}
