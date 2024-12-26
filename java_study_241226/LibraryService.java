package java_study_241226;

//인터페이스는 '기능 선언'만 가능
//인터페이스 명명규칙으로 보통 뒤에 'Service'를 붙임 
//순서: 인터페이스를 가장 먼저 구현
public interface LibraryService {
	void addBook(Book book); //도서 추가
	void searchBook(String keyword); //도서 검색
}
