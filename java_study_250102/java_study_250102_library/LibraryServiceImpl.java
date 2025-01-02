package java_study_250102_library;

import java.util.ArrayList;

public class LibraryServiceImpl implements LibraryService{

	   private ArrayList<Book> books;
	   
	   public LibraryServiceImpl() {
	      books = new ArrayList<>();
	   }
	   
	   @Override
	   public void addBook(Book book) {
	      books.add(book); //ArrayList에 book 추가 (도서 추가)
	      System.out.println("도서가 추가되었습니다.");
	   }

	   @Override
	   public void searchBook(String keyword) { //도서 검색
	      boolean isSearch = false;
	      for(Book book : books) {
	         //퀴즈 : 로직구현 (26일 소스를 참고해서 풀어보세요)
	         //contains 활용하기
	         if(book.getTitle().contains(keyword) || 
	            book.getAuthor().contains(keyword) ||
	            book.getIsbn().contains(keyword)){
	            System.out.println(book.getTitle()+", " + book.getAuthor());
	            isSearch = true; //플래그값 수정
	         }
	      }
	      if(!isSearch) {
	         System.out.println("검색 결과가 없습니다.");
	      }
	      
	   }

	   @Override
	   public void removeBook(String isbn) {
	      for(int i=0; i<books.size(); i++) {
	         Book book = books.get(i);
	         if(book.getIsbn().equals(isbn)) {//도서 고유번호가 같다면
	            books.remove(i);//해당 도서 제거
	            System.out.println("도서가 삭제되었습니다.");
	         }
	      }
	   }

	   @Override
	   public ArrayList<Book> getAllBooks() {
	      return new ArrayList<>(books); //books ArrayList 리턴
	   }

	}
