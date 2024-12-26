package java_study_241226;

//인터페이스를 구현할 클래스 명명규칙: 맨뒤에 Impl(implement)이라고 작성한다.
//순서: 2-2번째
public class LibraryServiceImpl implements LibraryService {
	private Book[] books; //Book 타입을 저장하는 클래스 배열
	private int bookCount;
	
	public LibraryServiceImpl(int capacity) { //생성자로 전역변수 값 초기화
		books = new Book[capacity];
		bookCount = 0;
	}

	@Override
	public void addBook(Book book) { //도서추가 재정의
		if(bookCount < books.length) {
			books[bookCount] = book; //Book 배열에 대입
			bookCount++; //1씩 카운트 증가
			System.out.println(book.getTitle() + " 도서가 추가되었습니다.");
		}else {
			System.out.println("도서가 가득 찼습니다.");
		}
	}

	@Override
	public void searchBook(String keyword) { //도서검색 재정의
		//도서 제목으로 검색하는 로직 구현
		//keyword가 제목 or 저자 or 고유번호
		//contains: 해당 문자가 포함하는지 여부를 true or false로 반환
		boolean isFlag = false;
		for(int i = 0; i < bookCount; i++) {
			if(books[i].getTitle().contains(keyword) ||
			   books[i].getAuthor().contains(keyword) ||
			   books[i].getIsbn().contains(keyword)) {
				System.out.println(books[i].toString()); //해당 도서 출력
				isFlag = true;
			}
		}
		if(!isFlag) {
			System.out.println("검색 결과가 없습니다.");
		}
	}
}
