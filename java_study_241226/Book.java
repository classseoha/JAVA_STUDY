package java_study_241226;

//순서: 2-1번째
//DTO(Data Transfer Object) 클래스
//DTO는 변수만, 그 변수를 초기화 해주는 생성자 혹은 getter & setter
public class Book { //Book에 관련된 정보들만 작성합니다.
	private String title; //제목
	private String author; //저자
	private String isbn; //도서 고유번호
	
	//생성자로 전역변수(필드변수) 초기화
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String toString() { //도서출력
		return "제목: " + title + ", 저자: " + author + ", 고유번호: " + isbn; 
	}
}
