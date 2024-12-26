package java_study_241226;

import java.util.Scanner;

//순서: 마지막, 메인함수 만들어서 출력해보기
public class LibraryMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LibraryService library = new LibraryServiceImpl(10); //인터페이스 타입으로 선언
		
		while(true) { //무한반복
			System.out.println("=== 도서관리 프로그램 ===");
			System.out.println("원하는 업무를 선택하세요.");
			System.out.println("[1]도서추가 [2]도서검색 [3]시스템종료");
			System.out.print("번호 입력: ");
			int choice = scan.nextInt();
			scan.nextLine(); //버퍼지우기
			
			if(choice == 1) { //도서추가
				System.out.print("제목 입력: ");
				String title = scan.nextLine();
				System.out.print("저자 입력: ");
				String author = scan.nextLine();
				System.out.print("고유번호 입력: ");
				String isbn = scan.nextLine();
				library.addBook(new Book(title, author, isbn)); //도서추가 로직
			}else if(choice == 2) { //도서검색
				System.out.print("검색어: ");
				String keyword = scan.nextLine();
				library.searchBook(keyword);
			}else if(choice == 3) { //시스템종료
				System.out.println("시스템을 종료합니다.");
				scan.close(); //스캐너 종료
				System.exit(0); //콘솔 강제종료
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
			}
		}
	}
}
